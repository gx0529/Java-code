
/**
 * С��ȥ�̵���ƻ����ֻ��6��һ����8��һ���İ�װ��
 * С��ǡ��ֻ����n��ƻ�����������ٵĴ�������Я����
 * �������ǡ�ù���n���������Ṻ��
 * ���һ��������ʾǡ�ù���Ĵ�������������ǡ��n��ƻ���������-1.
 */

public class Practice152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = n / 8;
        int tmp = n % 8;  //����ÿ�η���֮��ʣ���ƻ����
        if (tmp == 0){
            System.out.println(count);
            return;
        }else {
            while (count != 0){
                count--;
                tmp = tmp + 8;
                if (tmp % 6 == 0){
                    count = count + (tmp/6);
                    System.out.println(count);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}
