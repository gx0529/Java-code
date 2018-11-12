package www.bit.java.util;

class MyThread implements Runnable{ //线程主体类
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
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}



