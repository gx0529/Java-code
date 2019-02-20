给定一个 N 叉树，返回其节点值的后序遍历。

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return list;
        }
        for(Node node : root.children){
            postorder(node);
        }
        list.add(root.val);
        return list;
    }
}