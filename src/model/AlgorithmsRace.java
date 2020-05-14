package model;

import java.util.ArrayList;

public class AlgorithmsRace {
	
	private ArrayList<Long> arrayList;
	private NodeBST root;
	private NodeLinkedList first;
	
	public AlgorithmsRace() {
		arrayList = new ArrayList<Long>();
	}
	
	public void resetData() {
		arrayList.clear();
		root = null;
		first = null;
	}
	
	public void addArrayList(Long l) {
		arrayList.add(l);
	}
	
	public void addLinkedListIterative(Long l) {
		if(first == null) {
			first = new NodeLinkedList(l);
		}else {
			NodeLinkedList temp = first;
			while(first.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new NodeLinkedList(l));
			temp.getNext().setPrev(temp);;
		}
	}
	
	public void addLinkedListRecursive(Long l) {
		if(first == null) {
			first = new NodeLinkedList(l);
		}else {
			NodeLinkedList temp = addLLR(first);
			temp.setNext(new NodeLinkedList(l));
			temp.getNext().setPrev(temp);
		}
	}
	
	private NodeLinkedList addLLR(NodeLinkedList nll) {
		if(nll.getNext() == null) {
			return nll;
		}else {
			return addLLR(nll.getNext());
		}
	}
	
	public void addBSTIterative(Long l) {
		if(root == null) {
			root = new NodeBST(l);
		}else {
			boolean added = false;
			NodeBST temp = root;
			while(!added) {
				if(l<temp.getValue()) {
					if(temp.getLeft() == null) {
						temp.setLeft(new NodeBST(l));
						temp.getLeft().setFather(temp);
						added = true;
					}else {
						temp = temp.getLeft();
					}
				}else {
					if(temp.getRight() == null) {
						temp.setRight(new NodeBST(l));
						temp.getRight().setFather(temp);
						added = true;
					}else {
						temp = temp.getRight();
					}
				}
			}
		}
	}
	
	public void addBSTRecursive(Long l) {
		if(root == null) {
			root = new NodeBST(l);
		}else {
			addBSTR(root,l);
		}
	}
	
	private NodeBST addBSTR(NodeBST n,Long l) {
		
		if(l<n.getValue()) {
			if(n.getLeft()!=null) {
				return addBSTR(n.getLeft(),l);
			}else {
				n.setLeft(new NodeBST(l));
				n.getLeft().setFather(n);
				return n;
			}
		}else {
			if(n.getRight()!=null) {
				return addBSTR(n.getRight(),l);
			}else {
				n.setRight(new NodeBST(l));
				n.getRight().setFather(n);
				return n;
			}
		}
	}
	
	public boolean consultALIterative(Long l) {
		boolean found = false;
		for(int i = 0; i < arrayList.size()&&!found;i++) {
			if(arrayList.get(i)==l) {
				found=true;
			}
		}
		
		return found;
	}
	
	public boolean consultALRecursive(Long l) {
		if(arrayList.isEmpty()) {
			return false;
		}else {
			return consultALRecursive(l,0);
		}
	}
	
	private boolean consultALRecursive(Long searched,int posA) {
		if(searched==arrayList.get(posA)) {
			return true;
		}else {
			if(posA<arrayList.size()) {
				return consultALRecursive(searched,posA++);
			}else {
				return false;
			}
		}
	}
	
	public boolean consultLLIterative(Long l) {
		boolean found = false;
		if(first!=null) {
			NodeLinkedList temp = first;
			while(temp.getNext()!=null&&!found) {
				if(temp.getValue()==l) {
					found = true;
				}else {
					temp = temp.getNext();
				}
			}
		}
		return found;
	}
	
	public boolean consultLLRecursive(Long l) {
		if(first != null) {
			return consultLLR(l,first);
		}else {
			return false;
		}
	}
	
	private boolean consultLLR(Long l, NodeLinkedList node) {
		if(node.getValue()==l) {
			return true;
		}else {
			if(node.getNext()!=null) {
				return consultLLR(l,node.getNext());
			}else {
				return false;
			}
		}
	}
	
	public boolean consultBSTIterative() {
		return false;
	}
	
	public boolean consultBSTRecursive(Long l) {
		consultBSTR(root,l);
		return false;
	}
	
	private boolean consultBSTR(NodeBST node,Long l) {
		return false;
	}
	
	public void deleteALIterative(Long l) {
		boolean deleted = false;
		for(int i = 0; i < arrayList.size()&&!deleted ; i++ ) {
			if(arrayList.get(i)==l) {
				arrayList.remove(i);
				deleted = true;
			}
		}
	}
	
	public void deleteALRecursive(Long l) {
		if(!arrayList.isEmpty()) {
			deleteALR(l,0);
		}
	}
	
	private void deleteALR(Long l, int posA) {
		if(l==arrayList.get(posA)) {
			arrayList.remove(posA);
		}else {
			if(posA<arrayList.size()) {
				deleteALR(l,posA++);
			}
		}
	}
	
	public void deleteLLIterative(Long l) {
		if(first!=null) {
			NodeLinkedList temp = first;
			boolean deleted = false;
			while(temp.getNext()!=null&&deleted) {
				if(temp.getValue()==l) {
					NodeLinkedList prev = temp.getPrev();
					temp.getNext().setPrev(prev);
					prev.setNext(temp.getNext());
					deleted = true;
				}
			}
		}
	}
	
	public void deleteLLRecursive(Long l) {
		if(first!=null) {
			deleteLLR(l,first);
		}
	}
	
	private void deleteLLR(Long l, NodeLinkedList node) {
		if(l==node.getValue()) {
			if(node.getPrev()==null) {
				first=null;
			}else if(node.getNext()==null) {
				node.getPrev().setNext(null);
			}else {
				NodeLinkedList prev = node.getPrev();
				node.getNext().setPrev(prev);
				prev.setNext(node.getNext());
			}
		}else {
			if(node.getNext()!=null) {
				deleteLLR(l,node.getNext());
			}
		}
	}
	
	public void deleteBSTIterative() {
		
	}
	
	public void deleteBSTRecursive() {
		
	}
}
