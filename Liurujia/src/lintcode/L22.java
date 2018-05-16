package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 *22. ƽ���б�

����һ���б����б��е�ÿ��Ҫ��Ҫô�Ǹ��б�Ҫô��������������һ��ֻ���������ļ��б�

����

���� [1,2,[1,2]]������ [1,2,1,2]��

���� [4,[3,[2,[1]]]]������ [4,3,2,1]��

��ս

���÷ǵݹ鷽�����Խ������⡣ 
 */
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class L22 {
	public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
		List<Integer> list = new ArrayList<>();
		for(NestedInteger i : nestedList){
			if(i.isInteger()){
				list.add(i.getInteger());
			}else{
				list.addAll(flatten(i.getList()));
			}
		}
		return list;
    }
}
