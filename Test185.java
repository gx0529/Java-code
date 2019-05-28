¼ÆËãÌÇ¹û

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int m3 = scanner.nextInt();
            int m4 = scanner.nextInt();
            int A = (m1+m3)/2;
            int B = (m2+m4)/2;
            int C = (m4-m2)/2;
            if(A-B==m1 && B-C==m2 && A+B==m3 && B+C==m4){
                System.out.println(A+" "+B+" "+C);
            } else{
                System.out.println("No");
            }
        }
    }
}