/**
 * 对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。
 * 给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。
 * 测试样例：
 *      [[1,2],[3,4]],2,2
 *      返回：[1,2,4,3]
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
            // 只剩最后一行
            if(startX == endX){
                for(; j<=endY; j++,k++){
                    data[k] = num[startX][j];
                }
                return data;
            }
            // 只剩最后一列
            if(startY == endY){
                for(; i<=endX; i++,k++){
                    data[k] = num[i][startY];
                }
            }
            //打印每一行数据，保留最右边一位数
            for(; j<endY; j++,k++){
                data[k] = num[i][j];
            }
            //打印每一列数据，保留最下边一位数
            for(; i<endX; i++,k++){
                data[k] = num[i][j];
            }
            //打印每一行数据，保留最左边一位数
            for(; j>startX; j--,k++){
                data[k] = num[i][j];
            }
            //打印每一列数据，保留最上边一位数
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