package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 69. 二叉树的层次遍历

给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）

样例

给一棵二叉树 {3,9,20,#,#,15,7} ：

思路： 
  3
 / \
9  20
  /  \
 15   7
 
当然是用队列，队列是这样的，就是先将这棵树放到队列，然后进循环，首先出队列
并且把这个数加入到list里面去，然后判断它的左右子树，如果左边的非空，那就加
入队列，并且紧接着判断右边的

竟然通过哒！！！哈哈哈，这说明，遇到问题一定要自己思考！
 */
public class L69 {
	public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
		queue1.add(root);
		while(!queue1.isEmpty()){
			queue.addAll(queue1);
			queue1.clear();
			List<Integer> ls = new ArrayList<>();
			while(!queue.isEmpty()){
				TreeNode treenode = queue.poll();
				if(treenode!=null){
					ls.add(treenode.val);
					queue1.add(treenode.left);
					queue1.add(treenode.right);
				}
			}
			if(!ls.isEmpty()){
				list.add(ls);
			}
		}
		return list;
    }
}
