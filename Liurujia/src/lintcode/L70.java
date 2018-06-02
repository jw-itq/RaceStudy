package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 70. 二叉树的层次遍历 II

给出一棵二叉树，返回其节点值从底向上的层次序遍历
（按从叶节点所在层到根节点所在的层遍历，然后逐层从左往右遍历）

先说思路吧，我的大致思路就是按照层次遍历一模一样遍历，然后最后用collections类的反转集合元素的
方法来将集合里面的元素（也是集合）反转，得到的就是从底到顶的遍历次序

 */
public class L70 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> queue1 = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			List<Integer> ls = new ArrayList<>();
			queue1.addAll(queue);
			queue.clear();
			while(!queue1.isEmpty()){
				TreeNode treenode = queue1.poll();
				if(treenode!=null){
					ls.add(treenode.val);
					queue.add(treenode.left);
					queue.add(treenode.right);
				}
			}
			if(!ls.isEmpty()){
				list.add(ls);
			}
		}
		Collections.reverse(list);
		return list;
    }
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
	}
}
