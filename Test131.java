/**
* ÿ�ζ�ȡһ����֮�����������k��ϴ�ƺ��λ�ã�ֻ��һ������Ϊ2n�����������
* ���ݵ�ǰ����λ�ã������������һ��ϴ�ƺ��λ��
* �����ǰ��С�ڵ���n���������֣��������´γ��ֵ�λ���� 2*��ǰλ��-1
* �����ǰλ�ô���n���������֣�,�����´γ��ֵ�λ���� 2*����ǰλ�� - n��
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int groups = sc.nextInt();
		while (groups-- > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] res = new int[2*n];
			for(int i=0;i<2*n;i++){
				int tmp = i + 1;
				for(int j = 0; j < k;j++){
					if (tmp <= n) tmp = 2*tmp - 1;
					else tmp = 2 * (tmp - n);
				}
				res[tmp - 1]=sc.nextInt();
			}
			//���
			if(res.length> 0) System.out.print(res[0]);
			for(int i = 1;i< 2*n;i++){
				System.out.print(" "+res[i]);
			}
			System.out.println();
		}
	}
}