package www.bit.java;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

class Teacher implements Serializable{
    private String name;
    private String job;

    public Teacher(String name, String job) {
        this.name = name;
        this.job = job;
    }

//    public Teacher clone(){
//        Teacher teacher = null;
//        try {
//            teacher = (Teacher) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return teacher;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

class Student implements Serializable {
    private String name;
    private int age;
    private Teacher teacher;

    public Student(String name, int age, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    public Student cloneObject() throws Exception {
        //通过内存进行序列化的读取与写入
        //获取内存流
        ByteOutputStream bos = new ByteOutputStream();
        //获取序列化的两个核心类
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Student) ois.readObject();
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

public class Test3{
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("张三","Java Teacher");
        Student student = new Student("李四",18,teacher);
        Student studentClone = student.cloneObject();
        System.out.println(teacher == studentClone.getTeacher());
    }
}


