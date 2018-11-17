package www.bit.java;

//写两个线程，一个线程打印 1~52，另一个线程打印A~Z，
//打印顺序是12A34B...5152Z；
class Print{
    private int flag = 1;
    private int count = 1;
    public synchronized void printNum(){
        while(flag != 1){
            //此时应该打印字母
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(2*count-1);
        System.out.print(2*count);
        flag = 2;
        notify();
    }
    public synchronized void printChar(){
        while(flag != 2){
            //此时应该打印数字
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char)(count-1+'A'));
        flag = 1;
        count++;
        notify();
    }
}
public class Test2 {
    public static void main(String[] args) {
        Print print = new Print();
        new Thread(()->{
            for(int i=0; i<26; i++){
                print.printNum();
            }
        }).start();
        new Thread(()->{
            for(int i=0; i<26; i++){
                print.printChar();
            }
        }).start();
    }
}
