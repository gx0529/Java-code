题目描述：百万富翁问题
一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。
该计划如下：我每天给你10 万元，你第一天给我1 分钱，第二天2 分钱，
第三天4 分钱……
这样交换 30 天后，百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）


public class Main{
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<30;i++){
            sum += Math.pow(2,i);
        }
        System.out.print(30*10+" "+sum);
    }
}