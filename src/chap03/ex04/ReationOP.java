package chap03.ex04;

public class ReationOP {

	public static void main(String[] args) {
		
		/* 비교 연산자  결과를 True / false 로 리턴
		 * - 크기비교 연산자 : >, < , <= , >=
		 * - 등가 비교 연산자 : == , != 
		  
	 	*/
		
		// 1. 크기 비교 연산자 / 등가 비교 연산자
		
		System.out.println(5 > 2); 	//T
		System.out.println(5 < 2); 	//F
		System.out.println(5 >= 2); //T
		System.out.println(5 <= 2); //F
		System.out.println(5 == 2); //F
		System.out.println(5 != 2); //T
		
		char a ='a';
		char b = 'a';
		
		System.out.println(a == b ); //t 
		System.out.println(a != b ); //f 
		
		System.out.println("===========================");
		// 2. 참조 자료형일 때 등가 비교 연산자 사용
			// 객체 변수명 : stack 메모리 영역에 저장됨
			// 객체의 값은 : Heap 메모리 영역에 저장
	
		String str1 = new String("안녕"); // "안녕" 을 Heap 메모리에 저장하고 str1 에 Heap 영역의 주소정보를 저장함
		String str2 = new String("안녕");
		
		System.out.println(str1 == str2); // false --> '==' 은 Stack 에 변수의 값을 비교
		
		// 참조자료형 일 경우 Heap 영역의 값을 비교 할 때 .equals() 메소드를 사용해서 값을 비교
		
		System.out.println(str1.equals(str2));// true
		
		System.out.println("===========================");
		
		// String 은 특수한 기능들이 많이 적용 되어있음
		
		String str3 = "오늘";				// 참조자료형은 Heap 영역에 저장 , new 는 heap에 주소를 생성
		String str4 = "오늘";				// new를 안쓸 시 heap 영역의 같은 공간을 사용, str3 의 값과 str4의 heap 영역의 주소가 같다
		
		System.out.println(str3 == str4);  // == 는 stack 의 변수 값을 비교 
		System.out.println(str3.equals(str4)); // Heap 에 저장된 값을 비교 
		
		
		
	}

}
