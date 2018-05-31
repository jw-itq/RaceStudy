package lintcode;

import java.util.ArrayList;
/*
 * 66. ��������ǰ�����

����һ�ö�������������ڵ�ֵ��ǰ�������

����

����һ�ö����� {1,#,2,3},

�����ҵ��뷨���ǵݹ飬�������ģ��ݹ���뷨������Ϊÿ���ڵ㶼��һ����
Ȼ������˵�������������-���ǵ�������ڵ���һ���սڵ��ʱ��ͽ���
��Ϊÿ���ڵ㶼����������-left��right������˵Ҫ�ֱ�ݹ�����������
��������и�������list�����������ǲ��ϼ�¼�ǿ�����ֵ----�ðɣ��Ҹղž�Ȼ
��֪������ǰ��������ȱ�����ߵ�����Ȼ������ұߵ�����
��������أ��Ǿ����ȱ�����ߵ�������ʵ������������룬û��ʲô����ұߣ�
ֻ��һ��������Ϊÿ���ڵ����һ������������������������������ȵݹ�ݹ�
�ݹ�ݹ�εεει������ߵģ��ȵ��յ�ʱ���ҾͿ��Է��أ����ص����ұ���Ϊ��
�ĸ��ڵ㣡Ȼ���ұߵģ��ұ�һ���ģ����еĹ���ǧ���ȥ��
����������ǻ���˵�ֱ��˵˼��͹��ˣ������ȱ�������Ȼ�������
��α�������α�������˼˵���ǰ��ն������Ĳ����������ҵı���
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
