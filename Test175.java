
import java.util.Scanner;
  

ѧӢ��

public class Main{
    public static String[] num1 = {"zero", "one", "two", "three", "four"
                        , "five", "six", "seven", "eight", "nine"};
    public static String[] num2 = {"ten","eleven","twelve","thirteen","fourteen"
                    ,"fifteen","sixteen","seventeen","eighteen","nighteen"};
    public static String[] num3 = {"twenty","thirty","forty","fifty"
                    ,"sixty","seventy","eighty","ninety"};
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 0;
        while(sc.hasNext()){
            num = sc.nextLong();
            System.out.println(parse(num));
        }
    }
      
    public static String parse(long num){
        if(num < 0 )
            return "error";
        StringBuilder sb = new StringBuilder();
        long billion = num / 1000000000;
                //ʮ�ڲ���
        if(billion != 0){
            sb.append(thranslate(billion) + " billion ");//����ʮ�ڲ���
        }
        num = num % 1000000000;
                //���򲿷�
        long million = num / 1000000;
        if(million != 0){
            sb.append(thranslate(million) + " million ");//������򲿷�
        }
        num = num % 1000000;
                //ǧ����
        long thousand = num / 1000;
        if(thousand != 0){
            sb.append(thranslate(thousand) + " thousand ");//����ǧ����
        }
                //�ٲ���
        num = num % 1000;
        if(num != 0){
            sb.append(thranslate(num));//����ٲ���
        }
        return sb.toString().trim();//������ȥ���ַ�������Ŀո�
    }
      
        //���뷽��
    public static String thranslate(long num){
        StringBuilder sb = new StringBuilder();
                //��λ����
        long h = num / 100;
        if(h != 0){
                        //����Ϊ0�����룬���򲻷���
            sb.append(num1[(int) h] + " hundred");
        }
        num = num % 100;
                //ʮλ����
        long k = num / 10;
        if(k != 0){
            if(h != 0)//����а�λ�����˼�and
                sb.append(" and ");
            if(k == 1){//��ʮλΪ1����ͬ��λһ����
                long t = num % 10;
                sb.append(num2[(int)t]);
            }
            else{//����ʮλ�͸�λ�ֱ𵥶�����
                sb.append(num3[(int)k - 2] + " ");
                if(num % 10 != 0)
                    sb.append(num1[(int)(num % 10)]);
            }
        }
        else if(num % 10 != 0){//���û��ʮλ���֣�ֱ�ӷ����λ����
            if(h != 0)
                sb.append(" and ");
            sb.append(num1[(int)(num % 10)]);
        }
        return sb.toString().trim();//������ȥ���ַ�������Ŀո� }
  
}
}
