ɾ�������ַ�
���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ���
���磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            StringBuffer C = new StringBuffer();
            for(int i=0; i<A.length(); i++){
                int j = 0;
                for(j=0; j<B.length(); j++){
                    if(A.charAt(i) == B.charAt(j)){
                        break;
                    }
                }
                if(j == B.length()){
                    C = C.append(A.charAt(i));
                }
            }
            System.out.println(C.toString());
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String A = in.nextLine();
            String B = in.nextLine();
            for(int i=0; i<A.length(); i++){
                if(!(B.contains(String.valueOf(A.charAt(i))))){
                    System.out.print(A.charAt(i));
                }
            }
        }
    }
}