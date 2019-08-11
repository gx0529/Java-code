
网

小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，
只提供6个每袋和8个每袋的包装(包装不可拆分)。 
可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
如果不能购买恰好n个苹果，小易将不会购买。

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            int n = in.nextInt();
            System.out.println(num(n));
        }
    }
    public static int num(int n){
        if(n%8==0){
            return n/8;
        } else if(n%8==4 || n%8==6 || n%8==2){
            return n/8+1;
        } else{
            return -1;
        }
    }
}