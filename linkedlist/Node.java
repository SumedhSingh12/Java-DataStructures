package datastructures.linkedlist;

/**
 * @author sumedhsingh
 *
 */
public class Node {
	
	private String element;
	Node next;
	public Node(String element, Node next) {
		super();
		this.element = element;
		this.next = next;
	}
	
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
