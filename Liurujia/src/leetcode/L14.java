package leetcode;

/*
 * ��дһ�������������ַ��������е������ǰ׺��

��������ڹ���ǰ׺�����ؿ��ַ��� ""��

ʾ�� 1:

����: ["flower","flow","flight"]
���: "fl"
ʾ�� 2:

����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��
˵��:

��������ֻ����Сд��ĸ a-z ��

˼·��
	�Ҹо�������򵥣�ֱ�ӵ�˼·���Ǳ�������ַ������飬
	Ȼ�����Σ��������ͷ�Ƚϵ�β��Ȼ��������ƥ��ģ��Ǿͽ��������ؿգ������������ַ������������Ǿ�ֱ�ӷ���
	�����һ�����ǿյĻ������߸ɴ�˵������Ϊ�յĻ������Ҿ�Ӧ��ֱ�ӷ��ؿգ�������ѭ������Ӧ���о��������
	
�ܽ᣺��ʵ���Ⲣ���ѣ������ǿ��ǵ������Ҫ��ȫ�����о����ַ����Ƚ��������equals�����ǵĻ��ǲ���ȫ��˼·��������
 */
public class L14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0||strs[0].equals("")||strs[0]==null){
    		return "";
    	}
    	if(strs.length==1){
    		return strs[0];
    	}
        int number = 0;
        while(true){
        	for(int i = 1;i<strs.length;i++){
        		if(strs[i].equals("")||strs[i]==null){
        			return "";
        		}
        		if(strs[0].length()-1<number||strs[i].length()-1<number){
        			return strs[0].substring(0,number);
        		}
        		if(strs[0].charAt(number)!=strs[i].charAt(number)){
        			if(number==0){
        				return "";
        			}else{
        				return strs[0].substring(0,number);
        			}
        		}
        	}
        	number++;
        }
    }
    
    public static void main(String[] args) {
    	String[] str = {""};
    	System.out.println(str.length+"---"+str[0]);
		System.out.println(new L14().longestCommonPrefix(str));
	}
}
