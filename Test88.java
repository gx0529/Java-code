
����һ��������ת����������ÿ���ڵ������ƶ� k ��λ�ã����� k �ǷǸ�����

ʾ�� 1:

����: 1->2->3->4->5->NULL, k = 2
���: 4->5->1->2->3->NULL
����:
������ת 1 ��: 5->1->2->3->4->NULL
������ת 2 ��: 4->5->1->2->3->NULL
ʾ�� 2:

����: 0->1->2->NULL, k = 4
���: 2->0->1->NULL
����:
������ת 1 ��: 2->0->1->NULL
������ת 2 ��: 1->2->0->NULL
������ת 3 ��: 0->1->2->NULL
������ת 4 ��: 2->0->1->NULL

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