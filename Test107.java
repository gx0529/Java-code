import java.util.Scanner;


public class Test3 {
    public String trans(String s, int n) {
        String[] temp = s.split(" ");
        String str1 = "";
        StringBuilder str = new StringBuilder(str1);
        for(int i=temp.length-1; i>0; i--){
            str.append(temp[i]+" ");
        }
        str.append(temp[0]);
        str1 = str.toString();
        int length = str1.length();
        for(int i=0; i<length; i++){
            char tmp = str1.charAt(i);
            if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
                str1 = str1.replace(tmp,(char)(tmp-32));
            }
            if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
                str1 = str1.replace(tmp,(char)(tmp+32));
            }
        }
        return str1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Test3 test = new Test3();
        String str = null;
        if(scanner.hasNext()){
            str = scanner.nextLine();
        }
        System.out.println(test.trans(str,str.length()));
    }
}