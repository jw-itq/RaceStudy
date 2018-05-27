package lintcode;

import java.util.ArrayList;
import java.util.List;

/*
 * ��õĵ��Թ��߾��Ǿ�������ϸ˼��
 * ȫ���У�����
 */
public class W4quan {
	public List<List<String>> qw(String str){
		List<List<String>> list = new ArrayList<>();
		dfs(list,new boolean[str.length()],new ArrayList<String>(),str,0);
		return list;
	}
	
	private void dfs(List<List<String>> list, boolean[] bs,
			ArrayList<String> ls, String str, int t) {
		if(ls.size()==str.length()){
			list.add(new ArrayList<>(ls));
			return;
		}
		if(t>str.length()-1){
			return;
		}
		for(int i = 0;i<str.length();i++){
			if(!bs[i]){
				bs[i] = true;
				ls.add(str.charAt(i)+"");
				dfs(list,bs,ls,str,t+1);
				bs[i] = false;
				ls.remove(ls.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		List<List<String>> ls = new W4quan().qw("abc");
		System.out.println(ls.toString());
	}
}
