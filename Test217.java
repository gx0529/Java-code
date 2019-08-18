
另类加法

请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。

给定两个int A和B。请返回A＋B的值

import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        if(B == 0){
            return A;
        }
        int sum = A ^ B;
        int jin = (A & B) << 1;
        return addAB(sum, jin);
    }
}