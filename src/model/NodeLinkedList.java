package model;

public class NodeLinkedList {
	
	
	private NodeLinkedList next;
	
	private NodeLinkedList prev;
	
	private long value;
	
	public NodeLinkedList(long l){
		value = l;
	}

	public long getValue() {
		return value;
	}
	
	public NodeLinkedList getNext() {
		return next;
	}
	
	public void setNext(NodeLinkedList nll) {
		next = nll;
	}
	
	public NodeLinkedList getPrev() {
		return prev;
	}
	
	public void setPrev(NodeLinkedList nll) {
		prev = nll;
	}
}
