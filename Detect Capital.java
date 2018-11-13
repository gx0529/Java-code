package www.bit.java.util;

/**
 *给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] data = word.toCharArray();
        if(data[0] >= 'a' && data[0] <= 'z'){
            if(word.length()<2){
                return true;
            }
            for(int i=1; i<data.length; i++){
                if(!(data[i] >= 'a' && data[i] <= 'z')){
                    return false;
                }
            }
            return true;
        }else if(data[0] >= 'A' && data[0] <= 'Z'){
            if(word.length()<2){
                return true;
            }
            if(data[1] >= 'A' && data[1] <= 'Z'){
                for(int i=2; i<data.length; i++){
                    if(!(data[i] >= 'A' && data[i] <= 'Z')){
                        return false;
                    }
                }
                return true;
            }
            else{
                for(int i=1; i<data.length; i++){
                    if(!(data[i] >= 'a' && data[i] <= 'z')){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}

public class Test1{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse("123"));
    }
}


