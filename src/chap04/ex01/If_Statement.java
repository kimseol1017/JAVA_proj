package chap04.ex01;

public class If_Statement { 
	public static void main(String[] args) {
		/*
		 //클래스 명은 반드시 영 대문자, 
		  * 변수명은 소문자(권장사함), 
		  * 상수는 대문자(권장),
		  *  특수문자 : _ , % 만 사용가능
		  *  숫자가 처음에 오면 오류발생	 
		 */
		
		// 제어문 
		/* 
		 if문  <==== break; 내장
		 switch문  <========= break; ( 블럭을 빠져나올 때 사용) 
		 
		 if 조건문
		 
	 1.  if(조건){
		 	조건 일때;
		 }else {
		 	조건이 성립하지 않을 때;
		 }
		 
	 2. 
		 if(조건 1){
		  		조건 1일 떄 ;
		  } else if(조건2){
		  		조건 2일 때;
		  } else {
		  		조건 1,2 모두 아닐 때;
		  }
	  3. 		한 라인 으로 사용
			
				if (조건) { 조건이 성립할 때 }
				if (조건)  조건이 성립할 때 ;
			
			
			
		 */
		int a = 10;
		
		if (a < 30) {
			System.out.println("참입니다"); // 참 일 때 실행
		}else {
			System.out.println("거짓입니다"); //거짓 일 때 실행
		}
		
		System.out.println("프로그램을 종료 합니다");
		
		
		
	}

}
