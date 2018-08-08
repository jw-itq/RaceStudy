package leetcode;
/*
 * ʵ�� strStr() ������

����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��

ʾ�� 1:

����: haystack = "hello", needle = "ll"
���: 2
ʾ�� 2:

����: haystack = "aaaaa", needle = "bba"
���: -1
˵��:

�� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣

���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������

˼·��
	������һ���ַ�����Ȼ������ڶ����ַ����ĵ�һ���ַ���ȵ��Ǹ��ַ���λ�ã������λ�ÿ�ʼ���αȽ�
 */
public class L28 {
    public int strStr(String haystack, String needle) {
    	if(needle.length()==0||needle==null){
    		return 0;
    	}
    	if(haystack.length()==0||haystack==null||haystack.length()<needle.length()){
    		return -1;
    	}
        for(int i = 0;i<haystack.length();i++){
        	if(haystack.charAt(i)==needle.charAt(0)){
        		if((i+needle.length())>haystack.length()){
        			return -1;
        		}else for(int j = i,t = 0;j<haystack.length()&&t<needle.length();j++,t++){
        			if(haystack.charAt(j)!=needle.charAt(t)){
        				break;
        			}
        			if(t+1==needle.length()){
        				return i;
        			}
        		}
        	}
        }
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(new L28().strStr("abcdeacc", "acc"));
	}
}
