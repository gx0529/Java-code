package www.bit.java;

import java.util.Scanner;

class Student{
    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}

public class Test3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //一共有多少个人
            int N = Integer.parseInt(scanner.nextLine());
            //判断是从大到小还是从小到大
            int m = Integer.parseInt(scanner.nextLine());
            Student[] students = new Student[N];
            for(int i=0; i<N; i++){
                String str = scanner.nextLine();
                String name = str.split(" ")[0];
                Integer age = Integer.parseInt(str.split(" ")[1]);
                Student stu = new Student(name,age);
                students[i] = stu;
            }
            //判断排序方式
            if(m == 0){//从大到小
                for(int i=0; i<N; i++){    //采用冒泡法排序
                    for(int j=0; j<N-i-1; j++){
                        if(students[j+1].getScore() > students[j].getScore()){
                            swap(students,j,j+1);
                        }
                    }
                }
            }else{//从小到大
                for(int i=0; i<N; i++){    //采用冒泡法排序
                    for(int j=0; j<N-i-1; j++){
                        if(students[j+1].getScore() < students[j].getScore()){
                            swap(students,j,j+1);
                        }
                    }
                }
            }
            //循环打印出结果
            for(Student s:students){
                System.out.println(s.getName()+" "+s.getScore());
            }
        }
    }

    public static void swap(Student[] students, int p, int q){
        Student temp = students[p];
        students[p] = students[q];
        students[q] = temp;
    }
}