��Ŀ���������Һ�����

��Ŀ���������⣨�û����ɼ������У����Ի�óɼ��Ӹߵ��ͻ�ӵ͵��ߵ�����,��ͬ�ɼ�
      ������¼��������ǰ�Ĺ�����
   ��ʾ��
   jack      70
   peter     96
   Tom       70
   smith     67
   �Ӹߵ���  �ɼ�            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   �ӵ͵���
   smith     67  
   Tom       70    
   jack      70    
   peter     96      

��������:
	������У�������Ҫ������˵ĸ�����Ȼ��ֱ��������ǵ����ֺͳɼ�����һ���ո����
�������:
	����ָ����ʽ������ֺͳɼ������ֺͳɼ�֮����һ���ո����


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
            //һ���ж��ٸ���
            int N = Integer.parseInt(scanner.nextLine());
            //�ж��ǴӴ�С���Ǵ�С����
            int m = Integer.parseInt(scanner.nextLine());
            Student[] students = new Student[N];
            for(int i=0; i<N; i++){
                String str = scanner.nextLine();
                String name = str.split(" ")[0];
                Integer age = Integer.parseInt(str.split(" ")[1]);
                Student stu = new Student(name,age);
                students[i] = stu;
            }
            //�ж�����ʽ
            if(m == 0){//�Ӵ�С
                for(int i=0; i<N; i++){    //����ð�ݷ�����
                    for(int j=0; j<N-i-1; j++){
                        if(students[j+1].getScore() > students[j].getScore()){
                            swap(students,j,j+1);
                        }
                    }
                }
            }else{//��С����
                for(int i=0; i<N; i++){    //����ð�ݷ�����
                    for(int j=0; j<N-i-1; j++){
                        if(students[j+1].getScore() < students[j].getScore()){
                            swap(students,j,j+1);
                        }
                    }
                }
            }
            //ѭ����ӡ�����
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