
//��ʹ���ڲ�������������˽������
class Outter{
    private String msg = "Outter�е��ַ���";
    public String getMsg(){
        return this.msg;
    }
    public void test(){
        //��ʱ��this������main�����е���test�Ķ���
        Inner in = new Inner(this);
        in.fun();
    }
}

class Inner{
    private Outter out;
    //Inner.out = main.out
    public Inner(Outter out){
        //���ô���
        this.out = out;
    }
    public void fun(){
        System.out.println(out.getMsg());
    }
}
public class Test2{
    public static void main(String[] args){
        //ʵ����Outter�����
        Outter out = new Outter();
        //����Outter�෽��
        out.test();
    }
}



//ʹ���ڲ�������ⲿ���˽������
class Outter{
    private String msg = "Outter�е��ַ���";
    class Inner{
        private String inMsg = "Inner�е��ַ���";
        public void fun(){
            System.out.println(msg);
        }
    }
    public void Test(){
        //�����ڲ������
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