package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * �������
 * ���������ǿ���������ʾ�����Ǹ�������λ����������ʽ�洢��
 * ���ǵ�ÿ���ڵ�ֻ�洢�������֡���������ӷ���һ���µ�����

����Լ���������� 0 ֮�⣬���������ֶ��������㿪ͷ��

ʾ����

���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
�����7 -> 0 -> 8
ԭ��342 + 465 = 807

��Ϊ�Һ����뵽�������������ʾ������һ������λ��һ���ģ����ԣ���ӵĻ���
�϶�����Ҫ��λ�Ķ�������ˣ�Ҳ����˵ֻ��Ҫһλһλ����Ӳ�������洢��
��������������ͺ���
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
