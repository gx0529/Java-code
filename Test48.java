package www.bit.java;

enum Sex{
    MALE("男"),FEMALE("女");
    private String title;

    private Sex(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

class Person1{
    private String name;
    private int age;
    private Sex sex;

    public Person1(String name, int age, Sex sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

public class Test2{
    public static void main(String[] args) {
        Person1 per = new Person1("张三",20,Sex.FEMALE);
        System.out.println(per);
    }
}













