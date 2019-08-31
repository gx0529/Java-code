输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

import java.util.*;
public class Solution {
    //在栈中保存root1树中与root2相同的根节点
    Stack<TreeNode> stack = new Stack<>();
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //空树不是任意一个树的子树
        if(root1==null || root2==null){
            return false;
        }
        return isSubtree(root1,root2);
    }
    public boolean isSubtree(TreeNode root1, TreeNode root2){
        isFind(root1,root2);
        boolean ret = false;
        while(!stack.isEmpty()){
            ret = isTrue(stack.pop(),root2);
            if(ret == true){
                return ret;
            }
        }
        return ret;
    }
    public boolean isTrue(TreeNode root, TreeNode root2){
        if(root == null && root2 == null){
            return true;
        }
        if(root2 == null){
            return true;
        }
        if(root == null){
            return false;
        }
        //递归判断树是否相等
        return (root.val == root2.val) &&
            isTrue(root.left, root2.left) &&
            isTrue(root.right, root2.right);
    }
    public void isFind(TreeNode root1,TreeNode root2){
        if(root1.val == root2.val){ 
            //如果root1树中的节点值等于root2的根节点值，则入栈
            stack.push(root1);
        }
        if(root1.left != null){
            isFind(root1.left,root2);
        }
        if(root1.right != null){
            isFind(root1.right, root2);
        }
    }
}