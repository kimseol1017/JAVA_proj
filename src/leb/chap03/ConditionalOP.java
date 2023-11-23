package leb.chap03;

import java.util.Scanner;

public class ConditionalOP {

	public static void main(String[] args) {
		// 스캐너. 정수 , % , || , 삼항 연산자 사용
		//1. 스캐너로 정수값 인풋 : 홀짝 출력 : 입력받은 수 는 00 이고 짝수 입니다.
		Scanner se = new Scanner(System.in); //스캐너 설정
		
		int a; // 인풋받을 정수 값을 받을 변수 선언
		
		System.out.println("정수를 입력하세요");
		
		a = se.nextInt(); // 정수 인풋 받음
		String c = "짝수입니다";
		String d = "홀수입니다";
		
		String b = (a % 2 == 0)? c : d;
		System.out.printf("입력받은 수 %d 이고 %s ", a ,b);
		//=================================================강사님 코드
		
		//System.out.printf( (a % 2 == 0)? "짝수입니다" : "홀수입니다" );
		
		System.out.println();
		System.out.println("===================================");
		//2. 스캐너로 값을 인풋, : 인풋 값은 00이고 , 3 ,6 ,9의 배수입니다.
		
		int z;
		
		System.out.println("정수를 입력하세요");

		z = se.nextInt();
		String x = "3 ,6 ,9의 배수입니다";
		String y = "3 ,6 ,9의 배수가 아닙니다";
		
		String i = (z % 3 == 0 || z % 6 == 0 || z % 9 == 0 )? x : y;
//		System.out.printf("인풋 값은 %d 이고 ", z);
//		System.out.println((z % 3 == 0 || z % 6 == 0 || z % 9 == 0 )? "3 ,6 ,9의 배수입니다" : "3 ,6 ,9의 배수가 아닙니다");
		System.out.printf("인풋 값은 %d 이고, %s", z, i);
		
		
	}

}
