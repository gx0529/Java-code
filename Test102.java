
��Ŀ����

�������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����
������������ģ���ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3�� ����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����


��������:

���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����


�������:

����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵��
�����ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж����
��Ҫ���С����������һ���������֮����һ���ո����;
��������ķ�Χ�ڲ�����ˮ�ɻ����������no;ÿ������ʵ�������ռһ�С�

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            
            List<Integer> list = new ArrayList<>();
            for(int i=m; i<=n; i++){
                if(isNum(i)){
                    list.add(i);
                }
            }
            
            if(list.size() == 0){
                System.out.println("no");
            }else{
                for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
            }
        }
    }

    public static boolean isNum(int num){
        int a = num / 100;
        int b = (num/10)%10;
        int c = num % 10;
        int sum = a*a*a + b*b*b + c*c*c;
        if(num == sum){
            return true;
        }
        return false;
    }
}