

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            for(int i=0; i<str.length(); i++){
                String e = String.valueOf(str.charAt(i));
                set.add(e);
            }
            System.out.println(set.size());
        }
    }
}