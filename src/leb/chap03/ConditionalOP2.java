package leb.chap03;

import java.util.Scanner;

public class ConditionalOP2 {

	public static void main(String[] args) {
		// Scanner  로 " 안녕" 이라는 문자열을 입력, "안녕"이 입력되면 "안녕하세요" , "안녕 못합니다"
		
		Scanner se = new Scanner(System.in);
		
//		String a;
		String a = se.next();
		System.out.println( (a.equals("안녕")? "안녕하세요" : "안녕 못합니다") );
		
		// 참조 자료형일 때ㅐ 변수의 값은 Heap 공간에 저장됨. Stack 에는 변수명과 Heap에 저장된 값의 번지가 저장됨
		
	}

}
