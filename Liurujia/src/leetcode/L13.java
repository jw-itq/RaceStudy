package leetcode;

/*
 * �������ְ������������ַ���I�� V�� X�� L��C��D �� M��

�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��

ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�
����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������

I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

ʾ�� 1:

����: "III"
���: 3
ʾ�� 2:

����: "IV"
���: 4
ʾ�� 3:

����: "IX"
���: 9
ʾ�� 4:

����: "LVIII"
���: 58
����: C = 100, L = 50, XXX = 30, III = 3.
ʾ�� 5:

����: "MCMXCIV"
���: 1994
����: M = 1000, CM = 900, XC = 90, IV = 4.

˼·��
	�ҵ�˼·�������Ǹ�switch case��������Ϊ����������������Ҫ�ľ�����������������
	�����ҵ����߾��ǽ��������������������ΪֻҪ�����������������������ô������
	�����־�ֻ��Ҫ��ӾͿ����ˣ���ô����أ��Ǿ��Ƿ���witch�����жϣ������I,X,C����
	����ĸ�Ļ����Ǿ���Ҫ�����ж���һ����ĸ��������������֮һ���Ǿ�Ҫ������ǰ��һ����
	������������ҲҪ�ӣ�����Ļ����϶����������������棬Ȼ����ȡ�������
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
