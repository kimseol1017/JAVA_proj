package chap02.ex01;

public class UsageOiDataType {// UsageOfDataType //클래스 영역
	
		public static void main(String[] args) { //메인 메소드
			
			//변수: 힌반 산언 후 변수의 값에 다른값을 할당할 수 있다  , 소문자로 시작 ,카멜케이스
			//상수: 변수 선언 앞에 final key 가 등록됨 , 상수명은 대문자로만 시작 , 한번 갚을 할당하면 그 값을 수정할 수 없다.
			
			/* 자료형: 변수/상수를 정의할 때 반드시 자료형
			
			기본 자료형 (8개) : 메모리의 stack 공간에 변수와 같이 할당
				boolean, 정수 (byte, short, int, long) , 실수 (float, double), 문자 (char)
				(true/false)   1     2      4    8             		               2
			참조 자료형 (무한개) 메모리의 stack 공간에는 변수명, 값은 Heap 에 저장됨
				String : 참조자료형 ,문자열을 담은다
				객체, 배열 , 인터페이스
			
			*/
			
			//1. 변수 선언 방법 2가지
				//1. 변수 선언과 , 값은 나중에 할당
					int a; //변수 선언
					int b;
					
					a = 1;// 변수 값 선언
					
					System.out.println(a);
					//      System.out.println(b); //오류 발생 : 변수 선언후 같이 할당이 안되어 있어
					
					
					
					
				//2. 변수 선언과 동시에 값을 할당
					int c = 20;
					int d = 10;
					System.out.println(c); //20
					System.out.println(d); //10
			
				//리터럴 : 변수, 상수에 들어가는 값
				//변수에 새로운 값을 할당
					
				c = 70;
				d = 30;
				System.out.println(c);
				System.out.println(d);
				
				//상수 : 한번 값이 할당되면 다른 값을 넣을 수 없다.
				// 상수명은 대문자로, final key 넣어서 상수선언.
				final int Fi = 2000;
				final double Pi = 3.14;
				
				System.out.println(Fi);
				
				//Fi = 3030; //상수는 새로운 값을 넣으면 오류 발생
				
				
				System.out.println("---------8가지 자료형------------");
				
				//기본자료형 8가지
				//1. boolean
				boolean bol ; // true/false 값만 들어감
				bol = true;
				
				System.out.println(bol);
				
				//2. 정수 값을 넣을 수 있는 자료형 (byte, short, int, long)
				// byte : -128 ~ 127 1byte
				byte by ;
				/*by = -170;  오류가 남 가능 범위를 벗어남
				System.out.println(by);   */
				by = 127;
				System.out.println(by);
				by = -128;
				System.out.println(by);
				
				//short : 2byte : -32,768 ~ 32,767
				short sh;
				short ss;
				sh = 32767;
				ss = -32768;
				System.out.println(sh);
				System.out.println(ss);

				//int : 4byte : -2,147,483,648 ~ 2,147,483,647
				int iids;
				iids = -2_147_483_648; // _ : 구분자로 생략
				int io;
				io = 2_147_483_647;
				System.out.println(iids);
				System.out.println(io);
				//long : 8byte : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
					// 제일 처음 비트 (MSB 는 +/- 부호를 처리하는 비트)
					//clac
					// 리터럴에 l, L 을 명시해야함
				long gg;
				long hh;
				//정수의 범위를 벗어난 값을 넣을 때 : L 을 넣어서 선언
				gg = -9_223_372_036_854_775_808L; // 리터럴에 L 을 적용
				hh = 9_223_372_036_854_775_807L;
				System.out.println(gg);
				System.out.println(hh);
				
				long li;
				li =5000; // int 범위 내의 값은 L 을 명시하지 않아도 됨
				System.out.println(li);
				//실수 : float, double <== 기본
				//float : 4byte 소수점 7자리 까지 정밀도가 유지됨 , 리터럴 뒤에 f, F
				float jj;
				jj = 3.148888888888888F; //리터럴 값 뒤에 F 명시
				System.out.println(jj);
				
				//double : 8byte 소수점 15자리까지 정밀도가 유지됨 , <==== 기본형
				double kk;
				kk = 3.14888888888888888888888;
				System.out.println(kk);
					
				System.out.println("==========================");
				
				//3. 문자형 (char) 1문자를 넣을 수 있음
					// 문자열 = string : 두글자 이상 , "" 
				/* 
				 	- char 의 값(리터널)을 넣을때는 ''
					- 문자, 아스키코드 값(10진수), 유니코드로 할당 (16진수)
				 	-1문자
				 	
				 	- 아스키 코드 : 7bit ,영어 숫자, 특수문자 표현가능
				 	- 유니코드 : 2~3byte 한글, 일본어. 중국어 등
				 */
				char ca;
				ca = 'a';
				char mm;
				mm = '가';
				System.out.println(mm);
				System.out.println(ca);
				System.out.println("----------------------------");
				//문자로 값넣기 :a
				char nn = 'a';
				System.out.println(nn);
				//10진수 아스키 코드 값으로 값넣기 :a
					// '' 넣으면 오류
				char oo = 97;
				System.out.println(oo);
				// 16진수 유니코드 값으로 값넣기 :a
				char pp = '\u0061';// 유니코드 0061 = a 
				System.out.println(pp);
				
				System.out.println("-----------------------------");
				char firstName1 ='\ud604';//이름	:현
				char firstName2 ='\uc900';//이름	:준
				char lastName1 ='\ucd5c'; //성 	:최
				
				System.out.println("나의 이름은 " + lastName1 + " " + firstName1 + firstName2 +" 입니다.");
				System.out.printf("나의 이름은 %c %c%c 입니다.", lastName1, firstName1, firstName2);
				
		}

	
}
