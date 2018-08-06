package leetcode;

/*
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

思路：
	现在我的思路就是，依次比较，然后小的那个加入新链表，并且向后面进一个，如果哪个链表提前结束了
	那最后就把还没有结束的链表加入到新链表的后面
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
