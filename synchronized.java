package www.bit.java;

class Sync{
    //此时锁的是下方代码段
    public static synchronized void test(){
        System.out.println(Thread.currentThread().getName()+"方法开始...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"方法结束");
    }
}
class MyThread implements Runnable{
    public void run(){
        Sync sync = new Sync();
        sync.test();
    }
}

public class Test2{
    public static void main(String[] args) {
        MyThread mt= new MyThread();
        for(int i=0; i<3; i++){
            new Thread(mt,"线程"+i).start();
        }
    }
}

