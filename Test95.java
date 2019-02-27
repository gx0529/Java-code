
����һ�������������е������ڵ��ż���ڵ�ֱ�����һ����ע�⣬����������ڵ��ż���ڵ�ָ���ǽڵ��ŵ���ż�ԣ������ǽڵ��ֵ����ż�ԡ�

�볢��ʹ��ԭ���㷨��ɡ�����㷨�Ŀռ临�Ӷ�ӦΪ O(1)��ʱ�临�Ӷ�ӦΪ O(nodes)��nodes Ϊ�ڵ�������

ʾ�� 1:

����: 1->2->3->4->5->NULL
���: 1->3->5->2->4->NULL
ʾ�� 2:

����: 2->1->3->5->6->4->7->NULL 
���: 2->3->6->7->1->5->4->NULL

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode old = head;
        ListNode even = old.next;
        ListNode newNode = even; 
        while(even != null && even.next != null){
            old.next = old.next.next;
            old = old.next;
            even.next = even.next.next;
            even = even.next;
        }
        old.next = newNode;
        return head;
    }
}
