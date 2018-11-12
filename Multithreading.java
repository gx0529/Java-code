package www.bit.java.util;

class MyThread extends Thread{ //线程主体类
    private String title;
    public MyThread(String title) {
        this.title = title;
    }
    @Override
    public void run() {
        for(int i=0; i<200; i++){
            System.out.println(this.title+",i="+i);
        }
    }
}
public class Test1{
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("myThread1");
        MyThread myThread2 = new MyThread("myThread2");
        MyThread myThread3 = new MyThread("myThread3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}



