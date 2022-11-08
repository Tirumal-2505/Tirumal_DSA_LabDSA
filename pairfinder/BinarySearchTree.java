package com.gl.jvafsd.bst.pairfinder;

import java.util.HashSet;
import java.util.Set;


public class BinarySearchTree {
	
	private BstInserting binarysearch;
	private boolean  found;
	
	public BinarySearchTree(BstInserting binarysearch) {
		this.binarysearch = binarysearch;
	}
	
	public void  findPair(int sum) {
		
		Set<Integer> nodes = new HashSet<>();
		
		findPairInternal(binarysearch.getRoot(),sum,nodes);
		if(!found) {
			System.out.println("For the sum value-->  "+sum+ 
					" ,matching nodes not found.");
		}
	}
	
	boolean findPairInternal(Binarysearchtreenode aNode, int sum, Set<Integer>nodes){
		
		if(aNode == null) {
			return false;
		}
		found=findPairInternal(aNode.getLeftNode(),sum,nodes);

		if(found) {
			return true;
		}
		
		int differenceValue = (sum-aNode.getData());
		
		if(nodes.contains(differenceValue)) {
			found  = true;
			
			System.out.println("sum is "+sum +" nodes are "+ aNode.getData()+ " and " +differenceValue);
			return found;
		}else {
			nodes.add(aNode.getData());
		}
		
		if(!found) {
			return findPairInternal(aNode.getRightNode(),sum,nodes);
		}else {
			return true;
		}
	
	}

}
