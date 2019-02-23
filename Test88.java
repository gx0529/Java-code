
给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: 1->2->3->4->5->NULL, k = 2
输出: 4->5->1->2->3->NULL
解释:
向右旋转 1 步: 5->1->2->3->4->NULL
向右旋转 2 步: 4->5->1->2->3->NULL
示例 2:

输入: 0->1->2->NULL, k = 4
输出: 2->0->1->NULL
解释:
向右旋转 1 步: 2->0->1->NULL
向右旋转 2 步: 1->2->0->NULL
向右旋转 3 步: 0->1->2->NULL
向右旋转 4 步: 2->0->1->NULL

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode left = head;
        ListNode right = head;
        ListNode res;
        int idx = 0;
        while (right != null) {
            idx++;
            right = right.next;
        }
        right = head;
        k = k  % idx;
        idx = 0;
        while (idx != k) {
            if (right == null)
                right = head;            
            idx++;
            right = right.next;            
        }
        if (right == null)
            right = head;        
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        right.next = head;
        res = left.next;
        left.next = null;
        return res;
    }
}