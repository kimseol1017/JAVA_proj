package chap06;
//외부클래스 : public  class는 하나만 올 수 있다

class Student {
	// 필드, 메소드, 생성자. 이너클래스
	
	//객체 :보이는 모든 사물
	//1. 필드 
	String name; 
	int num;
	int kr;
	int en;
	int math;
	
	//2. 기본 생성자 : 다른 생성자가 없을 때 생략 가능
//			Student (){} // 기본생성자 (다른 생성자가 없으면 생략간능)

	//3. 메소드 (반드시 return 타입지정)
		
		void printAll () { //필그에 등록된 값을 출력
			System.out.println("이름 : " + name );
			System.out.println("학번 : " + num );
			System.out.println("국어 : " + kr );
			System.out.println("수학 : " + en );
			System.out.println("영어 : " + math );
//			System.out.println("평균 : " + (kr + en + math )/3);
		}
		
		double avg() {
			double avgAll = 0.0;
			
			//필드의 모든 값을 더해서 평균 계산, 리턴
			avgAll = (kr + en +math) / 3.0 ;
			
			return avgAll;
		}
		
		int plus (int a, int b) {
			int hap = a + b;
			
			return hap;
		}
		String abc (String name , String name2) {
			
			return name + " + " + name2;
		}
}
	
class Car{
	//1. 필드선언
	String carName;
	String carColor;
	double carSpeed;
	int carDoor;
	
	//2. 생성자 : 리턴타입이 없는 메소드 ,클래스 이름과 동일,  필드의 값을 초기화
	
	// 생성자 : 인풋값이 있는 생성자
	Car () {}
	
	Car (String a,  String carColor, double carSpeed, int carDoor){
		carName = a;// 이름이 다르면 필드 인식
		this.carColor = carColor; // 이름이 같으면 this.필드명 사용
		this.carSpeed = carSpeed;
		this.carDoor = carDoor;
	}

	
	//메소드 : 프로그램의 기능, 호출 시 작동
	void printAll() {
		System.out.println("차량 명 : " + carName);
		System.out.println("차량 색상 : " + carColor);
		System.out.println("차량 속도 : " + carSpeed);
		System.out.println("차량 도어수 : " + carDoor);
	}
}

public class Ob_Df {
	

	public static void main(String[] args) {
		
		//객체 생성 테스트 ㅣ 반드시 Main 메소드에서 실행
		Student s1 = new Student();
		
		// 객체의 모든 필드 출력;
		
		//메소드 호출	
		s1.printAll();
		
		System.out.println(s1.plus(20, 50)); //결과값으로 돌려준다 = Return
		
		System.out.println(s1.abc("홍길동", "이순신"));
		// s1객체의 필드의 값을 주입 : 직접 입력 , 생성자를 통해서 , setter를 통해서 입력
		System.out.println("=============================");
		s1.name = "김설";
		s1.num = 111;
		s1.kr = 100;
		s1.en = 100;
		s1.math = 100;
		
		s1.printAll();
		System.out.println("=================");
		System.out.println("평균점수 : " + s1.avg());
		
		System.out.println("=================");
		
		Student s2 = new Student();
		s2.name = "이소라";
		s2.num = 2222;
		s2.kr = 100;
		s2.en = 77;
		s2.math = 55;
		
		System.out.println("평균출력 : " + s2.avg());
		s2.printAll();
		
		System.out.println("=================");
		//Car 객체 생성
		Car car1 = new Car(); //오류발생 : 기본생성자 호출 (인풋값이 있는 기본생성자 가 있을 땐 생성자 생략 불가능)
		car1.printAll();
		
		System.out.println("=================");
		Car car2 = new Car("소나타","블랙",230.2 , 4 );
		car2.printAll();
		
	}

}
