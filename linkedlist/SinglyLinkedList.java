package datastructures.linkedlist;

public class SinglyLinkedList {
	private Node head;
	private int size;
	public SinglyLinkedList() {
		super();
		this.head = null;
		this.size = 0;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addTail(Node node, String value) {
		while(node.next != null) {
			node = node.next;
		}
		node.next = new Node(value, null);
		this.size++;
	}
	public void addHead(String value) {
		Node newHead = new Node(value, this.head);
		this.head = newHead;
		this.size++;
	}
	public void addAtPos(String value, int pos) {
		Node node = this.head;
		
		int i = 0;
		while(node.next != null && i++ < pos) {
			node = node.next;
		}
		if(node.next == null)
			addTail(node, value);
		else {
			Node newNode = new Node(value, node.next);
			
		}
		
		
	}
	
	

}
