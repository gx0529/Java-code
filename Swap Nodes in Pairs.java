package www.bit.java.util;



/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 示例:
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        //如果此链表没有节点或者只有一个节点，直接返回
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        //此节点为要交换的节点
        ListNode swapNext = head.next;
        //定义一个节点来记住要交换的下一个节点
        ListNode firstNextNext = swapNext.next;
        //将交换节点的next置为它的前一个节点
        swapNext.next = first;
        //使用递归来实现交换，并将交换后的头结点返回
        ListNode swapNextNext = swapPairs(firstNextNext);
        //将first节点的next置为返回的链表节点
        first.next = swapNextNext;
        //返回此链表交换后的头结点
        return swapNext;
    }
}




