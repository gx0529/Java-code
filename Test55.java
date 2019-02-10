package www.bit.java;


import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName()+"、"+i);
        }
    }
}
public class Test2{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(3,5,2000,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<Runnable>());
        for(int i=0; i<5; i++){
            threadPoolExecutor.execute(myThread);
        }
    }
}














