package leb.chap02;

import java.util.Scanner;

public class UsingSccaner {

	public static void main(String[] args) {

		// 스캐너 로 각 변수의 값을 입력 받아서 
		String stu1 ; // 학생1
		String stu2 ; // 학생2
		String stu3 ; // 학생3
		
		int kor ; 
		int eng;
		int math;
		
		/*int kor2 ; 
		int eng2;
		int math2;
		
		int kor3 ; 
		int eng3;
		int math3;
		*/
		int sum ; // 정수의 합계
		double avg ; // 평균
		
		
		/*int sum2 ; // 정수의 합계
		double avg2 ; // 평균
		
		int sum3 ; // 정수의 합계
		double avg3 ; // 평균
		*/
		Scanner ip = new Scanner(System.in);	//변수명 ip 를 사용해서 스캐너 명령을 호출함
		
		System.out.println("==========학생 1===========");
		
		System.out.println("학생 1의 이름, 국어, 영어, 수학 점수를 입력하세요 : ");
		
		stu1 = ip.next(); // 변수 = 스캐너 변수명 .next(); => string 값을 입력받음.
							// 콘솔에서 인풋을 대기
		kor = ip.nextInt();// 변수 = 스캐너 변수명 .nextInt(); => int(정수) 값을 입력받음.
		eng = ip.nextInt();
		math = ip.nextInt();
		
		sum = kor + eng + math; // sum 에 모든 점수의 합을 저장함
		avg = ((double)sum)/3; //avg 는 모든 접수의 합 에 대한 평균을 구해 double 로 업케스팅 3.0 을 나눠도 됨

		System.out.printf("%s의 모든 점수의 합계는 %d점 이고 평균은 %.2f점 입니다",stu1 ,sum ,avg);
		// 코드 부분
		// System.out.println("홍길동의 점수의 합계는 333점 이고 평균은 88점 입니다"); //출력 결과
		System.out.println();
		System.out.println("==========학생 2===========");
		
		System.out.println("학생 2의 이름, 국어, 영어, 수학 점수를 입력하세요 : ");
		
		stu2 = ip.next();
		kor = ip.nextInt();
		eng = ip.nextInt();
		math = ip.nextInt();
		
		sum = kor + eng + math; // sum 에 모든 점수의 합을 저장함
		avg = ((double)sum)/3; //avg 는 모든 접수의 합 에 대한 평균을 구해 double 로 업케스팅 3.0 을 나눠도 됨
		
		System.out.printf("%s의 모든 점수의 합계는 %d점 이고 평균은 %.2f점 입니다",stu2 ,sum ,avg);
		
		System.out.println();
		System.out.println("==========학생 3===========");
		
		System.out.println("학생 3의 이름, 국어, 영어, 수학 점수를 입력하세요 : ");
		
		stu3 = ip.next();
		kor = ip.nextInt();
		eng = ip.nextInt();
		math = ip.nextInt();
		
		sum = kor + eng + math; // sum 에 모든 점수의 합을 저장함
		avg = ((double)sum)/3; //avg 는 모든 접수의 합 에 대한 평균을 구해 double 로 업케스팅 3.0 을 나눠도 됨
		
		System.out.printf("%s의 모든 점수의 합계는 %d점 이고 평균은 %.2f점 입니다",stu3 ,sum ,avg);
		
		
		
		
	}

}
