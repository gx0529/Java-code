package www.bit.java;

class Solution {
    public void deleteNode(ListNode node) {
        //让此节点的val等于下一个节点的val
        node.val = node.next.val;
        //删除此节点的下一个节点
        node.next = node.next.next;
    }
}
