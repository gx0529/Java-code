package www.bit.java;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface ISubject{
    void eat(int count);
}
class RealSubject implements ISubject{
    @Override
    public void eat(int count) {
        System.out.println("吃"+count+"钱签佰度");
    }
}
class ProxySubject implements InvocationHandler{
    private Object realObject;

    /**
     * 绑定真实主题类
     * @param realObject
     * @return  代理类
     */
    public Object bind(Object realObject){
        this.realObject = realObject;
        return Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(),this);
    }
    public void before(){
        System.out.println("eat before");
    }
    public void after(){
        System.out.println("eat after");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        //调用真实主题类方法
        Object result = method.invoke(realObject,args);
        this.after();
        return result;
    }
}
public class Test2{
    public static void main(String[] args) {
        ISubject subject = (ISubject) new ProxySubject().bind(new RealSubject());
        subject.eat(100);
    }
}