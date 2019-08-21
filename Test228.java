
链表分割




编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前


给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
注意：分割以后保持原来的数据顺序不变。

import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return null;
        }
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode p = pHead;
        while(p != null){
            if(p.val >= x){
                node2.next = new ListNode(p.val);
                node2 = node2.next;
            }else{
                node1.next = new ListNode(p.val);
                node1 = node1.next;
            }
            p = p.next;
        }
        node1.next = list2.next;
        return list1.next;
    }
}