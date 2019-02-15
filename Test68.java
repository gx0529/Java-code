
��дһ�������ҵ������������ཻ����ʼ�ڵ㡣


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int headACount=0;
        ListNode Temp=headA;
        while(Temp.next!=null){
            headACount++;
            Temp=Temp.next;
        }
        int headBCount=0;
        Temp=headB;
        while(Temp.next!=null){
            headBCount++;
            Temp=Temp.next;
        }
        int length=headACount>headBCount?headACount-headBCount:headBCount-headACount;
        if(length>0){
            if(headACount>headBCount){
                for(int i=0;i<length;i++){
                    headA=headA.next;
                } 
            }else{
                for(int i=0;i<length;i++){
                    headB=headB.next;
                }  
            }
        }
        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}