/**
 * 求字符串中最后一个单词的长度
 */
public class Test7 {
    public static void main(String[] args){
        String str = "XSUWHQ";
        System.out.println(getLength(str));
    }

    public static int getLength(String str){
        String[] arr = str.split(" ");
        String s = arr[arr.length-1];
        return s.length();
    }
}
