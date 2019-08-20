链式A+B




有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，
也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。


给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。



测试样例：
{1,2,3},{3,2,1}
返回：{4,4,4}

import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a==null && b==null){
            return null;
        }
        ListNode p1 = a;
        ListNode p2 = b;
        ListNode list = new ListNode(0);
        ListNode node = list;
        int num = 0;
        while(p1!=null || p2!=null){
            int n1 = (p1==null) ? 0:p1.val;
            int n2 = (p2==null) ? 0:p2.val;
            int data = n1 + n2 + num;
            node.next = new ListNode(data%10);
            num = data/10;
            node = node.next;
            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }
        }
        if(num == 1){
            node.next = new ListNode(1);
        }
        return list.next;
    }
}