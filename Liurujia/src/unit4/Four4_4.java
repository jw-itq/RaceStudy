package unit4;

import java.util.Arrays;

/*
 *��Ϣ����
 *����ͷ$#** /
 *�����ı�0100000101101100011100101000
 *�ҵ��뷨�������Ȱѱ���ͷӳ��Ϊ�Ǹ�01��
 *��˼����һ�£������Ǹ������ı�����Ҫ��˫��ѭ������ֻ��Ҫ��һ��������Ȼ���������Ĳ�ͬ���ı���
 *1ȡ������ֺ�����λ�Ķ����ƵĻ�����ֵ����ʾ�ҽ�����Ҫѭ���Ĵ�����
 *2���ҵ�ѭ�����Ǹ��������õ�����֮ǰ���Ǹ����볤�ȵ����ֵ�ʱ���Ҿ�Ҫ����ȡ�������������
 *3ѭ��û�����ƣ�Ψһ�����ƾ����������������
 */
public class Four4_4 {
	static String[] ys;
	//�ж�t�Ķ������Ƿ���1
	public static boolean isOne(int t){
		if(t==0){
			return false;
		}
		while(t>0){
			if((t&1)==0){
				return false;
			}
			t>>=1;
		}
		return true;
	}
	//����ӳ��01��
	public static void mapping(){
		int i = 0,b = 0,t = 0;//b��ʾ���Ƕ����Ƶ�ʵ�ʴ�С��t��ʾ���Ǵ�0��ʼ������b
		while(i<ys.length){//���for��������ys��ֵ�ģ���ѭ����������ֵ���
			String s = Integer.toBinaryString(b);
			if(isOne(b)&&t!=b){
				ys[i++] = String.format("%0"+s.length()+"d", Integer.parseInt(Integer.toBinaryString(t++)));
			}else{
				t=0;
				b++;
			}
		}
	}
	//�����±�ķ���
	public static int getValue(String s){
		for(int i = 0;i<ys.length;i++){
			if(s.equals(ys[i])){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String bHead = "$#**/";
		String bCode = "0100000101101100011100101000";
//		System.out.println(String.format("%04d", Integer.parseInt(Integer.toBinaryString(0))));
		//��Ҫ������ͷ��һ��ӳ��
		ys = new String[bHead.length()];
		mapping();
		System.out.println("&&&&&&"+Arrays.toString(ys));
		int i = 0;//��Ҫ��һ������
		String s = bCode.substring(i, i+3);
		while(Integer.parseInt(s)!=0){
			i+=3;
			int n = Integer.parseInt(s,2);//2����ת��10����
//			System.out.println(n+"zaizhelizaizheli"+s);
			String sb = bCode.substring(i,i+n);
<<<<<<< HEAD
			System.out.println(Integer.parseInt(sb,2)+"&&&&");
			while(!isOne(Integer.parseInt(sb,2))&&(i+n)<bCode.length()){
				System.out.println(i+"**********************"+(i+n));
				System.out.println(sb);
				System.out.println(bHead.charAt(getValue(sb))+" "+sb);
=======
			int k = Integer.parseInt(sb,2);
			
			while(!isOne(Integer.parseInt(sb,2))&&(i+n)<bCode.length()){
				System.out.println(bHead.charAt(getValue(sb))+" --->"+sb);
>>>>>>> f62d8247e950cef90bc985d02bfb6c84daf99d55
				i+=n;
				sb = bCode.substring(i,i+n);
			}
			i+=n;
			s = bCode.substring(i, i+3);
		}
	}
}
