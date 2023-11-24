package chap04.ex03;

public class For_ST5 {

	public static void main(String[] args) {

		/*
		 	반복문(for, while, do while 내에서 continue; break; 키워드 사용 <=== if 조건을 넣어서 사용
		 		-continue; <== 증감식 아래코드는 실행하지 않고 증감식으로 이동.
		 		-break; <== 반복문을 빠져나옴.
		 */
		
		//continue;
		for (int i = 1 ; i < 10 ; i++) {
			
			System.out.println("i 변수의 값 : " + i);
			if(i % 3 == 0) { //3의 배수일 때
				continue; // 출력하지 않는다  
			}				// 아래 있는 구문을 실행하지 않게 하는 목적으로  출력을 막을 구문 앞에 보통 사용한다
			System.out.println("3,6,9 의 배수가 아님");
			System.out.println();
		}
		System.out.println("=========================");
		
		//break;
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println("i 변수 : " + i);
			
			if ( i == 7 ) break;  // 중괄호 생략은 하나의 명령 코드 일 때
		}
		
		
		
		
		
		
		
		
	}

}
