package leetcode;

/*
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。

思路：
	这个题我要解决这样几个问题：
	1，怎么反转
		我可以把它转换成字符串，然后遍历字符串，就可以得到反转后的字符串
	2，怎么处理符号
		我可以设置一个标志int t = 1,如果小于0，我将它置-1，否则不变，最后将它与结果相乘
	3，怎么处理那个0
		只需要我最后把字符串再转换成int的时候那个0自然不见了
	4，怎么判断溢出
		因为如果这个已经转换之后的数已经溢出了，那就不能做比较，不过可以将它转换成大数，这样也是可以做比较的
	5，如何保证在这个范围里面
		这个我可以利用integer对象自带的两个常量来判断
 */
public class L7 {
	public int reverse(int x) {
        int t = 1;
        String st = x+"";
        //统一字符串并改变标志
        if(x<0){
        	st = st.substring(1);
        	t = -1;
        }
        //反转字符串
        String s = "";
        for(int i = st.length()-1;i>=0;i--){
        	s += st.charAt(i);
        }
        //判断溢出，将其转换成大数
        double big = Double.parseDouble(s);
        if(big>=Integer.MAX_VALUE||big<=Integer.MIN_VALUE){
        	return 0;
        }
        //转换成数字并且与t相乘
        int number = Integer.parseInt(s)*t;
        return number;
    }
	public static void main(String[] args) {
		System.out.println(new L7().reverse(-1234585552));
	}
}
