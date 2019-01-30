public class Test3{

    //1.volatile修饰的变量是多线程可见

    //2.volatile修饰的变量进行运算，不保证原子性

    private static volatile int num = 0;

    public static void increment(){

        num++;

    }

    public static void main(String[] args) {

        Thread[] thread = new Thread[10];

        for(int i=0; i<10; i++){

            thread[i] = new Thread(new Runnable() {

                @Override

                public void run() {

                    for (int i=0; i<10; i++){

                        increment();

                    }

                }

            });

            thread[i].start();

        }

        while(Thread.activeCount()>2){

            Thread.yield();

        }

        System.out.println(num);

    }

}