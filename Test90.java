����һ����������ɾ�����к����ظ����ֵĽڵ㣬ֻ����ԭʼ������ û���ظ����� �����֡�

ʾ�� 1:

����: 1->2->3->3->4->4->5
���: 1->2->5
ʾ�� 2:

����: 1->1->1->2->3
���: 2->3

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
            //�жϽڵ�ֵ�Ƿ��ظ�
            if(p1.next.val == p2.next.val){
                //�ظ������ֱ������λ
                p2 = p2.next.next;
                //���ж��ƶ���Ľڵ��Ƿ��ظ�
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