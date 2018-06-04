package lintcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 73. ǰ�������������������������

����ǰ�������������������������.

����

�������������[1,2,3]��ǰ�������[2,1,3]. �������µ���:

  2
 / \
1   3

˼·����ǰ��������׸�Ԫ���������������ĸ��ڵ㣬Ҳ���ǿ��Ը�������ڵ㽫��������ֳ�����
����������
1������ǰ������õ����ڵ�root
2���������������������root�ڵ㣬����ҵ�������¼������ڵ�λ�õ��±�index��ֹͣѭ��
3���������������index�ֳ�������������
4����ǰ���������index�ֳ�����������������Ҫע����ǣ������������ͬ��ǰ������ǲ��ϵ������ȡ
	
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
