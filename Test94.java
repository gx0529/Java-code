

22:39:39
��˼�� 2019/2/26 ���ڶ� 22:39:39
/**
 * ���һ������S����������еĺϷ���i,����S[i + 1] = S[i] + d, �����dҲ�����Ǹ�������,���Ǿͳ�����SΪ�Ȳ����С�
 * С��������һ������Ϊn������x,С�����x��Ϊһ���Ȳ����С�
 * С����������������������������λ�õ���ֵ�Ĳ���,���ҽ���������������Ρ�
 * ������Щ����ͨ���������ǲ��ܱ�ɵȲ�����,С����Ҫ�б�һ�������Ƿ���ͨ������������ɵȲ�����
 *
 *
 * ��������:
 *
 * �����������,��һ�а�������n(2 �� n �� 50),�����еĳ��ȡ�
 * �ڶ���n��Ԫ��x[i](0 �� x[i] �� 1000),�������е�ÿ��������
 *
 * �������:
 *
 * ������Ա�ɵȲ��������"Possible",�������"Impossible"��
 */


public class Practice141{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] x = new int[n];
        for(int i = 0; i < n; i++)
            x[i] = Integer.parseInt(str[i]);
        if(numLine(n,x)){
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }
    }

    public static boolean numLine(int n, int[] x){
        //�����򣨲��ţ�
        for(int i = 1; i < n; i++){
            int key = x[i];
            int end = i - 1;
            while(end >= 0 && x[end] > key){
                x[end+1] = x[end];
                end--;
            }
            x[end+1] = key;
        }
        //�鿴�Ƿ�ÿ����Ԫ��֮��Ĳ�ֵ����ͬ
        int tmp = x[1] - x[0];
        for(int j = 1; j < n-1; j++){
            if(tmp != x[j+1] - x[j])
                return false;
        }
        return true;
    }
}
