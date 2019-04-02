
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //单位
        String[] tran1 = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] tran2 = new String[]{"拾", "佰", "仟", "万", "亿"};
        //数据记录
        StringBuilder tin = new StringBuilder();
        StringBuilder result = new StringBuilder("元");
        //标识和临时变量
        int jiao = 0;
        int fen = 0;
        int count = 0;
        boolean flag = false;
        //用户输入
        Scanner scanner = new Scanner(System.in);
        String in = String.valueOf(scanner.nextDouble());
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != '.' && !flag) {
                tin.append(in.charAt(i));
            } else {
                flag = true;
                if (count == 1) {
                    //计算角
                    jiao = in.charAt(i) - '0';
                } else if (count == 2) {
                    //计算分
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
        //输出
        System.out.print("人民币" + result);
        //0 假
        //!0 真
        boolean bJiao = jiao != 0;
        boolean bFen = fen != 0;
        if (!bJiao && !bFen) {
            System.out.println("整");
        } else {
            if (bJiao) {
                System.out.print(tran1[jiao] + "角");
            }
            if (bFen) {
                System.out.print(tran1[fen] + "分");
            }
            System.out.println();
        }
    }
}