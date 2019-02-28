
给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。

示例 :

输入:

   1
    \
     3
    /
   2

输出:
1

解释:
最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。

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