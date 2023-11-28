package leb.chap05;

import java.util.Arrays;

public class Arrary_DF04 {

	public static void main(String[] args) {

		/* 
		 	 변수 : 1값 만 저장 , Stack : 변수명, 변수 값 <== 기본자료형 
		 	 배열 : 여러개의 값을 저장. <== 참조자료형, stack 에 변수명, 참조주소 : 값은 heap 에 들어감
		 	 	HEAP 영역의 값을 비교 ==> equals() 
		 	 		초기값 : 정수 : 0 , 실수 : 0.0 , boolean : false 
		 	 
		 */
		
		int a; //변수
		
		int [] b = new int[10]; //배열 선언 heap 공간엔 초기값이 반드시 들어가야함 
		System.out.println(b[0]);
		//System.out.println(a);// 초기값을 반드시 넣어야 사용
		
		//b 배열에 값을 할당
		b[0] = 3;
		b[1] = 6;
		b[9] = 10;
		
		System.out.println(b[9]);
		
		//for문을 이용해 배열 각각의 내용을 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(b[i]);
		}
		System.out.println(b.length); //배열방의 갯수
		System.out.println("================");
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// Enhanced for문 : 배열의 0 ~ 마지막 방 까지 모두 출력
		System.out.println("EF==========================");
		for (int k : b) {
			System.out.println(k);
		}
		
		//Arrays.toString(배열변수)
		System.out.println("===============AtS===========");
		System.out.println(Arrays.toString(b));

		
			
		
	}

}
