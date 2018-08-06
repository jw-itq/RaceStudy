package leetcode;

/*
 * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 

ʾ����

���룺1->2->4, 1->3->4
�����1->1->2->3->4->4

˼·��
	�����ҵ�˼·���ǣ����αȽϣ�Ȼ��С���Ǹ���������������������һ��������ĸ�������ǰ������
	�����Ͱѻ�û�н�����������뵽������ĺ���
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class L21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1==null&&l2!=null){
    		return l2;
    	}
    	if(l2==null&&l1!=null){
    		return l1;
    	}
        if(l1==null||l2==null){
        	return null;
        }
        ListNode listnode = null;
        if(l1.val<l2.val){
        	listnode = new ListNode(l1.val);
        	l1 = l1.next;
        }else{
        	listnode = new ListNode(l2.val);
        	l2 = l2.next;
        }
        ListNode node = listnode;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		node.next = new ListNode(l1.val);
//        		node.val = l1.val;
        		node = node.next;
        		l1 = l1.next;
        	}else{
        		node.next = new ListNode(l2.val);
//        		node.val = l2.val;
        		node = node.next;
        		l2 = l2.next;
        	}
        }
        if(l1!=null){
        	node.next = l1;
        }else if(l2!=null){
        	node.next = l2;
        }
        return listnode;
    }
    
}
