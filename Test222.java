
����������



һ������������һ��İ���ˣ�İ��������̸��һ����Ǯ�ļƻ���
�üƻ����£���ÿ�����10 ��Ԫ�����һ�����1 ��Ǯ���ڶ���2 ��Ǯ��
������4 ��Ǯ����

�������� 30 ��󣬰����̽����˶���Ǯ��İ���˽����˶���Ǯ����ע��һ������Ԫ��һ���Ƿ֣�

public class Main{
    public static void main(String[] args){
        int money1 = 10 * 30;
        int money2 = 1;
        for(int i=1; i<30; i++){
            money2 += (int)Math.pow(2,i);
        }
        System.out.println(money1+" "+money2);
    }
}