package chap01;

import javax.swing.Spring;

public class ConsoleOutPyt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 출력 
		System.out.println("안녕하세요");	
					/*자열을 연결해서 출력 : + : 숫자일 땐 덧셈
										: 문자열일 땐 연결
									*/
		System.out.println("안녕하세요" +"반갑습니다");
		//정수, 실수일때 : + (덧셈)
		System.out.println(2 + 3);
		System.out.println("2" + "3");
		
		//실수 출력
		System.out.println(10.5 + 20.11);
		System.out.println("10.5" + 20.11);
		
		//2. System.out.println(); 줄바꿈 
		 System.out.println("=================");
		//3. System.out.printf(); 콘솔에
		
		 System.out.println(123 + 456.7 +"안녕");//정수,실수 계산 후 문자열 출력
		 // 정수 ,실수
		 System.out.println("안녕"+ (123 + 456.7)); //괄호우선 계산 및 출력
		 System.out.println("안녕"+ 123 + 456.7); //문자열 출력 후 숫자도 문자열로 출력
		 
		 //변수에 값을 할당 후 출력
		 	//변수 : 메모리에 값이 변하는 수 
		 	//변수 선언 : 자료형, 변수명 = 값;
		 
		 	// = : 대입의 뜻 (왼쪽에 변수에 오른쪽 값을 할당)
		 	// == : 같다 , ture,false 값 반환 .( return )
		 
		 
		 String str ="안녕"; // 문자열 변수(String) "" 필수 
		 
		 int a = 10; //정수를 담는 변수 ""넣으면 안됨
		 int b = 20; 
		 
		 //변수를 출력
		 System.out.println(str);
		 System.out.println(a);
		 System.out.println(b);
		 
		 System.out.println("====================");
		 // 문자령과 성수열을 연겷세
		 System.out.println("srt 변수값 " + str );
		 System.out.println("변수 번호"+ (a + b ));
		 
		 System.out.println("====================");
		 System.out.println("오늘");
		 System.out.println("날씨");
		 System.out.print("맑음");
		 System.out.println(); //엔터
		 
		 System.out.println("====================");
		 System.out.print("오늘\n");// \n : 엔터
		 System.out.print("내일");
		 System.out.print("오늘\n");
		 
		 System.out.println("====================");
		 System.out.print("오늘\t");// \t : tab키
		 System.out.print("내일\t");
		 System.out.print("오늘\t");
		 System.out.println();
		 
		 System.out.println("====================");
		 //자료형 표현 방식  %s : 문자열 불러들임 , %d 정수 불러옴
		 // %4.2f : 실수의 값을 불러들림, 정수 4자리 소수점 이하 2자리 출력
		 //%f 실수
		 
		 /*		%n : 줄바꿈
				%s : String 형식으로 출력
				%d : integer 형식으로 출력
				%f : float 형식으로 출력
				%t : date, time 형식으로 출력
				%o : 8진수 integer 형식으로 출력
				%x : 16진수 integer 형식으로 출력
				%b : boolean 형식으로 출력
				%e : 지수 형식으로 출력
		 */
		 
		 str = "맑음"; // 변수의 값을 재할당
		 a = 50;
		 //실수를 넣을 수 있는 자료형
		 double c =123.4567;
		 
		 //printf(); 를 사용해서 출력
		 System.out.printf("오늘의 날씨는 %s 입니다",str);
		 //println(); 을 사용해서 출력
		 System.out.printf("오늘의 날씨는" + str + " 입니다 ");
		 
		 System.out.println("======================");
		 
		//printf(); 를 사용해서 출력  문자열 + 변수를 출력 시 간결하게 줄력가능  변수가 여러개인 경우 println은 번거롭기 때문
		 
		 System.out.printf("오늘의 날씨 : %s \n 변수 a + b : %d \n 실수 c의 값 : %4.2f", str ,(a+b), c);
		 //println(); 을 사용해서 출력 문자열 + 변수를 출력 시 코드가 길어짐
		 System.out.printf("================================================= ");
		 
		 System.out.println(" 오늘 날씨 : " + str + "\n 변수 a+b " + (a+b) + "\n 실수 c 의 값 :" + c);
		 
		 System.out.println("======================");
		 String strl1 = "오늘" ;
		 String strl2 = "날씨는 ";
		 String strl3 = "맑습니다";
		 int d = 122;
		 
		 System.out.printf("%s %s %s 정수의 값은 : %d", strl1, strl2, strl3, d);
		 System.out.println();
		 
		 System.out.println("======================");
		 b = 30;
		 int h = 2029;
		 System.out.printf("%d",b + h);
		 
	}
	
}