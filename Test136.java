题目描述：火车进站
	给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，
一共N辆火车，每辆火车以数字1-9编号。要求以字典序排序输出火车出站的序列号。 

输入描述:
	有多组测试用例，每一组第一行输入一个正整数N（0<N<10），第二行包括N个正整数，范围为1到9。
输出描述:
	输出以字典序从小到大排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行，具体见sample。
示例1
	输入：3
	      1 2 3
	输出
	      1 2 3
	      1 3 2
	      2 1 3
	      2 3 1
	      3 2 1


import java.util.*;

public class Test3 {
    private static Stack<String> stack1=new Stack<String>();
    private static Stack<String> stack2=new Stack<String>();
    private static List<String> list=new ArrayList<String>();

    public static void ff(String str){
        if(stack1.isEmpty() && stack2.isEmpty()){
            list.add(str.trim());
            return;
        }
        if(!stack2.isEmpty()){
            String str1=stack2.pop();
            ff(str+" "+str1);
            stack2.push(str1);
        }
        if(!stack1.isEmpty()){
            String str2=stack1.pop();
            stack2.push(str2);
            ff(str);
            stack2.pop();
            stack1.push(str2);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            scanner.nextLine();
            String str=scanner.nextLine();
            String[] ss=str.split(" ");
            for(int i=ss.length-1;i>=0;i--) {
                stack1.push(ss[i]);
            }
            ff("");
            Collections.sort(list);
            for(String s:list) {
                System.out.println(s);
            }
        }

    }
}