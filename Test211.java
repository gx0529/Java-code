


���Ľ���


������һ���ַ�������Ҫ������ַ������� n �β�����
ÿ�β��������������֣�(p, l) ��ʾ��ǰ�ַ����д��±�Ϊ p ���ַ���ʼ�ĳ���Ϊ l ��һ���Ӵ���
��Ҫ������Ӵ����ҷ�ת���������Ӵ�ԭ��λ�õ����󷽣������õ����ַ�����ʲô��
�ַ������±��Ǵ� 0 ��ʼ�ģ�����Դ������еõ�������Ϣ��



��������:
ÿ���������������һ�����ݣ�ÿ�����ݵ�һ��Ϊԭ�ַ��������Ȳ����� 10 ��
��������Сд�ַ������֡�����������һ������ n ��ʾ�� n ���������ٽ������� n �У�
ÿ��������������ʾÿ�β�����(p , l)��




import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            int n = in.nextInt();
            for(int i=0; i<n; i++){
                int p = in.nextInt();
                int l = in.nextInt();
                StringBuffer str1 = new StringBuffer(str.substring(p,p+l));
                str = str.substring(0,p+l)+str1.reverse().toString()+str.substring(p+l);
            }
            System.out.println(str);
        }
    }
}