package unit3;

/*
 * TeX中的引号，一定要记住，碰到什么奇偶，单双数的时候，肯定是要考虑true和false
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
					s+="“";
					f=!f;
				}else{
					s+="”";
					f=!f;
				}*/
				s+=f?"“":"”";//一句就搞定了
				f=!f;
				i++;
			}
			if(i>=ch.length)break;//因为接下来我要追加的不应该是引号了，而是后面的非引号，所以是下一个，但又要考虑最后那个特殊的情况
			s+=ch[i];
		}
		System.out.println(s);
	}
}
