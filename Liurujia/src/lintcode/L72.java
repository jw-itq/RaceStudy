package lintcode;

import java.util.Arrays;

/*
 * 中序遍历和后序遍历树构造二叉树
 * 
 * 思路是这样的，首先我抛开特殊情况先不谈哈，然后我来主要的，
 * 1，从后序遍历里面获得最后的那个元素，因为这个元素是跟节点
 * 2，从中序遍历里面找到这个元素所对应的下标
 * 3，根据下标获得中序遍历里面左子树跟右子树
 * 4，根据小标获得后序遍历的左子树和右子树（需要注意的是，这个index下标，在后序遍历里面也可以分开左右）
 * 5，新建一个二叉树
 * 6，分别递归左边跟右边的
 */
public class L72 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
		if(inorder.length==0||postorder.length==0){
			return null;
		}
		if(inorder.length==1){
			return new TreeNode(inorder[0]);
		}
		int root = postorder[postorder.length-1];
		int index = 0;
		for(int i = 0;i<inorder.length;i++){
			if(inorder[i] == root){
				index = i;
				break;
			}
		}
		
		int[] inleft = Arrays.copyOfRange(inorder, 0, index);
		int[] postleft = Arrays.copyOfRange(postorder, 0, index);
		
		int[] inright = Arrays.copyOfRange(inorder, index+1, inorder.length);
		int[] postright = Arrays.copyOfRange(postorder, index, postorder.length-1);
		
		TreeNode treenode = new TreeNode(root);
		treenode.left = buildTree(inleft, postleft);
		treenode.right = buildTree(inright, postright);
		return treenode;
    } 
}
