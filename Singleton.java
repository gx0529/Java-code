package www.bit.java.util;

//饿汉式单例
class Singleton{
    //类内部产生实例化对象，只在类加载的时候产生一个
    private static final Singleton SINGLETON = new Singleton();
    //构造方法私有化，类外部无法产生实例化对象
    private Singleton(){}
    //通过类名调用
    public static Singleton getSingleton(){
        return SINGLETON;
    }
    public void test(){
        System.out.println(this);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        singleton.test();
        singleton1.test();
    }
}

////懒汉式单例
//class Singleton{
//    //类内部产生实例化对象
//    private static Singleton SINGLETON;
//    //构造方法私有化，类外部无法产生实例化对象
//    private Singleton(){}
//    //通过类名调用
//    public static Singleton getSingleton(){
//        if(SINGLETON == null){
//            SINGLETON = new Singleton();
//        }
//        return SINGLETON;
//    }
//    public void test(){
//        System.out.println(this);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getSingleton();
//        Singleton singleton1 = Singleton.getSingleton();
//        singleton.test();
//        singleton1.test();
//    }
//}