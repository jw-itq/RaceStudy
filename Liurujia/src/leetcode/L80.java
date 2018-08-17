package leetcode;
/*
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

ʾ�� 1:

����: 1->1->2
���: 1->2
ʾ�� 2:

����: 1->1->2->3->3
���: 1->2->3

˼·��
	��ͷ��ʼ�����������Ȼ���ж�������һ���ڵ��Ƿ���ֵ��
	����ǿյ��Ǿ������
	������ǣ�
		�Ǿ��ж��ǲ�����ȣ�
			�������ȣ��Ǿͼ�����һ��
			�����ȣ��Ǿ���Ҫ�ı䵱ǰ�ڵ����һ����ָ��Ϊ���¸�
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class L80 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listnode = head;
        while(listnode!=null&&listnode.next!=null){
        	if(listnode.val==listnode.next.val){
        		listnode.next = listnode.next.next;
        	}else{
        		listnode = listnode.next;
        	}
        }
        return head;
    }
}
