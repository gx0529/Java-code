
@FunctionalInterface
interface IMessage{
    void print();
}
interface IAdd{
    int add(int x, int y);
}
public class Test1{
    public static void main(String[] args) {
        IMessage msg = () -> System.out.println("hello world");
        msg.print();
        IAdd add = (x,y) -> x+y;
        System.out.println(add.add(10,20));
        IAdd add1 = (x,y) -> {
            int result = x+y;
            result += 20;
            return result;
        };
        System.out.println(add1.add(10,20));
    }
}