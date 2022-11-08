package com.gl.jvafsd.bst.pairfinder;

public class PairFinderTest {

	public static void main(String[] args) {
		
		pairFinderTest(150);
		pairFinderTest(120);
		pairFinderTest(80);
		pairFinderTest(83);
		pairFinderTest(90);
		pairFinderTest(97);
	}
static void pairFinderTest(int sum) {
				
	BstInserting sampleTree = BstTest.sampleBinaryTree1();
		
	BstTest test = new BstTest();
	
	BstInserting sampleTree2 = test.sampleBinaryTree1();

	BinarySearchTree finder =
			new BinarySearchTree(sampleTree2);
		
		finder.findPair(sum);
		System.out.println("______________________");
	}

}
