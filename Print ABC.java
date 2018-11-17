package www.bit.java;

//编写一个程序，启动三个线程，三个线程的名称分别是 A，B，C；
//每个线程将自己的名称在屏幕上打印5遍，打印顺序是ABCABC...
class Print{
    private int flag = 1;
    private int count = 0;


    public synchronized void printA(){
        while(flag != 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 2;
        count++;
        notifyAll();
    }

    public synchronized void printB(){
        while(flag != 2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 3;
        count++;
        notifyAll();
    }

    public synchronized void printC(){
        while(flag != 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 1;
        count++;
        notifyAll();
    }

    public int getCount() {
        return count;
    }
}

class MyThread implements Runnable{
    private Print print;
    public MyThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        while(print.getCount() < 16){
            if(Thread.currentThread().getName().equals("A")){
                print.printA();
            }else if (Thread.currentThread().getName().equals("B")){
                print.printB();
            }else if (Thread.currentThread().getName().equals("C")){
                print.printC();
            }
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        Print print = new Print();
        MyThread myThread = new MyThread(print);
        Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
