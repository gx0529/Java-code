
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //��λ
        String[] tran1 = new String[]{"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
        String[] tran2 = new String[]{"ʰ", "��", "Ǫ", "��", "��"};
        //���ݼ�¼
        StringBuilder tin = new StringBuilder();
        StringBuilder result = new StringBuilder("Ԫ");
        //��ʶ����ʱ����
        int jiao = 0;
        int fen = 0;
        int count = 0;
        boolean flag = false;
        //�û�����
        Scanner scanner = new Scanner(System.in);
        String in = String.valueOf(scanner.nextDouble());
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != '.' && !flag) {
                tin.append(in.charAt(i));
            } else {
                flag = true;
                if (count == 1) {
                    //�����
                    jiao = in.charAt(i) - '0';
                } else if (count == 2) {
                    //�����
                    fen = in.charAt(i) - '0';
                }
                count++;
            }
        }
        char[] chars = tin.toString().toCharArray();
        if (chars[chars.length - 1] != '0') {
            result.insert(0, tran1[chars[chars.length - 1] - '0']);
        }
        int count1 = 0;
        for (int i = tin.toString().length() - 2; i >= 0; i--) {
            if (chars[i] - '0' != 0) {
                if (count1 == 8) {
                    result.insert(0, tran2[4]);
                } else {
                    result.insert(0, tran2[count1 % 4]);
                }
                if (chars[i] - '0' != 1 || count1 % 4 != 0) {
                    result.insert(0, tran1[chars[i] - '0']);
                }
            }
            count1++;
            count1 %= 9;
        }
        //���
        System.out.print("�����" + result);
        //0 ��
        //!0 ��
        boolean bJiao = jiao != 0;
        boolean bFen = fen != 0;
        if (!bJiao && !bFen) {
            System.out.println("��");
        } else {
            if (bJiao) {
                System.out.print(tran1[jiao] + "��");
            }
            if (bFen) {
                System.out.print(tran1[fen] + "��");
            }
            System.out.println();
        }
    }
}