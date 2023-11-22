package leb.chap03;

import java.util.Scanner;

public class ConverType {

	public static void main(String[] args) {

		//String 으로 인풋 받은 값을 정수나 실수 타입으로 변환해서 출력
			// Integer.parseInt(변수); 변수 : 문자열로된 정수 , "13"
			// Double.parseDouble(변수); : 문자열로된 실수 , "13.33"
		
		// Scanner 에서 국어, 영어, 수학 점수를 입력받음
		
		Scanner se = new Scanner(System.in);
		
		
		 /*		
		   		String 형식으로 입력받았을 때
		  
				String kor ;
				String eng ;
				String math ;
					
				kor = se.next();
				eng = se.next();
				math = se.next();
				
				hap = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math) ;
		*/
		
		// 정수형태로 입력 받았을 때
		int kor ,eng ,math;
		
		int hap;
		double avg;
		
		
		
		System.out.println("국어점수 영어점수 수학점수 를 공백으로 구분해서 넣으세요");
		
		
		kor = se.nextInt();
		eng = se.nextInt();
		math = se.nextInt();
		 
		hap = kor + eng + math;
		avg = (double)hap/3;
		// 아래와 같이 출력
		System.out.println("모든 과목점수의 합 :" + hap);
		System.out.println("모든 과목의 평균은" + avg);
		
		
		
	}

}
