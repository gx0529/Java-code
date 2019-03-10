
import java.util.Scanner;

/**
 * Created by hunter on 2019/3/10
 */
public class Test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNextLine()){
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(findSum(n, m));
        }
    }
    public static int findSum(int a, int b){
        for(int i=1; ; i++){
            int temp = a*i;
            if(temp%b == 0){
                return temp;
            }
        }
    }
}

