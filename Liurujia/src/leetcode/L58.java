package leetcode;

/*
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����

˼·��
	����ȥ���ַ�������λ�ո�Ȼ������Կո������Ƭ
 */
public class L58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] ch = s.split(" ");
        return ch[ch.length-1].length();
    }
    
    public static void main(String[] args) {
		System.out.println(new L58().lengthOfLastWord("hello   world "));
	}
}
