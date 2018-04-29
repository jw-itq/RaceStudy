package unit3;

import java.util.Arrays;

/*
 * 
 */
public class Example3_10 {
	public static void main(String[] args) {
//		int[][] lgBox = {{2,3},{2,3},{2,4},{2,4},{3,4},{3,4}};
		String[] box = {"41","41","42","42","32","32"};
		Arrays.sort(box);
		System.out.println(Arrays.toString(box));
		boolean flag = true;
		for(int i = 2;i<5;i++){
			if(box[i].charAt(0)!=box[i+1].charAt(0)){
				flag = false;
			}
		}

		if(!box[0].equals(box[1])){
			System.out.println("no!!!");
		}else if(flag){
			for(int i = 2;i<5;i+=2){
				if(box[i].charAt(1)!=box[i+1].charAt(1)){
					System.out.println("false");
					flag = false;
				}
			}
			
			StringBuffer getC = new StringBuffer(box[2].charAt(1)+""+box[4].charAt(1));
			if(flag&&(box[0].equals(getC)||getC.reverse().toString().equals(box[0]))){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}else{
			System.out.println("false");
		}
	}
}
