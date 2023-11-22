package chap02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		
		
		/*Typecasting : 자료형의 형식을 변환 
		
		기본 자료형 8가지 :  RAM : stack 공간 변수명, 값
		byte < short/char < int < long < float < double
		
		참조 자료형 , 무한대로 생성(객체) : Stack 공간 : 변수명(값이 위치한 참조주소) , Heap : 값
			객체/배열/인터페이스
		
		
			- 자동으로 케스팅 : 업케스팅 (낮은 자료형 -> 높은 자료형  (자동으로))
			
			- 수동으로 케스팅 : 다운케스팅 (높은 자료형 -> 낮은 자료형)
							명시해야 함
							
			연산을 할 때 Type이 정확해야 함.
			
			*/
		// 1. 자동 케스팅 : 업케스팅
		int a =10;
		double b = 20.55;
		
		//자동으로 업케스팅
		System.out.println(a + b); // a  (int) + b (double)  <== int 가 자동으로 double 타입으로 케스팅 됨
		
		// 수동으로 다운케스팅 : 명시 해야함

		System.out.println((int)(a + b)); //double  
		
		System.out.println();
		
		// 변수의 값을 할당 할 때 
		
		double c = (double)100;  //정수가 자동으로 업케스팅 되어 double 변수에 할당됨 
		
		int d = (int)200.5; //실수를 다운케스팅 해서 정수 변수에 할당해야함.
		
		System.out.println(c);
		System.out.println(d);
		
		
		//
		
		
		
	}

}
