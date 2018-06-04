package lintcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 73. 前序遍历和中序遍历树构造二叉树

根据前序遍历和中序遍历树构造二叉树.

样例

给出中序遍历：[1,2,3]和前序遍历：[2,1,3]. 返回如下的树:

  2
 / \
1   3

思路就是前序遍历的首个元素是中序遍历里面的根节点，也就是可以根据这个节点将中序遍历分成左右
两个子树，
1，根据前序遍历得到根节点root
2，在中序遍历里面查找这个root节点，如果找到立即记录下这个节点位置的下标index，停止循环
3，将中序遍历根据index分成左右两个子树
4，将前序遍历根据index分成左右两颗子树，需要注意的是，跟后序遍历不同，前序遍历是不断的向后面取
	
 */
public class L73 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
		if(preorder.length==0||inorder.length==0){
			return null;
		}
		if(preorder.length==1){
			return new TreeNode(preorder[0]);
		}
		
		int root = preorder[0];
		int index = 0;
		for(int i = 0;i<inorder.length;i++){
			if(inorder[i] == root){
				index = i;
				break;
			}
		}
		
		int[] inleft = Arrays.copyOfRange(inorder, 0, index);
		int[] preleft = Arrays.copyOfRange(preorder, 1, index+1);
		
		int[] inright = Arrays.copyOfRange(inorder, index+1, inorder.length);
		int[] preright = Arrays.copyOfRange(preorder, index+1, preorder.length);
		
		TreeNode treenode = new TreeNode(root);
		treenode.left = buildTree(preleft, inleft);
		treenode.right = buildTree(preright, inright);
		return treenode;
    }
}
