import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.next();
            int[] temp = new int[10];
            for(int i=0; i<str.length(); i++){
                temp[str.charAt(i)-'0']++;
            }
            for(int i=0; i<10; i++){
                if(temp[i] != 0){
                    System.out.println(i+":"+temp[i]);
                }
            }
        }
    }
}