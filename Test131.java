/**
* 每次读取一个数之后，算出他经过k次洗牌后的位置，只用一个长度为2n数组用来输出
* 根据当前数的位置，可以算出经过一次洗牌后的位置
* 如果当前数小于等于n（即在左手），则他下次出现的位置是 2*当前位置-1
* 如果当前位置大于n（即在右手）,则他下次出现的位置是 2*（当前位置 - n）
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
			//输出
			if(res.length> 0) System.out.print(res[0]);
			for(int i = 1;i< 2*n;i++){
				System.out.print(" "+res[i]);
			}
			System.out.println();
		}
	}
}