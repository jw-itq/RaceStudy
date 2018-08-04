package leetcode;

/*
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

示例 1:

输入: "III"
输出: 3
示例 2:

输入: "IV"
输出: 4
示例 3:

输入: "IX"
输出: 9
示例 4:

输入: "LVIII"
输出: 58
解释: C = 100, L = 50, XXX = 30, III = 3.
示例 5:

输入: "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.

思路：
	我的思路就是用那个switch case来做，因为罗马数字里面最主要的就是那六种特殊的情况
	所以我的主线就是解决这六种特殊的情况，因为只要解决了这六种特殊的情况，那么，其它
	的数字就只需要相加就可以了，怎么解决呢？那就是放在witch里面判断，如果是I,X,C这三
	个字母的话，那就需要继续判断下一个字母，如果正好是情况之一，那就要将变量前进一个，
	并且最终数字也要加，否则的话，肯定会进入其它情况里面，然后提取数字相加
 */
public class L13 {
    public int romanToInt(String s) {
    	int i = 0;
    	int number = 0;
    	s += "T";
        while(i<s.length()){
        	switch (s.charAt(i)) {
			case 'I':
				if(s.charAt(i+1)=='V'){
					number += 4;
					i+=2;
					break;
				}else if(s.charAt(i+1)=='X'){
					number += 9;
					i+=2;
					break;
				}
				number += 1;
				i++;
				break;
			case 'X':
				if(s.charAt(i+1)=='L'){
					number += 40;
					i+=2;
					break;
				}else if(s.charAt(i+1)=='C'){
					number += 90;
					i+=2;
					break;
				}
				number += 10;
				i++;
				break;
			case 'C':
				if(s.charAt(i+1)=='D'){
					number += 400;
					i+=2;
					break;
				}else if(s.charAt(i+1)=='M'){
					number += 900;
					i+=2;
					break;
				}
				number += 100;
				i++;
				break;
			case 'V':
				number += 5;
				i++;
				break;
			case 'L':
				number += 50;
				i++;
				break;
			case 'D':
				number += 500;
				i++;
				break;
			case 'M':
				number += 1000;
				i++;
				break;
			default:
				i++;
				break;
			}
        }
        return number;
    }
    
    public static void main(String[] args) {
		System.out.println(new L13().romanToInt("LVIII"));
	}
}
