
/**
 * ��һ����Ȥ���ַ�����ֵ���㷽ʽ:ͳ���ַ�����ÿ���ַ����ֵĴ���,Ȼ���������ַ�������ƽ������Ϊ�ַ����ļ�ֵ
 * ����: �ַ���"abacaba",�������4��'a',2��'b',1��'c',��������ַ����ļ�ֵΪ4 * 4 + 2 * 2 + 1 * 1 = 21
 * ţţ��һ���ַ���s,�����������s���Ƴ����k���ַ�,���Ŀ�����õõ����ַ����ļ�ֵ��С��
 */

public class Practice142 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int k = Integer.parseInt(bf.readLine());
        System.out.println(minValue(s,k));
    }

    public static int minValue(String s, int k){
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++){
            num[s.charAt(i)-'a']++;
        }

        for (int j = 0; j < k; j++){
            int max = 0;
            for (int m = 0; m < 26; m++){
                if (num[m] > num[max])
                    max = m;
            }
            num[max]--;
        }
        int res = 0;
        for (int i = 0; i < 26; i++){
            res += Math.pow(num[i], 2);
        }
        return res;

    }
}
