package com.gl.dsa.balancedbrackets;

import java.util.HashSet;
import java.util.Set;

public class BracketsGame {
	static Set<CouplingBrackets> couplingSet = new HashSet<>();
	
	static {
		
		
		CouplingBrackets one = new CouplingBrackets('(',')');
		CouplingBrackets two = new CouplingBrackets('[',']');
		CouplingBrackets three = new CouplingBrackets('{','}');	
		
		couplingSet.add(one);
		couplingSet.add(two);
		couplingSet.add(three);
	}
	
	static CouplingBrackets getCouplingBrackets(Character closeBracketChar) {
		
		for(CouplingBrackets aCouplingBrackets : couplingSet) {
			
			if(aCouplingBrackets.getCloseChar().equals(closeBracketChar)) {
				return aCouplingBrackets;
			}
		}
		return null;
	}
	static Set<Character> getOpenBrackets(){
		Set<Character>results = new HashSet<>();
		for(CouplingBrackets aBracketPair : couplingSet) {
			results.add(aBracketPair.getOpenChar());
			
		}
		return results;
	}
	static Set<Character> getCloseBrackets(){
		Set<Character>results = new HashSet<>();
		for(CouplingBrackets aBracketPair : couplingSet) {
			results.add(aBracketPair.getCloseChar());
			
		}
		return results;

}
}
