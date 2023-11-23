package chap03.ex06;

public class ConditionalOp {

	public static void main(String[] args) {

		// 삼항 연산자 : if ~ else 의 축약 구문
		
		
		// 		( 참 / 거짓 )? 참일 때 실행 구문 : 거짓일 때 실행 구문 ;
		
		int val1 = (3 > 5) ? 6 : 9; 	// 	==>9
	// 	int val1 = (3 < 5) ? 6 : 9; 		==>6
		
		System.out.println(val1);
		
		//if
		
		int val2 ;
		
		if (3 < 5) { // ==> true
			val2 = 6; // (조건) : True 일 때 실행
		}else {			// (조건) : false 일 때 실행
			val2 = 9;
		}

		System.out.println(val2);
		
		
		
	}

}
