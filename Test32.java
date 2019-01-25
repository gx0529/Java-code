
//不使用内部类访问其他类的私有属性
class Outter{
    private String msg = "Outter中的字符串";
    public String getMsg(){
        return this.msg;
    }
    public void test(){
        //此时的this就是在main方法中调用test的对象
        Inner in = new Inner(this);
        in.fun();
    }
}

class Inner{
    private Outter out;
    //Inner.out = main.out
    public Inner(Outter out){
        //引用传递
        this.out = out;
    }
    public void fun(){
        System.out.println(out.getMsg());
    }
}
public class Test2{
    public static void main(String[] args){
        //实例化Outter类对象
        Outter out = new Outter();
        //调用Outter类方法
        out.test();
    }
}



//使用内部类访问外部类的私有属性
class Outter{
    private String msg = "Outter中的字符串";
    class Inner{
        private String inMsg = "Inner中的字符串";
        public void fun(){
            System.out.println(msg);
        }
    }
    public void Test(){
        //生产内部类对象
        Inner in = new Inner();
        in.fun();
    }
}
public class test{
    public static void main(String[] args){
        Outter out = new Outter();
        out.Test();
    }
}