public class Test3{

    //1.volatile���εı����Ƕ��߳̿ɼ�

    //2.volatile���εı����������㣬����֤ԭ����

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