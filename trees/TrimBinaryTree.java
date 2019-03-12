package datastructures.trees;

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class TrimBinaryTree {
	
	public TreeNode trim(TreeNode node, int minValue, int maxValue) {
		if(node == null)
			return null;
		else {
			TreeNode leftSubtree = trim(node.left, minValue, maxValue);
			TreeNode rightSubtree = trim(node.right, minValue, maxValue);
			
			if (minValue <= node.value && node.value <= maxValue)
				return node;
			else if (minValue > node.value)
				return rightSubtree;
			else
				return leftSubtree;
		}
	}
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(3);
		root.left = a;
		root.right = b;
		TrimBinaryTree tbt = new TrimBinaryTree();
		System.out.println(tbt.trim(root, 0, 2).value);
	}

}
