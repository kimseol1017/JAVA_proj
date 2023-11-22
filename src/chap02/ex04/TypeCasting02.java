package chap02.ex04;

public class TypeCasting02 {

	public static void main(String[] args) {

		
		int kor = 77;
		int eng = 88;
		int math = 98;
		
		//합계 : kor + eng + math
		
		System.out.println("합계" + ( kor + eng + math) );
		
		//평균 : ( kor + eng + math) / 3
		
		System.out.println("케스팅 전 평균" + ((kor + eng + math) / 3) );
		System.out.println("평균" + ((double)(kor + eng + math) / 3) );
	
		System.out.println("===============================");
		
		int hap = kor + eng + math;
		
		double avg = ((double)hap)/3; // hap : int ==> double 업케스팅 후 3으로 나눠서 평균을 구함
		
		double avg1 = hap /3 ; //87.0 				        정수/정수 => 정수 => 더블
		double avg2 = hap / 3.0; //87.66666666666667		정수(더블)/더블 => 더블 => 더블				
															//3.0 이 double , hap 이 double 로 업케스팅이 되어 나타남
		
		
		System.out.println("합" + hap );
		System.out.println("평균" + avg);
		
		System.out.println("=====================");
		System.out.println(avg1);
		System.out.println(avg2);
	}

}
