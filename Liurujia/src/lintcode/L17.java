package lintcode;

/*
 * �����е��Ӽ�
 * [
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
������ö����Ƶķ�ʽ���ǵݹ�ķ�ʽ
000~111������
 */
public class L17 {
	/*public List<List<Integer>> subsets(int[] nums) {
        // write your code here
		
    }*/
	
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		for(int i = 0;i<=Math.pow(2, 3)-1;i++){
//			System.out.println(Integer.toBinaryString(i));
			String s = Integer.toBinaryString(i);
			int j = 0;
			boolean bool = false;
			while(j<ar.length){
				/*if(){
					
				}*/
			}
		}
	}
}
