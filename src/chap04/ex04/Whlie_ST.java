package chap04.ex04;

public class Whlie_ST {

	public static void main(String[] args) {
		/*
		 	반복문 : for, while, do ~ while
		 	
		 	for( 초기값; 조건식; 증감식){
		 			실행문;
		 	}
		 	======================================
		 	
		 	초기값 ; 
		 	while (조건) {
		 		조건이 true 일 때 실행구문;
		 		
		 		증감식
		 	}
		 
		
		 */
		System.out.println("-------------for--------------");
		for (int i = 0; i < 10 ; i++) {
			System.out.println("for  문으로 출력 i :" + i);
		}
		
		
		
		System.out.println("-------------while--------------");
		int a = 0;
		while(a < 10) {
			System.out.println("while 문에서 출력 a : " + a);		// 실행 구문 (조건 true)
			
			a++ ;			//증감식
		}
		
		
		
	}

}
