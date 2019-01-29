package www.bit.java;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Goods{
    private String name;
    //当前商品数量
    private int count;
    private int maxCount;
    private Lock lock = new ReentrantLock();

    //消费者等待队列
    private Condition consumerCondition = lock.newCondition();
    //生产者等待队列
    private Condition producerCondition = lock.newCondition();
    public Goods(int maxCount) {
        this.maxCount = maxCount;
    }

    public void setGoods(String name){
        lock.lock();
        try {
            //商品数量达到最大值，生产者线程进入生产者等待队列
            while(count == maxCount){
                try {
                    System.out.println(Thread.currentThread().getName()+"还有很多商品，歇会~");
                    producerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.name = name;
            count++;
            System.out.println(Thread.currentThread().getName()+"生产"+toString());
            //唤醒处于消费者队列的线程
            consumerCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", count=" + count+
                '}';
    }

    public void getGoods(){
        try {
            lock.lock();
            while(count == 0){
                System.out.println(Thread.currentThread().getName()+"还没有商品");
                try {
                    consumerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
            System.out.println(Thread.currentThread().getName()+"消费"+toString());
        } finally {
            lock.unlock();
        }
    }
}

class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            this.goods.setGoods("生产口红一套");
        }
    }
}

class Consumer implements Runnable{
    private Goods goods;

    @Override
    public void run() {
        while(true){
            this.goods.getGoods();
        }
    }

    public Consumer(Goods goods) {
        this.goods = goods;
    }
}

public class Test3{
    public static void main(String[] args) {
        Goods goods = new Goods(20);
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        List<Thread> list = new ArrayList<>();
        //启动10个消费者线程
        for(int i=0; i<10; i++){
            Thread thread = new Thread(consumer,"消费者"+i);
            list.add(thread);
        }
        //启动5个生产者
        for(int i=0; i<5; i++){
            Thread thread = new Thread(producer,"生产者"+i);
            list.add(thread);
        }
        for(Thread th : list){
            th.start();
        }
    }
}