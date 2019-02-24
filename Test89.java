
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)

输出：7 -> 0 -> 8
原因：342 + 465 = 807

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //先创建一条新链表的头结点
        ListNode newNode = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode cur = newNode;
        //设置一个进位标志
        int num = 0;
        //只要有一条链表就进入循环
        while(p1 != null || p2 != null){
            int n1 = (p1 != null) ? p1.val:0;
            int n2 = (p2 != null) ? p2.val:0;
            //将两个链表对应的节点值相加
            int sum = n1+n2+num;
            //判断有没有进位
            num = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }
        }
        //如果最后一次相加后的值有进位，则在建一个新节点
        if(num > 0){
            cur.next = new ListNode(num);
        }
        return newNode.next;
    } 
}