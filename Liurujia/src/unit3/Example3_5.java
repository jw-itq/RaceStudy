package unit3;

import java.util.Arrays;

/*
 * 谜题
 * 其实这题经过分析之后就变成了一个交换变量的题了
 * a上，b下，l左，r右
 */
public class Example3_5 {
	public static void main(String[] args) {
		char[][] ch = {{'T','R','G','S','J'},
					   {'X','D','O','K','I'},
					   {'M','0','V','L','N'},
					   {'W','P','A','D','E'},
					   {'U','Q','H','C','F'}};
		int x = 2,y = 1;//这表示的是0的位置，我等下要随时改变的
		String pz = "ARRBBL0";
		for(int i = 0;i<pz.length();i++){
			//在这里面x，y减减加加，应该要在前面判断不能越界的
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
