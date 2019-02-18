给定一个二叉树，返回它的 后序 遍历。

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        TreeNode last = null;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.peek();
            if(top.right == null || top.right == last){
                list.add(top.val);
                TreeNode pop = stack.pop();
                last = top;
            }
            else{
                cur = top.right;
            }
        }
        return list;
    }
}

