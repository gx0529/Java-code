


字母统计

输入一行字符串，计算其中A-Z大写字母出现的次数


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] s = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                      "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        if(in.hasNext()){
            String str = in.nextLine();
            Map<String,Integer> map = new HashMap<>();
            for(int i=0; i<s.length; i++){
                map.put(s[i],0);
            }
            Set<String> keys = map.keySet();
            for(int i=0; i<str.length(); i++){
                String temp = str.substring(i,i+1);
                if(keys.contains(temp)){
                    map.put(temp,map.get(temp)+1);
                }
            }
            for(String num : s){
                System.out.println(num+":"+map.get(num));
            }
        }
    }
}



import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            int[] count = new int[26];
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    count[str.charAt(i)-'A']++;
                }
            }
            for(int i=0; i<26; i++){
                System.out.println((char)('A'+i)+":"+count[i]);
            }
        }
    }
}