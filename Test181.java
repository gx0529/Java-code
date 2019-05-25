
买苹果

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(count(num));
        }
    }
    public static int count(int num){
        //一定要是偶数，最小是6,10以上偶数都可以
        if(num%2!=0 || num==10 || num<6){
            return -1;
        }
        //如果拿8个刚好拿完
        if(num % 8 == 0){
            return num/8;
        }
        //此时就要从前面的1个或者两个8中取出2个苹果，将余数补为6
        return num/8+1;
    }
}