
����ָ�




��д���룬�Ը���ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ


����һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣
ע�⣺�ָ��Ժ󱣳�ԭ��������˳�򲻱䡣

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