package lintcode;

/*
 * 74. ��һ������Ĵ���汾

�����İ汾���Ǵ� 1 �� n ��������ĳһ�죬�����ύ�˴���汾�Ĵ��룬����������֮��汾�Ĵ����ڵ�Ԫ�����о��������ҳ���һ������İ汾�š�

�����ͨ�� isBadVersion �Ľӿ����жϰ汾�� version �Ƿ��ڵ�Ԫ�����г�������ӿ�����͵��÷�����������ע�Ͳ��֡�

����

���� n=5

����isBadVersion(3)���õ�false

����isBadVersion(5)���õ�true

����isBadVersion(4)���õ�true

��ʱ���ǿ��Զ϶�4�ǵ�һ������İ汾��
 */
/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/

public class L74 {
	/*public int findFirstBadVersion(int n) {
        // write your code here
		int left = 0;
		int right = n;
		while(left+1<right){
			int center = left + (right - left)/2;
			if(SVNRepo.isBadVersion(center)){
				right = center;
			}else{
				left = center;
			}
		}
		if(SVNRepo.isBadVersion(left)){
			return left;
		}else{
			return right;
		}
    }*/
}
