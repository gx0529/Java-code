给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isEquals(root.left, root.right);
    }
    public boolean isEquals(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        } else if(node1 != null && node2 != null){
            if(node1.val != node2.val){
                return false;
            }
        } else{
            return false;
        }
        return isEquals(node1.left, node2.right) && isEquals(node1.right, node2.left);
    }
}