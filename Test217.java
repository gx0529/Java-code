
����ӷ�

���дһ��������������������ӡ�����ʹ��+�����������������

��������int A��B���뷵��A��B��ֵ

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