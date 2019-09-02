

������Ŀ��Ҫ�㣺

1�����Ĵ�д�������ǰӦ����������ҡ����������Ĵ�д�������Ӧ��Ҽ���������������顢
½���⡢�ơ�����ʰ���ۡ�Ǫ�����ڡ�Ԫ���ǡ��֡��㡢����������д����30�֣� 

2�����Ĵ�д������ֵ���Ԫ��Ϊֹ�ģ��ڡ�Ԫ��֮��Ӧд�����֣�
�磤 532.00Ӧд�ɡ�����������ʰ��Ԫ�������ڡ��ǡ��͡��֡����治д�����֡���30�֣� 

3�������������м��С�0��ʱ�����Ĵ�дҪд���㡱�֣������������м������м�����0��ʱ��
���Ĵ�д����м�ֻдһ�����㡱�֣��磤6007.14��Ӧд�ɡ������½Ǫ����ԪҼ�����֡���


import java.util.Scanner;
public class Main{
      
    static String[] map = {"Ҽ","��","��","��","��","½","��","��","��"};
      
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         while(scan.hasNext()){
             String number = scan.next();
             resolve(number);
         }
         scan.close();
    }
      
    public static void resolve(String str){
        String[] strArr = str.split("\\.");
        int number = Integer.valueOf(str.split("\\.")[0]);
         
        StringBuffer res = new StringBuffer("�����");
        int yi = (int)(number/100000000);
        if(yi!=0){
            res.append(resolveQian(yi)).append("��");
            number = number-yi*100000000;
        }
          
        int wan = (int)(number/10000);
        if(wan!=0){
            res.append(resolveQian(wan)).append("��");
            number = number-wan*10000;
        }
          
         //����ǧ��ʮ��λ
        String beforePointString = resolveQian(number);
        if(beforePointString.length()>1){
             res.append(beforePointString).append("Ԫ");
        }
          
        //����С���㣬����С�������λ��
        if(strArr.length>1){
             String afterPointStr = strArr[1];
             //System.out.println(afterPointStr);
             res.append(handleNumberAfterPoint(afterPointStr));
        }
          
        //��resolveQian() ��������ܻ᷵��  ��xxx
        //�������Ϊ������"��"
        String resString = res.toString();
        
        if(resString.length()>4 && resString.charAt(3)=='��' && resString.charAt(4)!='Ԫ'){
           //System.out.println(resString.substring(0,3));
            resString = resString.substring(0,3)+resString.substring(4);
        }
  
        System.out.println(resString);
          
    }
      
    //����4λ�� ǧ��ʮ��λ
    public static String resolveQian(double temp){
     
        StringBuffer resBuffer = new StringBuffer();
          
        //ǧλ
        int qian = (int)(temp/1000);
        if(qian!=0){
            resBuffer.append(map[qian-1]).append("Ǫ");
            temp = temp-qian*1000;
        }
          
        //��λ
        int bai = (int)(temp/100);
        if(bai!=0){
            resBuffer.append(map[bai-1]).append("��");
            temp = temp-bai*100;
        }
        //ע��:�� ֻ������� ��λ��ʮλ
        if(qian!=0 && bai==0){
            resBuffer.append("��");
        }
          
        //ʮλ
        int shi = (int)(temp/10);
        if(shi!=0){
            if(shi!=1){
                resBuffer.append(map[shi-1]);
            }
            resBuffer.append("ʰ");
            temp = temp-shi*10;
        }
          
        //ע�⣺0
        if(bai!=0&&shi==0){
            resBuffer.append("��");
        }
          
        //��λ
        int ge = (int)(temp%10);
          
          
        if(ge!=0){
            //5,0001 ���������ǧ��ʮλ��Ϊ0
            if(qian==0&&bai==0&&shi==0){
                resBuffer.append("��");
            }
            resBuffer.append(map[ge-1]);
        }
        String res = resBuffer.toString();
        return res;
    }
      
    //����С����������
    public static String handleNumberAfterPoint(String str){
        String res = "";
        if(str.equals("00") ||str.equals("0")){
            res = "��";
        }else{
            if(str.charAt(0)!='0'){
                res += map[Integer.valueOf(str.charAt(0)+"")-1]+"��";
            }
            if(str.length()>1 && str.charAt(1)!='0'){
                res += map[Integer.valueOf(str.charAt(1)+"")-1]+"��";
            }
        }
        return res;
    }
}