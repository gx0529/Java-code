
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            int[] data = new int[4];
            for(int i=0; i<4; i++){
                data[i] = scanner.nextInt();
            }
            int[] temp = new int[3];
            temp[0] = (data[0]+data[2])/2;
            temp[1] = (data[1]+data[3])/2;
            temp[2] = temp[1]-data[1];
            if(temp[0]-temp[1]!=data[0] || temp[1]-temp[2]!=data[1]
                    || temp[0]+temp[1]!=data[2] || temp[1]+temp[2]!=data[3]){
                System.out.println("No");
            }else{
                for(int i=0; i<temp.length-1; i++){
                    System.out.print(temp[i]+" ");
                }
                System.out.print(temp[2]);
            }
        }
    }
}