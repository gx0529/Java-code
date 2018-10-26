
class Father{
    private String name = "zhangjun";
    class Child{
        public void introFather(){
            System.out.println(name);
        }
    }
    public void fun(){
        Child child = new Child();
        child.introFather();
    }
}
public class test{
    public static void main(String[] args){
        Father father = new Father();
        father.fun();
    }
} 