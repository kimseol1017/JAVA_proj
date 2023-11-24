package chap04.ex05;

public class Do_while_ST {

	public static void main(String[] args) {
		/* 
		  
		 	while 문 은 조건이 true 일 때 실행문이 실행됨
		 	
		 	do while 문은 조건에 상관없이 한번은 실행문이 실행됨
		 	=========while====================
		 	초기값;
		 	while (조건) {
		 		실행문;  <== 조건이 true 일 때
		 		증감식;
		 	}
		 	=========do~while====================
		 	 초기값 ;
		 	 do {
		 	 	실행문;
		 	 	증감식;
		 	 }while (조건);
		 	 ====================================
		  */
		//while 문
		int a = 0;
		while (a < 0) {		// 조건이  false 이므로 
			System.out.println("a : " + a);  //작동 이 안됨
		}
		
		//do while 문 (조건);
		int b = 0;
		do {
			System.out.println("b : " + b); // 조건과 상관없이 1번은 실행됨
		}while (b < 0);
		
		// do while 문에서 반복처리
		
		int c = 0;
		do {
			System.out.println("c : " + c);
			c++;
		}while(c < 100);
		
		System.out.println("===============");
		//반복 횟수가 100번인 경우 while 문 do while문의 비교
		
		System.out.println("while========");

		a = 0;
		while( a < 10 ) {
			System.out.println("a : " + a);
			a++;
		}
		
		System.out.println("do while========");
		
		a = 0;
		do {
			System.out.println("a : " + a);
			a++;
		}while ( a < 10);
		
		
		
	}

}
