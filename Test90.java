给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5
示例 2:

输入: 1->1->1->2->3
输出: 2->3

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode p1 = newNode;
        ListNode p2 = head;
        while(p2 != null && p2.next != null){
            //判断节点值是否重复
            if(p1.next.val == p2.next.val){
                //重复后可以直接移两位
                p2 = p2.next.next;
                //在判断移动后的节点是否重复
                while(p2 != null && p2.val == p1.next.val){
                    p2 = p2.next;
                }
                p1.next = p2;
            }else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return newNode.next;
    }
}