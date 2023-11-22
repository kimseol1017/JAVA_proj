package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {

		
		// 외부의 라이브러리 사용 하기 : JAVA에서 만들어지 클래스의 묶음을 라이브러리 라고 함
			//import 가 필요함.   //java.lang 패키지 의 class 는  import 없이 바로 사용 가능
		
		System.out.println();
		String a;
		Integer b;
		Double c;
		Long d;
		
		
		/*Scanner : 콘솔로 부터 입력 값을 받아오는 클래스(객체)
		
				- 외부 클래스 : java.lang 외부에 존재하는 클래스  <== import 필요
				- 동일한 패키지에 존재하는 클래스는 import 없이 사용가능 
				- 동일한 패키지에 존재하지 않는 클래스는 import 해야함
				- java.util.Scanner :  클래스의 전체이름  : 패키지명 , 클래스명
				- ctrl + shift + o : 자동으로 import 단축어
				- 콘솔에 값을 넣고 Enter 을 넣으면, 다음 스케너에서 입력 대기
		*/
		
		// 스케너 객체 생성 
		
	  //Scanner(참조타입) sc(객체변수명) = new(Heap에 객체를 저장) Scanner(System.in);
		Scanner sc = new Scanner(System.in);  
		
		//변수 선언 
		String fname;
		String mname;
		String myname;
		
		System.out.println("아버님의 이름을 입력 하세요 >>>");
		fname = sc.next(); // sc.next(); 콘솔로 부터 "문자열" 을 인풋 받음 , 콘솔에서 input 대기

		System.out.println("어머님의 이름을 입력 하세요 >>>");
		mname = sc.next();
		
		System.out.println("나의 이름을 입력 하세요 >>>");
		myname = sc.next();
		
		System.out.println("입력받은 아버님 이름은 : " + fname);
		System.out.println("입력받은 어머님 이름은 : " + mname);
		System.out.println("입력받은 나의 이름은 : " + myname);
		
		System.out.println("=============================");
		
		// 스캐너로 정수값 입력받기
		
		// 변수 선언 , 값은 스캐너로 받아서 할당
		int aa;
		int bb;
		int cc;
		
		// 스캐너로 변수의 값을 할당
		
		System.out.println("aa bb  cc 변수의 정수값을 공백으로 입력");
		
		aa= sc.nextInt();  		//콘솔에서 정수값을 인풋
		bb= sc.nextInt(); 
		cc= sc.nextInt(); 
		
		System.out.println("aa: " + aa + "\nbb : " + bb + "\ncc : " + cc);
		
	}

}
