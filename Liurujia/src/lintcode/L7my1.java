package lintcode;

import java.util.LinkedList;
import java.util.Queue;


public class L7my1 {
	Queue<TreeNode> que = new LinkedList<TreeNode>();
	Queue<TreeNode> fque = new LinkedList<TreeNode>();
	
	public String serious(TreeNode root){
		String str = "";
		if(root == null){
			return "#";
		}else{
			que.offer(root);
			while(!que.isEmpty()){
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
		return str.substring(0,str.length()-1);
	}
	
	public TreeNode fserious(String res){
		String[] str = res.split(",");
		if(res.length()==0&&res.equals("#")){
			return null;
		}else{
			TreeNode rootnode = new TreeNode(Integer.parseInt(str[0]));
			fque.offer(rootnode);
			int i = 1;
			while(i<str.length&&!fque.isEmpty()){
				TreeNode treenode = fque.poll();
				if(str[i].equals("#")){
					treenode.left=null;
					i++;
				}else{
					TreeNode tleft = new TreeNode(Integer.parseInt(str[i]));
					treenode.left = tleft;
					fque.offer(tleft);
					i++;
				}
				
				if(i<str.length&&str[i].equals("#")){
					treenode.right=null;
					i++;
				}else if(i<str.length){
					TreeNode tright = new TreeNode(Integer.parseInt(str[i]));
					treenode.right=tright;
					fque.offer(tright);
					i++;
				}
			}
			return rootnode;
		}
	}
	public static void main(String[] args) {
		String str = "3,9,20,#,#,15,7";
		TreeNode tree = new L7my1().fserious(str);
		System.out.println(new L7my1().serious(tree));
	}
}
