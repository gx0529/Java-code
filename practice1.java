package www.bit.java.util;

/**
 *编程题:
 * 要求:
 * 1).Person类有name,age,salary属性，要求实现至少两个构造方法，并且属性私有，提供对应的getter、setter。
 * 2).覆写toString方法，要求在System.out.println()函数中传递Person对象能打印出三个属性值而不是对象地址。
 * 3).覆写equals方法，要求两个Person类对象的值相同时返回true。
 */

class Person{
    private String name;
    private int age;
    private double salary;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString(){
        return "姓名："+name+"、年龄："+age+"、工资："+salary;
    }
    public boolean equals(Object obj) {
        //判断obj是否为Person类实例
        if(!(obj instanceof Person)){
            return false;
        }
        //是一个类但不是一个实例
        if(obj == this){
            return true;
        }
        //向下转型，取得Person类的属性
        Person per = (Person) obj;
        return per.name.equals(this.name)
                && (per.age == this.age)
                && (per.salary == this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Test1{
    public static void main(String[] args) {
        Person per1 = new Person("zhangsan",20);
        Person per2 = new Person("zhangsan",20);
        System.out.println(per1);  //将会覆写toString()方法
        System.out.println(per2);
        System.out.println(per1.equals(per2));
    }
}