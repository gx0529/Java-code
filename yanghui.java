
public class test{
    public static void main(String[] args){
        int i,j,k;
        int[][] arr = new int[10][10];
        System.out.println("杨辉三角形为：");
        for(i=0; i<10; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for(i=2; i<10; i++){
            for(j=1; j<10; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for(i=0; i<10; i++){
            for(k=0; k<10-i; k++){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("    "+arr[i][j]);
            }
            System.out.println();
        }
    }
}