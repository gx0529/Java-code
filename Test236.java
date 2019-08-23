
������ƽ����

ʵ��һ�����������������Ƿ�ƽ�⣬ƽ��Ķ������£��������е�����һ����㣬
�����������ĸ߶Ȳ����1��

����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ�⡣

import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        int left = isHeight(root.left);
        int right = isHeight(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
    public int isHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(isHeight(root.left),isHeight(root.right))+1;
    }
}