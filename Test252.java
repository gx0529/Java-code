�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��

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
    //��ջ�б���root1������root2��ͬ�ĸ��ڵ�
    Stack<TreeNode> stack = new Stack<>();
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //������������һ����������
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
        //�ݹ��ж����Ƿ����
        return (root.val == root2.val) &&
            isTrue(root.left, root2.left) &&
            isTrue(root.right, root2.right);
    }
    public void isFind(TreeNode root1,TreeNode root2){
        if(root1.val == root2.val){ 
            //���root1���еĽڵ�ֵ����root2�ĸ��ڵ�ֵ������ջ
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