import java.util.Arrays;
import java.util.Scanner;

*
 * ţţ����������ľ��,���ȷֱ���a,b,c��ţţ���԰���һһ��ľ����������,
 * ţţ��Ŀ������������ľ������һ��������,����ţţ��ϣ����������ε��ܳ�Խ��Խ�á�

public class Practice160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int[] num = {a,b,c};
        Arrays.sort(num);
        int min = num[0];
        int mid = num[1];
        int max = num[2];
        if (max < (min+mid)){
            System.out.println(max+mid+min);
        }else if (max == (min+mid)){
            System.out.println(max+mid+min-1);
        }else {
            System.out.println(2*(min+mid)-1);
        }
    }
}
