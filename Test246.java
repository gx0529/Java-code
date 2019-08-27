����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
���������ǰ���������������Ľ���ж������ظ������֡�
��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�


import java.util.*;

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0){
            return null;
        }
        TreeNode node = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }
    public TreeNode reConstructBinaryTree
        (int[] pre,int pLeft,int pRight,int[] in,int iLeft,int iRight){
        if(pLeft > pRight){
            return null;
        }
        TreeNode root = new TreeNode(pre[pLeft]);
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[pLeft]){
                root.left=reConstructBinaryTree(pre,pLeft+1,pLeft+i-iLeft,in,iLeft,i-1);
                root.right=reConstructBinaryTree(pre,pLeft+i-iLeft+1,pRight,in,i+1,iRight);
            }
        }
        return root;
    }
}