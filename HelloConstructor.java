
class Test{
    public Test(){
        System.out.println("Hello Constructor");
    }
    public Test(String s){
        this();
        System.out.println(s);
    }
}
public class HelloConstructor{
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test("好好学习");
    }
}


