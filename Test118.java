
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            for(int a=0; a<=100; a++){
                for(int b=0; b<=100; b++){
                    int c = 100-a-b;
                    if(c%3==0 && a*5+b*3+c/3==100){
                        System.out.print(a+" "+b+" ");
                        System.out.println(c);
                    }
                }
            }
        }
    }
}