package leetcode;

import lintcode.TreeNode;

/*
 * ����һ����������������Ƿ��Ǿ���ԳƵġ�

���磬������ [1,2,2,3,4,4,3] �ǶԳƵġ�

    1
   / \
  2   2
 / \ / \
3  4 4  3
����������� [1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:

    1
   / \
  2   2
   \   \
   3    3
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class NL101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
        	return true;
        }
        return comRoot(root.left,root.right);
    }

	private boolean comRoot(TreeNode left, TreeNode right) {
		if(left==null){
			return right==null;
		}
		if(right==null){
			return false;
		}
		if(left.val!=right.val){
			return false;
		}
		return comRoot(left.right, right.left)&&comRoot(left.left, right.right);
	}
}
