package unit3;

/*
 * �÷�
 * ����һ�����������O,�Ϳ�ʼ�ۼӣ�ֻҪ����X�˾����ۼ�ֹͣ
 */
public class Example3_1 {
	//�ݹ�ķ�ʽд�ķǳ����鷳��������Ŀǰֻ�������˼��
	public static int f(String str,int i,int sum,int count){
		if(i==str.length()){
			return sum;
		}
		if(str.charAt(i)=='O'){
			count++;
			return f(str,i+1,sum+count,count);
		}else{
			return f(str,i+1,sum,0);
		}
	}
	//���������Ҵ�ͳ�ķ�ʽ
	public static void main(String[] args) {
		String str = "OOXXOXXOOO";
		int sum = 0;
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)=='O'){
				count++;
				sum+=count;
			}else{
				count=0;
				sum+=count;
			}
		}
		System.out.println(f(str,0,0,0));
	}
}
