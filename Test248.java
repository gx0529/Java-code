

�����������

����һ�ö����������������ȡ�
�Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�


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
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 0;
        if(root.left != null){
            left = TreeDepth(root.left);
        }
        int right = 0;
        if(root.right != null){
            right = TreeDepth(root.right);
        }
        return Math.max(left,right)+1;
    }
}