package unit3;

/*
 * TeX�е����ţ�һ��Ҫ��ס������ʲô��ż����˫����ʱ�򣬿϶���Ҫ����true��false
 */
public class Three_3_3_1 {
	public static void main(String[] args) {
		String str = "\"To be or not to be,\" quoth the Bard, \"that is the question\"";
		char[] ch = str.toCharArray();
		boolean f = true;
		String s = "";
		for(int i = 0;i<ch.length;i++){
			if(ch[i]=='"'){
				/*if(f){
					s+="��";
					f=!f;
				}else{
					s+="��";
					f=!f;
				}*/
				s+=f?"��":"��";//һ��͸㶨��
				f=!f;
				i++;
			}
			if(i>=ch.length)break;//��Ϊ��������Ҫ׷�ӵĲ�Ӧ���������ˣ����Ǻ���ķ����ţ���������һ��������Ҫ��������Ǹ���������
			s+=ch[i];
		}
		System.out.println(s);
	}
}
