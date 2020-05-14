package model;

public class NodeBST {
	private NodeBST father;
	private NodeBST left;
	private NodeBST right;
	private long value;
	
	public NodeBST(long l) {
		value = l;
	}

	public NodeBST getFather() {
		return father;
	}

	public void setFather(NodeBST father) {
		this.father = father;
	}

	public NodeBST getLeft() {
		return left;
	}

	public void setLeft(NodeBST left) {
		this.left = left;
	}

	public NodeBST getRight() {
		return right;
	}

	public void setRight(NodeBST right) {
		this.right = right;
	}

	public long getValue() {
		return value;
	}
}
