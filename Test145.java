
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            int N = scanner.nextInt();
            int a = 0;
            int b = 1;
            int sum = 0;
            int temp = 0;
            while(N > sum){
                temp = sum;
                sum = a + b;
                a = b;
                b = sum;
            }
            int m = Math.abs(N-temp);
            int n = Math.abs(N-sum);
            System.out.println(m > n ? n : m);
        }
    }
}