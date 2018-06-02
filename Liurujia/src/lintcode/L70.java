package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 70. �������Ĳ�α��� II

����һ�ö�������������ڵ�ֵ�ӵ����ϵĲ�������
������Ҷ�ڵ����ڲ㵽���ڵ����ڵĲ������Ȼ�����������ұ�����

��˵˼·�ɣ��ҵĴ���˼·���ǰ��ղ�α���һģһ��������Ȼ�������collections��ķ�ת����Ԫ�ص�
�����������������Ԫ�أ�Ҳ�Ǽ��ϣ���ת���õ��ľ��Ǵӵ׵����ı�������

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
