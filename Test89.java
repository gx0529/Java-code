
�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�

��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��

ʾ����
���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)

�����7 -> 0 -> 8
ԭ��342 + 465 = 807

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //�ȴ���һ���������ͷ���
        ListNode newNode = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode cur = newNode;
        //����һ����λ��־
        int num = 0;
        //ֻҪ��һ������ͽ���ѭ��
        while(p1 != null || p2 != null){
            int n1 = (p1 != null) ? p1.val:0;
            int n2 = (p2 != null) ? p2.val:0;
            //�����������Ӧ�Ľڵ�ֵ���
            int sum = n1+n2+num;
            //�ж���û�н�λ
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
        //������һ����Ӻ��ֵ�н�λ�����ڽ�һ���½ڵ�
        if(num > 0){
            cur.next = new ListNode(num);
        }
        return newNode.next;
    } 
}