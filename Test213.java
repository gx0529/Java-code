�޻��潻��

���дһ�������������ڲ�ʹ���κ���ʱ������ֱ�ӽ�����������ֵ��

����һ��int����AB��������Ԫ�غ͵�һ��Ԫ��Ϊ��������ֵ���뷵�ؽ���������顣

����������
[1,2]
���أ�[2,1]

import java.util.*;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }
}