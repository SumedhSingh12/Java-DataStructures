package datastructures.trees;

import java.util.ArrayList;

class Node{
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class LevelOrderPrint {
	public void printLevelOrder(Node node) {
		int currentValue = 1;
		int nextValue = 0;
		if (node == null)
			return;
		else {
			ArrayList<Node> treeList = new ArrayList<Node>();
			treeList.add(node);
			while(treeList.size() > 0) {
				Node currentNode = treeList.get(0);
				treeList.remove(0);
				currentValue -= 1;
				System.out.print(currentNode.value + " ");

				if (currentNode.left != null) {
					treeList.add(currentNode.left);
					nextValue += 1;
				}
				if (currentNode.right != null) {
					treeList.add(currentNode.right);
					nextValue += 1;
				}
				if (currentValue == 0) {
					System.out.println();
					int temp = currentValue;
					currentValue = nextValue;
					nextValue = temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		root.left = a;
		root.right = b;
		LevelOrderPrint lop = new LevelOrderPrint();
		lop.printLevelOrder(root);
	}

}
