package com.gl.dsa.balancedbrackets;

import java.util.Set;
import java.util.HashSet;
import java.util.Stack;

public class Balance_check {
	
	private String brackets;
	
	private Set<Character>openBracketSet;
	private Set<Character>closeBracketSet;
	
	private Stack<Character>BracketsStack;
	
	public Balance_check(String brackets) {
		this.brackets = brackets;
		
		
      closeBracketSet = new HashSet<>();
		BracketsStack = new Stack<>();
	}
	
	public boolean check() {
		
		if(brackets.length()==0) {
			return false;
		}
		if(brackets.length()%2 != 0) {
			return false;
		}
		
		openBracketSet = BracketsGame.getOpenBrackets();
		closeBracketSet = BracketsGame.getCloseBrackets();
		
		
		for(int index=0; index<brackets.length(); index++) {
			
			char aCharacter = brackets.charAt(index);
			
			/*if(aCharacter == '(' || aCharacter == '[' || aCharacter == '{') {
				
			}*/
				
			if(openBracketSet.contains(aCharacter)) {
				BracketsStack.push(aCharacter);
				
			}else if(closeBracketSet.contains(aCharacter)) {
				
				CouplingBrackets bracketPairObj = BracketsGame.getCouplingBrackets(aCharacter);
				
				Character openBracketCharFromStack = BracketsStack.pop();
				
				if(bracketPairObj.getOpenChar().equals(openBracketCharFromStack)) {
					 
				 }else {
					 return false;
				 }
			}
				 else {
					 System.out.println("Invalid Character--> " +  aCharacter);	
			}
		}
		boolean successCondition = BracketsStack.isEmpty();
		if (successCondition) {
			return true;
		}else {
			return false;
		}
		}
	}



