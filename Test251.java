

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode list = new ListNode(0);
        ListNode node = list;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                node.next = new ListNode(l1.val);
                node = node.next;
                l1 = l1.next;
            }else{
                node.next = new ListNode(l2.val);
                node = node.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            node.next = new ListNode(l1.val);
            node = node.next;
            l1 = l1.next;
        }
        while(l2 != null){
            node.next = new ListNode(l2.val);
            node = node.next;
            l2 = l2.next;
        }
        return list.next;
    }
}