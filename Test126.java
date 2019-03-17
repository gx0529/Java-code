生成格雷码

在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 
则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
给定一个整数n，请返回n位的格雷码，顺序为从0开始。

测试样例：
	1
	返回：["0","1"]


import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        if(n == 1){
            String[] result = new String[2];
            result[0] = "0";
            result[1] = "1";
            return result;
        }else{
            String[] temp = getGray(n-1);
            String[] result = new String[temp.length * 2];
            for(int i=0; i<temp.length; i++){
                result[i] = "0" + temp[i];
            }
            for(int i=0; i<temp.length; i++){
                result[i+temp.length] = "1" + temp[temp.length-1-i];
            }
            return result;
        }
    }
}