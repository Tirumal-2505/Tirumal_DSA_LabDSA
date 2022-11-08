package com.gl.dsa.balancedbrackets;

public class Check_Final {

	public Check_Final(String brackets) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		test("");
		test("([[{}]])");
		test("([[{}]]))");
        test("[]");
        test("[)");
		test("[[[]]]");
		//test("M{{[[[()]]]}}W");
		//test("M{{[[[()]]]}}");
	}
	
	static void test(String brackets) {
		Check_Final exam = new Check_Final(brackets);
		
		boolean result = exam.check();
		
		if(result) {
			System.out.println("The given expression "+ brackets +" is balanced");
		}else {
			System.out.println("The given expression "+ brackets +" is balanced");
		}
	}

	private boolean check() {
		// TODO Auto-generated method stub
		return false;
	}

	}


