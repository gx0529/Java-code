/*
import java.util.Scanner;

*/
/**
 * ������������������x��k,���Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���,
 * ����repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * ţţ���ڸ���4������x1, k1, x2, k2, ����v1 = (x1, k1), v2 = (x2, k2),
 * �������Ƚ�v1��v2�Ĵ�С��
 */


public class Practice162 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        String x1 = str[0];
        int v1 = Integer.parseInt(str[1]);
        String x2 = str[2];
        int v2 = Integer.parseInt(str[3]);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < v1; i++){
            sb1 = sb1.append(x1);
        }
        for (int j = 0; j < v2; j++){
            sb2 = sb2.append(x2);
        }
        String str1 = sb1.toString();
        String str2 = sb2.toString();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2){
            System.out.println("Greater");
        }else if (len1 < len2){
            System.out.println("Less");
        }else {
            for (int i = 0; i < len1; i++){
                if (str1.charAt(i)-'0' > str2.charAt(i)-'0'){
                    System.out.println("Greater");
                    return;
                }else if (str1.charAt(i)-'0' < str2.charAt(i)-'0'){
                    System.out.println("Less");
                    return;
                }
            }
            System.out.println("Equals");
        }
    }
}
