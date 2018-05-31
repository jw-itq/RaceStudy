package lintcode;

import java.util.ArrayList;
/*
 * 66. 二叉树的前序遍历

给出一棵二叉树，返回其节点值的前序遍历。

样例

给出一棵二叉树 {1,#,2,3},

这题我的想法就是递归，是这样的，递归的想法就是因为每个节点都是一棵树
然后先来说下这个结束条件-就是当我这个节点是一个空节点的时候就结束
因为每个节点都有两个子树-left和right，所以说要分别递归这两颗子树
最后里面有个参数是list，它的作用是不断记录非空树的值----好吧，我刚才竟然
不知道这是前序遍历（先遍历左边的树，然后遍历右边的树）
中序遍历呢？那就是先遍历左边的树，其实这个可以这样想，没有什么左边右边，
只有一个根，因为每个节点就是一棵树，树里面才有左右两个子树，先递归递归
递归递归滴滴滴滴归调用左边的，等到空的时候我就可以返回，返回的是我本次为空
的父节点！然后右边的，右边一样的，其中的过程千万别去想
后序遍历？那还用说嘛，直接说思想就够了，就是先遍历左右然后遍历根
层次遍历？层次遍历的意思说的是按照二叉树的层数左右左右的遍历
 */
import java.util.List;

public class L66 {
	public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
		List<Integer> list = new ArrayList<>();
		promate(list,root);
		return list;
    }

	private void promate(List<Integer> list, TreeNode root) {
		if(root==null){
			return;
		}
		list.add(root.val);
		promate(list, root.left);
		promate(list, root.right);
	}
}
