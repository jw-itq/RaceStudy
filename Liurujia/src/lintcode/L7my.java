package lintcode;

import java.util.LinkedList;
import java.util.Queue;
/*
 * ���л��Լ���ʵ��
 */
/*class TreeNode{
	public int var;
	public TreeNode left,right;
	public TreeNode(int var){
		this.var = var;
		this.left = this.right = null;
	}
}*/
public class L7my {
	private Queue<TreeNode> que = new LinkedList<>();//�û����л��Ķ���
	private Queue<TreeNode> fque = new LinkedList<>();//���ڷ����л��Ķ���
	
	/**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {//���л�
        // write your code here
    	String str = "";
    	//�����ж����ǲ���һ���յ���
    	if(root == null){
    		return "#";
    	}else{//�������㲻��һ�������������Ҿ���Ҫ�������뵽��������
    		que.offer(root);
    		//��������ʼѭ������������,ֻҪ���ǿ�
    		while(!que.isEmpty()){
    			//�����У��������ж�����������������ַ�����ʽ
    			TreeNode treenode = que.poll();
    			if(treenode == null){
    				str += "#,";
    			}else{
    				str += treenode.val+",";
    				que.offer(treenode.left);
    				que.offer(treenode.right);
    			}
    		}
    	}
    	//��������ȥ�������Ǹ�����
    	return str.substring(0,str.length()-1);
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
    	String[] str = data.split(",");
    	// �����һ������жϼ��˵����
    	if(data.length()==0||data.equals("#")){
    		return null;
    	}else{
    		TreeNode rootNode = new TreeNode(Integer.parseInt(str[0]));
    		fque.offer(rootNode);
    		int i = 1;
    		while(i<str.length&&!fque.isEmpty()){
    			TreeNode treenode = fque.poll();
    			if(str[i].equals("#")){
    				treenode.left = null;
    				i++;
    			}else{
    				TreeNode tleft = new TreeNode(Integer.parseInt(str[i]));
    				treenode.left = tleft;
    				fque.offer(tleft);
    				i++;
    			}
    			
    			if(i<str.length&&str[i].equals("#")){
    				treenode.right = null;
    				i++;
    			}else if(i<str.length){
    				TreeNode tright = new TreeNode(Integer.parseInt(str[i]));
    				treenode.right = tright;
    				fque.offer(tright);
    				i++;
    			}
    		}
    		return rootNode;
    	}
    }
    
    public static void main(String[] args) {
    	String str = "3,9,20,#,#,15,7";
		TreeNode tree = new L7my().deserialize(str);
		System.out.println(new L7my().serialize(tree));
	}
}
