package www.bit.java;

/**
 *给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode nodeNext = node.next;
        while(nodeNext != null){
            if(node.val == nodeNext.val){
                node.next = nodeNext.next;
                nodeNext = nodeNext.next;
            }
            else{
                node = node.next;
                nodeNext = nodeNext.next;
            }
        }
        return head;
    }
}
