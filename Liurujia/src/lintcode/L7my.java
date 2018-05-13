package lintcode;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 序列化自己再实现
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
	private Queue<TreeNode> que = new LinkedList<>();//用户序列化的队列
	private Queue<TreeNode> fque = new LinkedList<>();//用于反序列化的队列
	
	/**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {//序列化
        // write your code here
    	String str = "";
    	//首先判断它是不是一个空的树
    	if(root == null){
    		return "#";
    	}else{//否则它便不是一个空树，所以我就需要将它加入到队列里面
    		que.offer(root);
    		//接下来开始循环遍历整棵树,只要不是空
    		while(!que.isEmpty()){
    			//出队列，让我来判断它的左右子树添加字符的形式
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
    	//最后别忘记去掉最后的那个逗号
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
    	// 首先我还是来判断极端的情况
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
