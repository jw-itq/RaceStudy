package unit3;

import java.util.Arrays;

/*
 * ����
 * ��ʵ���⾭������֮��ͱ����һ����������������
 * a�ϣ�b�£�l��r��
 */
public class Example3_5 {
	public static void main(String[] args) {
		char[][] ch = {{'T','R','G','S','J'},
					   {'X','D','O','K','I'},
					   {'M','0','V','L','N'},
					   {'W','P','A','D','E'},
					   {'U','Q','H','C','F'}};
		int x = 2,y = 1;//���ʾ����0��λ�ã��ҵ���Ҫ��ʱ�ı��
		String pz = "ARRBBL0";
		for(int i = 0;i<pz.length();i++){
			//��������x��y�����Ӽӣ�Ӧ��Ҫ��ǰ���жϲ���Խ���
			if(pz.charAt(i)=='A'){
				char t = ch[x-1][y];
				ch[x-1][y]=ch[x][y];
				ch[x][y]=t;
				x--;
			}else if(pz.charAt(i)=='B'){
				char t = ch[x+1][y];
				ch[x+1][y]=ch[x][y];
				ch[x][y]=t;
				x++;
			}else if(pz.charAt(i)=='L'){
				char t = ch[x][y-1];
				ch[x][y-1]=ch[x][y];
				ch[x][y]=t;
				y--;
			}else if(pz.charAt(i)=='R'){
				char t = ch[x][y+1];
				ch[x][y+1]=ch[x][y];
				ch[x][y]=t;
				y++;
			}else{
				break;
			}
		}
		for(int i = 0;i<ch.length;i++){
			System.out.println(Arrays.toString(ch[i]));
		}
	}
}
