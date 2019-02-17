����һ������������������ ǰ�� ������

 ʾ��:

����: [1,null,2,3]  
   1
    \
     2
    /
   3 

���: [1,2,3]

�ݹ飺
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){

            return list;

        }

        list.add(root.val);

        if(root.left != null){

            list.addAll(preorderTraversal(root.left));

        }

        if(root.right != null){

            list.addAll(preorderTraversal(root.right));

        }

        return list;

    }

}

�ǵݹ飺
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
        return list;
    }
}