package lintcode;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ���������л�
 */

//Definition of TreeNode:

public class L7 {
	public static Queue<TreeNode> queue = new LinkedList<>();//���ڱ��潫���ṹ���л����ַ���ʱʹ��������   
    public static Queue<TreeNode> dataqueue = new LinkedList<>();//���ڽ��ַ����ṹ�����л�����ʱʹ��������ڵ�  
    public String string = "";  
  
    public String serialize(TreeNode root) {  
        // write your code here  
        if (root == null) {//������ڵ�Ϊ�գ�������Ϊ�գ����ء�#��  
            return "#";  
        } else {  
            queue.add(root);//���ڵ㲻Ϊ�գ��������  
            while (!queue.isEmpty()) {//ֱ������Ϊ�գ�������ѭ��  
                TreeNode treeNode = queue.poll();//ÿ��ȡ�����еĵ�һ�Ľڵ�  
                if (treeNode == null)//���Ϊ�գ���ôֱ�������#�������ٰѸõ�������ӽڵ�������  
                    string = string + "#" + ",";  
                else {//�ýڵ㲻Ϊ�գ���Ѹõ��ֵ�������ַ�������  
                        string = string + treeNode.val + ",";  
                        queue.add(treeNode.left);//�ýڵ㲻Ϊ�գ���ô���������ӽڵ㶼Ҫ�ӽ�ȥ������Ϊ�գ����ܲ�Ϊ�գ��ӽ�ȥ���ж�  
                        queue.add(treeNode.right);//�Ӷ�����ȡ�������ж��ǲ���Ϊ�գ�Ϊ����û����һ����  
                    }  
                }  
            }  
            string = string.substring(0, string.length() - 2);//������ġ�����ȥ��  
            return string;  
        }  
  
    /** 
     * This method will be invoked second, the argument data is what exactly you 
     * serialized at method "serialize", that means the data is not given by 
     * system, it's given by your own serialize method. So the format of data is 
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method. 
     */  
    public TreeNode deserialize(String data) {  
        // write your code here  
        String[] strs = data.split(",");//���ݡ��������ָ���Ϊ�ַ�������  
        if (strs.length == 0||data.equals("#")) {//�ж��ַ��������ǵ���#����Ϊ��  
            TreeNode rooTreeNode = null;  
            return rooTreeNode;//ֱ�ӷ��ؿո��ڵ�  
        } else {//������������һ��Ԫ��  
            TreeNode rootNode = new TreeNode(Integer.parseInt(strs[0]));//�õ�����ĵ�һ��Ԫ��  
            dataqueue.add(rootNode);//�Ѹ��ڵ�ӽ�ȥ�����У�˼·�ǰ��Ѿ������õĽڵ�ӽ�ȥ�����У�  
            int i = 1;//�´�ȡ���ڶ���Ԫ��  
            while (!dataqueue.isEmpty() && i < strs.length) {//ֱ������Ϊ�գ�����������Ԫ�ر�ȡ����  
                TreeNode treeNode = dataqueue.poll();//ÿ�ε������еĵ�һ���ڵ㣬�ֱ������ҽڵ�  
                if (strs[i].equals("#")) {//������ڡ�#��,��ôȡ����������ڵ����ڵ�Ϊ��  
                    treeNode.left = null;  
                    i++;  
                } else {//������ǿսڵ㣬��ô����Ҫ������ڵ��������У�����ζ������ڵ���ܻ����ӽڵ�  
                    treeNode.left = new TreeNode(Integer.parseInt(strs[i]));  
                    dataqueue.add(treeNode.left);  
                    i++;  
                }//��������ж��ҽڵ㣬ע�⣬�п������鱻ȡ���ˣ�Ҳ����û���ҽڵ���  
                
                if (i < strs.length&&strs[i].equals("#") ) {  
                    treeNode.right = null;  
                    i++;  
                } else if(i < strs.length&& !strs[i].equals("#")){  
                    treeNode.right = new TreeNode(Integer.parseInt(strs[i]));  
                    dataqueue.add(treeNode.right);  
                    i++;  
                }  
  
            }  
            return rootNode;  
        }  
    } 
  //�����棬����Ҫ����ʹ���˶��е����ݽṹ��Ȼ��ѵ�һ���ڵ�ӽ�ȥ����Ϊ�գ���
    //��ÿ�δӶ�����ȡ���ڵ㣬ֱ�������еĽڵ㱻ȡ�꣬��Ȼ����ѭ���У���������������ڵ㲻Ϊ�գ�  
  //�ͻ��������м���ڵ㣩��������ʵ���ˣ�ͬһ��Ķ��ǰ��ż�����еģ�������ʱ��
    //Ҳ�ǽ����ŵģ������ǲ��ϵݹ鵽��ײ㣬���Ⱥ�����ͬһ��������ڵ㡣
    
    public static void main(String[] args) {
		String str = "3,9,20,#,#,15,7";
		TreeNode tree = new L7().deserialize(str);
		System.out.println(new L7().serialize(tree));
	}
}
