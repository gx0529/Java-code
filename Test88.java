
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
        //���ͷ���û�ջ���kΪ0��ֱ�ӷ���ͷ���
        if(head == null || k == 0){
            return head;
        }
        ListNode cur = head;
        int count = 0;
        //�ȼ�����ڵ����
        while(cur != null){
            count++;
            cur = cur.next;
        }
        //���k�����ǽڵ�ı������൱�ڲ�����ת
        if(k % count == 0){
            return head;
        }
        //�������С����ת����
        k = k % count;
        cur = head;
        //�ҵ�����ת���ֵ�ǰһ���ڵ�
        for(int i=0; i<count-k-1; i++){
            cur = cur.next;
        }
        ListNode temp = cur.next;
        cur.next = null;
        cur = temp;
        //�ҵ���ת���ֵ����һ���ڵ�
        while(temp.next != null){
            temp = temp.next;
        }
        //ֱ�ӽ���ת���ֵ����һ���ڵ��next��Ϊͷ�ڵ�
        temp.next = head;
        return cur;
    }
}