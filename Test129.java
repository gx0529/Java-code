import java.util.Scanner;

/**
 * ��һ�������Ρ�
 *
 * ����������
 *  ����һ�����ֺ�һ���ַ���
 *
 *  ���������
 *  �����εı߳�Ϊ�����֣����ַ���ʾ������
 *
 *  ע�⣺
 *  ������������50%
 */

public class Practice184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        String ch = str[1];

        String[][] res = new String[n/2][n];
        for (int i = 0; i < n/2; i++){
           for (int j = 0; j < n; j++){
               if (i == 0 || i == (n/2-1)){
                   res[i][j] = ch;
               }else {
                   if (j == 0 || j == n-1){
                       res[i][j] = ch;
                   }else {
                       res[i][j] = " ";
                   }
               }
           }
        }

        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < n; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
