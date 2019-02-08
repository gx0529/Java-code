package www.bit.java;

class Pen{
    private Pen pen;
    public Pen getPen() {
        return pen;
    }
}

class Book{
    private Book book;
    public Book getBook() {
        return book;
    }
}

public class Test2{
    private static Pen pen = new Pen();
    private static Book book = new Book();
    public static void main(String[] args) {
        new Test2().test();
    }
    public void test(){
        Thread thread1 = new Thread(()->{
            synchronized (pen){
                System.out.println("我有笔,把你的本子给我");
                synchronized (book){
                    System.out.println("把你的本子给我");
                }
            }
        });

        Thread thread2 = new Thread(()->{
            synchronized (book){
                System.out.println("我有本子,把你的笔给我");
                synchronized (pen){
                    System.out.println("把你的笔给我");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}














