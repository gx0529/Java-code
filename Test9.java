package www.bit.java;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        if(this == obj){
            return true;
        }
        Person per = (Person) obj;
        return this.age == per.age && this.name.equals(per.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test2{
    public static void main(String[] args) throws Exception {
        Person per1 = new Person("张三",18);
        Person per2 = new Person("李四",20);
        Person per3 = new Person("王五",40);
        List<Person> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        list.add(per3);
        System.out.println(list.contains(new Person("李四",20)));
        list.remove(new Person("王五",40));
        System.out.println(list);
    }
}