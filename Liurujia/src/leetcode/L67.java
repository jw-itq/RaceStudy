package leetcode;
/*
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����

����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��

ʾ�� 1:

����: a = "11", b = "1"
���: "100"
ʾ�� 2:

����: a = "1010", b = "1011"
���: "10101"

˼·��
	����ת����ʮ���ƣ�Ȼ�����֮�󽫽����ת��2���ƣ�������λ������������Ƶ�λ��̫�࣬
	��ʾ����10���ƣ���û�п��ܡ�������Ϊ�˱�����������ķ�������Ӧ�ò�ȡ���������ϰ취
	�Ǿ����������
	1����ӹ���1+0=1��1+1=0**��1��Ҳ������������Ӵ���1����������0+0=0
	2,��������ַ�������һ����
		���ұ����ֱ��ʹ��ѭ����������⣬����������Ǹ�����
	3����������ַ����ĳ��Ȳ�һ�����أ�����Ӧ�ð�����������֣�һ��������ַ�������һ����
		���֣�һ����ǰ�벿�֣���������Ҫʵ�������Ҳ�ʵ�����ǲ���֪��������Ȳ�һ��
		�ǾͰѶ̵��Ǹ��ַ���ǰ��ȫ����0����ͺ���
 */
public class L67 {
    public String addBinary(String a, String b) {
        if(a.length()==0||b.length()==0||a==null||b==null){
        	return "";
        }
        if(a.length()!=b.length()){
        	String cop = "";
        	if(a.length()>b.length()){
        		for(int i = 0;i<a.length()-b.length();i++){
        			cop+="0";
        		}
        		cop += b;
        		b = cop;
        	}else{
        		for(int i = 0;i<b.length()-a.length();i++){
        			cop += "0";
        		}
        		cop += a;
        		a = cop;
        	}
        }
        
        String s = "";
        int num = 0;
        if(a.length()==b.length()){
        	for(int i = a.length()-1;i>=0;i--){
        		int sum = Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+num;
        		if(sum==2){
        			s += 0;
        			num = 1;
        		}else if(sum==3){
        			s += 1;
        			num = 1;
        		}else{
        			s += sum;
        			num = 0;
        		}
        	}
        }
        if(num!=0){
        	s += num;
        }
        StringBuffer st = new StringBuffer(s);
        return st.reverse()+"";
    }
    public static void main(String[] args) {
		System.out.println(new L67().addBinary("1101", "11"));
	}
}
