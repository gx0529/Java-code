/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            if(listNode.next != null){
                printListFromTailToHead(listNode.next);
            }
            list.add(listNode.val);
        }
        return list;
    }
}