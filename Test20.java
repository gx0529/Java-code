class Person{

    public String name;

    public int age;

    public void eat(){

        System.out.println(name+"吃饭");

    }

    public void sleep(){

        System.out.println(name+"睡觉");

    }

    public void work(){

        if(age<20){

            System.out.println(name+"老老实实读书");

        }

        else{

            System.out.println(name+"老老实实搬砖");

        }

    }

}

public class test{

    public static void main(String[] args){

        //根据Person类生产一个对象

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