��ʽA+B




�������������ʾ��������ÿ��������һ����λ����Щ��λ�Ƿ����ŵģ�
Ҳ���Ǹ�λ����������ײ�����д������������������ͣ�����������ʽ���ؽ����


������������ListNode* A��ListNode* B���뷵��A+B�Ľ��(ListNode*)��



����������
{1,2,3},{3,2,1}
���أ�{4,4,4}

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