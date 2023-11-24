package chap04.ex03;

public class For_ST {

	public static void main(String[] args) {

		/* 
		  
		  제어문 : 프로그램의 조건에 따라서 순서를 바꾸어 줌, IF문(if, else if, if) ,switch 문
		  반복문 : 프로그램을 계속 반복 하도록 하는 구문
		   		주의 : 조건이 무한 루프에 빠지지 않도록 처리
		   		for, while, do while 
		   		
		   		for (변수의 초기값; 조건 ; 증감식) {
		   			// 반복될 구문 ;
		   		}
		  
		  */
		
		for (int i = 0 ; i <= 10; i++) {
			System.out.println("오늘 날씨는 춥습니다 : " + i);
		}
		
		System.out.println("==========================");
		// for문 에서 주의 : 무한루프에 빠지지 않도록 조건을 처리
		
		int a; // 블럭 밖에서 선언된 변수
		
//		for(a = 0; a >= 0; a++) { //조건이 계속 True 이면 무한루프
		for (a = 0; a < 100; a++) {
			System.out.println(a);
		}
		
		//for문 블럭 밖에서 선언, for문 블럭 내에서 선언 (변수를 새로 사용 가능)
		
		System.out.println("==========================");

		for (a = 10; a <= 100 ; a += 2) {
			System.out.println(a);
		}
		
		System.out.println("마지막 a 값" + a);
//		System.out.println("마지막 i 값" + i);// for 문 안에서 선언된 지역변수 ==> 블럭 밖에서 실행 시 오류발생
		
		System.out.println("==============무한루프===========");

//		for(int i = 0; i >= 0; i++) { // 무한루프
			for(int i = 0; i < 100; i++) { //정상코드
			System.out.println("오늘 날씨는 추워여 : "+ i);
		}
		
//		for (int i = 0; true; i++) {
//		System.out.println("무한루프 : " + i);
		
//		for (int i = 0 ; ; i++) :조건식이 생략된 경우
// 		 	
//			도달할 수 없는 코드
//		for ( ; false ;  ) {
//			System.out.println("a");
//			}
		}
	}


