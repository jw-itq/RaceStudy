package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 *22. 平面列表

给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。

样例

给定 [1,2,[1,2]]，返回 [1,2,1,2]。

给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。

挑战

请用非递归方法尝试解答这道题。 
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
