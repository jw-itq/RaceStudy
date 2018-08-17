package leetcode;
/*
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3

思路：
	从头开始遍历这个链表，然后判断它的下一个节点是否还有值，
	如果是空的那就输出，
	如果不是，
		那就判断是不是相等，
			如果不相等，那就继续下一个
			如果相等，那就需要改变当前节点的下一个的指向为下下个
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
