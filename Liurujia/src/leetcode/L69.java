package leetcode;
/*
 * ʵ�� int sqrt(int x) ������

���㲢���� x ��ƽ���������� x �ǷǸ�������

���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

ʾ�� 1:

����: 4
���: 2
ʾ�� 2:

����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842..., 
     ���ڷ���������������С�����ֽ�����ȥ��
     
˼·��
	��2��ʼѭ����֪���������һ��λ�ý������������ж�i��ƽ���Ƿ�����������
	������ڣ��Ǿ�ȡ��ǰ���Ǹ�i
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
