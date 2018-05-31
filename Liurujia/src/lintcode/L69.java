package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 69. �������Ĳ�α���

����һ�ö�������������ڵ�ֵ�Ĳ�α��������������ҷ��ʣ�

����

��һ�ö����� {3,9,20,#,#,15,7} ��

˼·�� 
  3
 / \
9  20
  /  \
 15   7
 
��Ȼ���ö��У������������ģ������Ƚ�������ŵ����У�Ȼ���ѭ�������ȳ�����
���Ұ���������뵽list����ȥ��Ȼ���ж��������������������ߵķǿգ��Ǿͼ�
����У����ҽ������ж��ұߵ�

��Ȼͨ���գ���������������˵������������һ��Ҫ�Լ�˼����
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
