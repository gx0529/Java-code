package www.bit.java.util;

public class Test1{
    public static void main(String[] args) {
        int[] people = new int[10];
        //给每个人编号
        for(int i=0; i<people.length; i++){
            people[i] = i+1;
        }
        //报数标志
        int flag = 0;
        //退出人数
        int quitPeople = 0;
        //计数器
        int i = 0;
        while(quitPeople < 9){
            if(people[i]!=0){
                //该编号的人还在圈中
                flag++;
            }
            if(flag == 3){
                flag = 0;
                people[i] = 0;
                quitPeople++;
            }
            i++;
            if(i == 10){
                i = 0;
            }
        }
        for(int j=0; j<10; j++){
            if(people[j]!=0){
                System.out.println(j+1);
            }
        }
    }
}


