package leetcode;

import lintcode.TreeNode;
/*
 * ������������������дһ�����������������Ƿ���ͬ��

����������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�

ʾ�� 1:

����:       1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

���: true
ʾ�� 2:

����:      1          1
          /           \
         2             2

        [1,2],     [1,null,2]

���: false
ʾ�� 3:

����:       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

���: false

˼·��
	���ձ���˳���Ǹ����ҵ�˳�������������ֻҪ���������ڵ㲻һ����������һ��Ϊ�գ�
	����������һ��ֵ����ȣ���ֱ�ӷ���false������������������ϣ��ͷ���true
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
public class L100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null||q==null){
            if(p==q){
                return true;
            }else{
                return false;
            }
		}
        if(p!=null&&q!=null&&q.val!=p.val){
        	return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}
