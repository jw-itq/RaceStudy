package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 71. 二叉树的锯齿形层次遍历

给出一棵二叉树，返回其节点值的锯齿形层次遍历（先从左往右，下一层再从右往左，层与层之间交替进行） 

样例

给出一棵二叉树 {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7
返回其锯齿形的层次遍历为：

[
  [3],
  [20,9],
  [15,7]
]

我觉得这题如果是这样的话，那我最直接的想法，就是设置一个标志，准确的说那就是一个布尔变量，
这个布尔变量的作用就是用来判断我这个集合需不需要反转，哈哈，这样子的话，就可以达到一左一右
一右一左的效果吧，来试试把
 */
public class L71 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> queue1 = new LinkedList<>();
		boolean cb = false;
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
			if(ls.isEmpty()){
				break;
			}
			if(cb){
				Collections.reverse(ls);
				list.add(ls);
			}else{
				list.add(ls);
			}
			cb = !cb;
		}
		return list;
    }
}
