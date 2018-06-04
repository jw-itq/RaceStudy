package lintcode;

import java.util.Arrays;

/*
 * ��������ͺ�����������������
 * 
 * ˼·�������ģ��������׿���������Ȳ�̸����Ȼ��������Ҫ�ģ�
 * 1���Ӻ�����������������Ǹ�Ԫ�أ���Ϊ���Ԫ���Ǹ��ڵ�
 * 2����������������ҵ����Ԫ������Ӧ���±�
 * 3�������±����������������������������
 * 4������С���ú��������������������������Ҫע����ǣ����index�±꣬�ں����������Ҳ���Էֿ����ң�
 * 5���½�һ��������
 * 6���ֱ�ݹ���߸��ұߵ�
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
