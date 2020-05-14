package model;

public class NodeLinkedList {
	
	
	private NodeLinkedList next;
	
	private NodeLinkedList prev;
	
	private Long value;
	
	public NodeLinkedList(Long l){
		value = l;
	}

	public Long getValue() {
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
