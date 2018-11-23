package www.bit.java;

/**
 *请判断一个链表是否为回文链表。
 * 示例 1:
 * 输入: 1->2
 * 输出: false
 *
 * 示例 2:
 * 输入: 1->2->2->1
 * 输出: true
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverseNode=reverseList(slow);
        while(head!=null&&reverseNode!=null){
            if(head.val!=reverseNode.val){
                return false;
            }
            head=head.next;
            reverseNode=reverseNode.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre=head;
        ListNode cur=head.next;
        ListNode temp;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head.next=null;
        return pre;
    }
}


