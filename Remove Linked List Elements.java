package www.bit.java;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //如果头结点为空，则直接返回
        if(head == null) {
            return head;
        }
        ListNode p = head, q = head.next;
        while(q != null) {
            //删除结点
            if(q.val == val) {
                p.next = q.next;
                q = q.next;
            }else{
                p = p.next;
                q = q.next;
            }
        }
        //判断头结点是否为要删除的结点
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }
}
