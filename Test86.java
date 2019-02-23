
����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣

ʾ����

����һ������: 1->2->3->4->5, �� n = 2.

��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.

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


//�������α����ķ������ȼ��������ĸ���������ҵ�ɾ���ڵ��ǰһ���ڵ�
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