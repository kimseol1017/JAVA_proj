package leb;

public class ConsolOutput1 {

	public static void main(String[] args) {
		
		//변수 선언 : 소문자 시작, 단어가 이어질 떄 첫자를 대문자로 변수면 할당(카멜케이스)
		String dadname = "홍길동";
		String momname = "홍길순";
		String myname = "홍당무";
		
		int age = 30;

		double weith1 = 70.5;
		double weith2 = 50.7;
		
		//println() ; %d와 같은 처리기 사용 불가
		System.out.println("우리 아버님 이름은 " + dadname + " 이고, " + "우리 어머님 이름은 " + momname + " 입니다.");
		System.out.println("나의 이름은 " + myname + " 이고, 나이는 " + age + " 이고, 몸무게는 " + weith1 + " 킬로 입니다.");
		//printf() ;
		System.out.printf("우리 아버님 이름은 %s 이고, 우리 어머님 이름은 %s 입니다", dadname, momname);
		System.out.println();
		System.out.printf("나의 이름은 %s 이고, 나이는 %d 이고, 몸무게는 %2.1f 입니다.", myname, age, weith1);
		System.out.println();
		
	System.out.println("===============================================================");
		
		
	
		
		
		
		
		
	}

}
