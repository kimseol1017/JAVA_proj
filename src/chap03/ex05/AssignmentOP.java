package chap03.ex05;

public class AssignmentOP {

	public static void main(String[] args) {
		
		/*
		  	대입 연산자 : =, +=, -=, *=, /=
		  	
		  	val = 10;
		  	
		  	val1 += 10 <== val1 = val1 + 10 
		
		 */
		
		
		// 1. 대입 연산자의 축약 표현
		int val1 = 3;
	//	val1 = val1 + 3;
		val1 += 3;
		System.out.println(val1); //6
		
		int val2 = 10;
	//	val2 = val2 - 5;
		val2 -= 5;
		System.out.println(val2); //5
		
		int val3 = 11;
		val3 *= 3;		// val3 = val3 * 3;
		System.out.println(val3);
		
		
		
		
		
		
		
	}

}
