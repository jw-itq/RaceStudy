package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 两数相加
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，
 * 它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

因为我后来想到，这个链表所表示的数不一定就是位数一样的，所以，相加的话，
肯定就是要高位的对齐就行了，也就是说只需要一位一位的相加并将结果存储起
来，最后放入链表就好了
 */

class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
public class L2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String s = "";
        int j = 0;
        while(l1!=null||l2!=null){
        	int t1 = 0,t2 = 0;
        	if(l1!=null){
                t1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                t2 = l2.val;
                l2 = l2.next;
            }
            int sum = t1+t2+j;
            j = sum/10;
        	s += sum%10;
        }
        if(j>0){
            s += j;
        }
        ListNode ln = new ListNode(Integer.parseInt(s.charAt(0)+""));
        ListNode lnt = ln;
        for(int i = 1;i<s.length();i++){
        	lnt.next = new ListNode(Integer.parseInt(s.charAt(i)+""));
            lnt = lnt.next;
        }
        return ln;
    }
	
	public static void main(String[] args) {
		String s = 1+"";
		s += 2+3;
		System.out.println(s);
	}
}
