class Person{

    public String name;

    public int age;

    public void eat(){

        System.out.println(name+"�Է�");

    }

    public void sleep(){

        System.out.println(name+"˯��");

    }

    public void work(){

        if(age<20){

            System.out.println(name+"����ʵʵ����");

        }

        else{

            System.out.println(name+"����ʵʵ��ש");

        }

    }

}

public class test{

    public static void main(String[] args){

        //����Person������һ������

        Person per1 = new Person();

        per1.name = "guo";

        per1.age = 18;

        Person per2 = new Person();

        per2.name = "sun";

        per2.age = 40;

        per1.eat();

        per1.sleep();

        per1.work();

        per2.eat();

        per2.sleep();

        per2.work();

    }

}