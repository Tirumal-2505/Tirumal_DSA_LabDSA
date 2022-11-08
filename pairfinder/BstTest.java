package com.gl.jvafsd.bst.pairfinder;

public class BstTest {

	public static void main(String[] args) {
		sampleBinaryTree1();
	
	}
	
	public static  BstInserting sampleBinaryTree1() {
		
		BstInserting tree = new BstInserting();
		
		tree.insert(30);
		tree.insert(45);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(90);
		tree.insert(25);
		
		tree.print();
		
		return tree;

	}

}
