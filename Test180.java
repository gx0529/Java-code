/**
 * ����һ�����������һ���㷨�����Ͻ�(mat[0][0])��ʼ��˳ʱ���ӡ����Ԫ�ء�
 * ����int����mat,�Լ�����ά��nxm���뷵��һ�����飬�����е�Ԫ��Ϊ����Ԫ�ص�˳ʱ�������
 * ����������
 *      [[1,2],[3,4]],2,2
 *      ���أ�[1,2,4,3]
 */
public class Main {
    public static int[] cyclic(int[][] num, int n, int m){
        int[] data = new int[n * m];
        if(num == null){
            return data;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int startX =0;
        int startY =0;
        int endX = n -1;
        int endY = m -1;
        while(startX <= endX && startX <= endY){
            // ֻʣ���һ��
            if(startX == endX){
                for(; j<=endY; j++,k++){
                    data[k] = num[startX][j];
                }
                return data;
            }
            // ֻʣ���һ��
            if(startY == endY){
                for(; i<=endX; i++,k++){
                    data[k] = num[i][startY];
                }
            }
            //��ӡÿһ�����ݣ��������ұ�һλ��
            for(; j<endY; j++,k++){
                data[k] = num[i][j];
            }
            //��ӡÿһ�����ݣ��������±�һλ��
            for(; i<endX; i++,k++){
                data[k] = num[i][j];
            }
            //��ӡÿһ�����ݣ����������һλ��
            for(; j>startX; j--,k++){
                data[k] = num[i][j];
            }
            //��ӡÿһ�����ݣ��������ϱ�һλ��
            for(; i>startY; i--,k++){
                data[k] = num[i][j];
            }
            i++;
            j++;
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return data;
    }
    public static void main(String[] args) {
        int[][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] data = cyclic(num,4,4);
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}