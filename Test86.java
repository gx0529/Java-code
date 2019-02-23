
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode fast = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        ListNode slow = demo;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return demo.next;
    }
}


//利用两次遍历的方法，先计算出链表的个数，最后找到删除节点的前一个节点
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        int count = 0;
        while(fast != null){
            count++;
            fast = fast.next;
        }
        if(n > count){
            return head;
        }
        if(n == count){
            return head.next;
        }
        fast = head;
        for(int i=0; i<count-n-1; i++){
            fast = fast.next;
        }
        fast.next = fast.next.next;
        return head;
    }
}