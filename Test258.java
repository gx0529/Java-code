

ջ��ѹ�룬��������

���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
��ע�⣺���������еĳ�������ȵģ�

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int ii = 0;
        int io = 0;
        int len = pushA.length;
        Stack<Integer> stack = new Stack<>();
        while(ii < len){
            if(pushA[ii] == popA[io]){
                ii++;
                io++;
            }else{
                if(!stack.isEmpty() && popA[io]==stack.peek()){
                    stack.pop();
                    io++;
                }else{
                    stack.push(pushA[ii]);
                    ii++;
                }
            }
        }
        while(!stack.isEmpty()){
            if(popA[io] != stack.peek()){
                return false;
            }else{
                stack.pop();
                io++;
            }
        }
        return true;
    }
}