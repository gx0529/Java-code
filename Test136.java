��Ŀ�������𳵽�վ
	����һ��������N�����������0<N<10���������������վ�����У�
һ��N���𳵣�ÿ����������1-9��š�Ҫ�����ֵ�����������𳵳�վ�����кš� 

��������:
	�ж������������ÿһ���һ������һ��������N��0<N<10�����ڶ��а���N������������ΧΪ1��9��
�������:
	������ֵ����С��������Ļ𳵳�վ���кţ�ÿ������Կո������ÿ��������л��У������sample��
ʾ��1
	���룺3
	      1 2 3
	���
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