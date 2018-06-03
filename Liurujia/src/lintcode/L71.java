package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 71. �������ľ���β�α���

����һ�ö�������������ڵ�ֵ�ľ���β�α������ȴ������ң���һ���ٴ������󣬲����֮�佻����У� 

����

����һ�ö����� {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7
���������εĲ�α���Ϊ��

[
  [3],
  [20,9],
  [15,7]
]

�Ҿ�����������������Ļ���������ֱ�ӵ��뷨����������һ����־��׼ȷ��˵�Ǿ���һ������������
����������������þ��������ж�����������費��Ҫ��ת�������������ӵĻ����Ϳ��Դﵽһ��һ��
һ��һ���Ч���ɣ������԰�
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
