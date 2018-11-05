package www.bit.java.util;

/**
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 */

public class Test1{
    public static void main(String[] args) {
        System.out.println("第一天摘桃子的个数："+getPeach(10));
    }
    public static int getPeach(int day){
        int count = 0;
        while(day != 0){
            count = count*2+1;
            day--;
        }
        return count;
    }
}

