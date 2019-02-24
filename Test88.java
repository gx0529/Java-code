
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
        //如果头结点没空或者k为0则直接返回头结点
        if(head == null || k == 0){
            return head;
        }
        ListNode cur = head;
        int count = 0;
        //先计算出节点个数
        while(cur != null){
            count++;
            cur = cur.next;
        }
        //如果k正好是节点的倍数，相当于不用旋转
        if(k % count == 0){
            return head;
        }
        //计算出最小的旋转次数
        k = k % count;
        cur = head;
        //找到被旋转部分的前一个节点
        for(int i=0; i<count-k-1; i++){
            cur = cur.next;
        }
        ListNode temp = cur.next;
        cur.next = null;
        cur = temp;
        //找到旋转部分的最后一个节点
        while(temp.next != null){
            temp = temp.next;
        }
        //直接将旋转部分的最后一个节点的next赋为头节点
        temp.next = head;
        return cur;
    }
}