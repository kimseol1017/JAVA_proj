package chap02.ex02;

public class RangeOfVariable {
	public static void main(String[] args) {
		// main 메소드 : 코드 작성	  	  
			//메소드 : 객체지향언어 에서 함수를 메소드라고 호칭함.		메소드 == 함수
		
		// 변수의 사용 범위 : 전역 변수, 지역 변수
		
		// 전역 변수 : 선언된 곳에서만 유효 
		int a = 7;
		
		{	//if, switch, for , while, do ~ whlie   <=제어, 반복문
			// 지역 변수 : 그 블록 내에서만 사용됨 , 블록 밖에선 사용할 수 없음
			int b = 10;
			
			System.out.println("a 변수의 값을 출력(내부 블럭)" + a);
			System.out.println("b 변수의 값을 출력(내부 블럭)" + b);
			
			{
				int c = 30;
				System.out.println("=============================");

				System.out.println("블럭의 블럭 a" + a);
				System.out.println("블럭의 블럭 b" + b);
				System.out.println("블럭의 블럭 c" + c);
				
				System.out.println("=============================");
			}
			
			//System.out.println("c 변수의 값을 출력(내부 블럭)" + c); 지역 변수 c 가 범위를 벗어남
			
			
		}
		
		System.out.println("a 변수의 값을 출력(외부 블럭)" + a);
		// System.out.println("b 변수의 값을 출력(외부 블럭)" + b); 지역변수 b 를 지정 블럭 외부에선 사용할 수 없다
		
	}

}
