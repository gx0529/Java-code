
����һ�����нڵ�Ϊ�Ǹ�ֵ�Ķ������������������������ڵ�Ĳ�ľ���ֵ����Сֵ��

ʾ�� :

����:

   1
    \
     3
    /
   2

���:
1

����:
��С���Բ�Ϊ1������ 2 �� 1 �Ĳ�ľ���ֵΪ 1������ 2 �� 3����

class Solution {
    public int pre = -999, min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){
        Traverse(root);
        return min;
    }
    
    public void Traverse(TreeNode root){
        if(root != null){
            if(root.left != null)
                Traverse(root.left);
            if(root.val - pre < min){
                min = root.val - pre; 
            }
            pre = root.val;
            if(root.right != null){
                Traverse(root.right);
            }
        }
    }
}