
题目描述
有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，
假如兔子都不死，问每个月的兔子总数为多少？

输入描述:
输入int型表示month

输出描述:
输出兔子总数int型


import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int result = fun(n);
            System.out.println(result);
        }
    }
    public static int fun(int num) {
        if(num==0)
            return 0;
        else if(num == 1)
            return 1;
        else
            return fun(num-1)+fun(num-2);
    }
}

