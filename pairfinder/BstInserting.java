package com.gl.jvafsd.bst.pairfinder;

public class BstInserting {
	
	private Binarysearchtreenode root;
	
	public BstInserting() {
		root = null;
	}

	public Binarysearchtreenode getRoot() {
		return root;
	}

	public void setRoot(Binarysearchtreenode root) {
		this.root = root;
	}
	public void insert(Integer value) {
		root = insert(value, root);
	}
	private Binarysearchtreenode insert(Integer value,
			Binarysearchtreenode rootnode) {
		
		if(rootnode == null) {
			return createNewNode(value);
		}
		else if(value <= rootnode.getData()) {
			Binarysearchtreenode leftNode = rootnode.getLeftNode();
			
			Binarysearchtreenode newNode = insert(value,leftNode);
			rootnode.setLeftNode(newNode);
			return rootnode;
		}
		else {
             Binarysearchtreenode rightNode = rootnode.getRightNode();
			
			Binarysearchtreenode newNode = insert(value,rightNode);
			rootnode.setRightNode(newNode);
			return rootnode;
		}
	}
	Binarysearchtreenode createNewNode(Integer data) {
		
		Binarysearchtreenode newNode = new Binarysearchtreenode(data);
		return newNode;
	}
	public void print() {
		preOrderTraversal();
	}
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}
	private void preOrderTraversal(Binarysearchtreenode node) {
		if(node == null) {
			return;
		}
		//below statement can be used if we want the tree to be printed in preorder traversal.
		/*System.out.println(node.getData());
		preOrderTraversal(node.getLeftNode());
		preOrderTraversal(node.getRightNode());*/
	}

}

