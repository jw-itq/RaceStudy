package leetcode;

/*
 * ����������ָһ���������У��������е�������˳����б������õ���һ��������ǰ�������£�

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 ������  "one 1"  ("һ��һ") , �� 11��
11 ������ "two 1s" ("����һ"��, �� 21��
21 ������ "one 2",  "one 1" ��"һ����" ,  "һ��һ") , �� 1211��

����һ�������� n ������������еĵ� n �

ע�⣺����˳�򽫱�ʾΪһ���ַ�����

ʾ�� 1:

����: 1
���: "1"
ʾ�� 2:

����: 4
���: "1211"

˼·��
1.     1
2.     11
3.     21
4.     1211
5.     111221

	��Ŀ��˼�������ˣ���ô����ô���أ�����������һ�������ַ�������Ҫ����������һ���ǵ�ǰ���ֵĸ���+��ǰ������
	��ǰ�����ֺý�����Ǹ����ȷ����ǰ���ֵĸ����أ�ѭ������������飬���ж����ֵĸ���
 */
public class L38 {
    public String countAndSay(int n) {
        if(n<=0){
        	return null;
        }
        if(n==1){
        	return "1";
        }
        String str = "11A";
        for(int i = 1;i<n-1;i++){
        	//ѭ��str,��������һ���Ƕ���
        	String sr = "";
        	int num = 0;
        	for(int j = 0;j<str.length()-1;j++){
        		if(str.charAt(j)==str.charAt(j+1)){
        			num++;
        		}else{
        			num++;
        			sr+=num+""+str.charAt(j);
        			num = 0;
        		}
        	}
        	str = sr+"A";//�ҼӸ�A��������
        }
        return str.substring(0,str.length()-1);
    }
    
    public static void main(String[] args) {
		for(int i = 1;i<30;i++){
			System.out.println(new L38().countAndSay(i));
		}
	}
}
