package unit3;

import java.util.Arrays;

/*
 * �ݺ����յĴ�
 * �ҵ�˼·������������ά����������㣬��һ�������������ڶ����������
 * ���ҵ��ʵ�ʱ����Ϊû����ϸ�����������ӣ�����˵���´�һ��Ҫ�������ã�
 * ���������ϸ�ڷ��棬�����˼·����û������
 */
public class Example3_6 {
	public static void main(String[] args) {
		char[][] ch = {{'A','T'},{'*','O'}};
		int[][] clone = new int[ch.length][ch[0].length];//���
		int count = 0;
		for(int i = 0;i<ch.length;i++){
			System.out.println(Arrays.toString(clone[i]));
		}
		for(int i=0;i<ch.length;i++){//������Ҫ���б��
			for(int j = 0;j<ch[i].length;j++){
				if(ch[i][j]!='*'&&((i-1)<0||(j-1)<0||(i+1)==ch.length||(j+1)==ch[0].length||ch[i-1][j]=='*'||ch[i][j-1]=='*')){
					count++;
					clone[i][j]=count;
				}
			}
		}
		for(int i = 0;i<ch.length;i++){
			System.out.println(Arrays.toString(clone[i]));
		}
		//���ҵ���
		int i = 0,j = 0;
		while(i<ch.length){//���ѭ����ѭ������
			int t = j;
			if(clone[i][t]!=0){
				String str = clone[i][j]+",";
				while(t!=ch[0].length&&ch[i][t]!='*'){
					str+=ch[i][t];
					t++;
				}
				i++;
				System.out.println("across"+str);
			}else{
				if(++j==ch[0].length){
					j=0;
					i++;
				}
			}
		}
		i = 0;
		j = 0;
		while(i<ch.length){//���ѭ����ѭ������
			int t = j;
			if(clone[t][i]!=0){
				String str = clone[j][i]+",";
				while(t!=ch[0].length&&ch[t][i]!='*'){
					str+=ch[t][i];
					t++;
				}
				i++;
				System.out.println("down"+str);
			}else{
				if(++j==ch[0].length){
					j=0;
					i++;
				}
			}
		}
	}
}
