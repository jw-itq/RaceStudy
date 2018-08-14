package leetcode;
/*
 * 实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2
示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842..., 
     由于返回类型是整数，小数部分将被舍去。
     
思路：
	从2开始循环，知道这个数的一半位置结束，来不断判断i的平方是否大于这个数，
	如果大于，那就取它前面那个i
 */
public class L69 {
    public int mySqrt(int x) {
    	int half = x/2;
    	if(x<=20){
    		half = x;
    	}
        for(int i = 2;i<=half;){
        	int t = i*i;
        	if(t<0){
        		for(int b = i-1;b>=i/2;b--){
        			int tem = b*b;
        			if(tem<0){
        				continue;
        			}
        			if(b*b<=x){
        				return b;
        			}
        		}
        	}
        	if(t>x){
        		return i-1;
        	}
        	if(t==x){
        		return i;
        	}
        	int c = (i*2)*(i*2);
        	if(c<half){
        		i = i*2;
        		continue;
        	}
        	i++;
        }
        return x;
    }
    
    public static void main(String[] args) {
		System.out.println(new L69().mySqrt(5));
	}
}
