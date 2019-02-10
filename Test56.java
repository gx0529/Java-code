package www.bit.java;


import java.util.concurrent.*;

class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName()+"、"+i);
        }
        return Thread.currentThread().getName()+"任务执行完毕";
    }
}
public class Test2{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(3,5,2000,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<Runnable>());
        for(int i=0; i<5; i++){
            Future<String> future = threadPoolExecutor.submit(myThread);
            try {
                String str = future.get();
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}














