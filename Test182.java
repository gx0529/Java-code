

É¾³ý¹«¹²×Ö·û

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            char[] ch = scanner.nextLine().toCharArray();
            String str = scanner.nextLine();
            for(int i=0; i<ch.length; i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}