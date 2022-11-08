package com.gl.jvafsd.bst.pairfinder;

public class Binarysearchtreenode {
	
	private Integer data;
	private Binarysearchtreenode leftNode;
	private Binarysearchtreenode rightNode;
	
	public Binarysearchtreenode(Integer data) {
		this.data = data;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Binarysearchtreenode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Binarysearchtreenode leftNode) {
		this.leftNode = leftNode;
	}
	public Binarysearchtreenode getRightNode() {
		return rightNode;
	}
	public void setRightNode(Binarysearchtreenode rightNode) {
		this.rightNode = rightNode;
	}
	
	public String toString() {
		StringBuilder contents = new StringBuilder();
		
		contents.append("Data--> ").append(data).append(" , ");
		return contents.toString();
	}

}
