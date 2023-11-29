package chap06;
//클래스 밖에 : 패키지,Import 값, 외부클래스


public class Object_D {
	//클래스 블럭내 : 필드 , 메소드,  생성자
	
	//필드 ( 멤버 변수 ) : Heap 공간에 변수와 같이 저장, 클래스 블럭에 선언된 변수를 필드라고 호칭
			//변수: 메소드 블럭내에서 선언 된 것 : Steak에 변수명,값 이 저장
	String name;
	int age;
	double weg;
	String add;
	
	//생성자 :  클래스 이름과 동일하고 리턴타입이 없는 메소드, 객체생성시 필드의 값을 초기화할 때 사용
	Object_D(){} // 기본 생성자 , 생략해도 됨. 객체 생성시 생성자 호출해서 필드의 값을 초기화
	
	//생성자 : 인풋값이 존재하는 생성자
	Object_D(String name, int age, double weg, String add){
		//this : 자신 객체의 필드, 인풋변수 이름 = 받는 변수이름 = 필드이름 이 동일 할 경우 this. 
		this.name = name;
		this.age = age;
		this.weg = weg;
		this.add=add;
		
	}
	
	//메소드(함수) : 리턴타입 메소드명(입력매개변수){ 호출 시 실행 코드 ; }
	void printName() {
		int a = 10; // 변수 : Steak공간에 변수명, 값이 들어감
		System.out.println("필드에 입력된 이름 : " + name);
	}
	
	// 메소드(호출시 작동) : 리턴타입이 반드시 와야함 , 리턴타입이 없으면 void
	int printAge() {
		return age;
	}
	
	void printAll() {
		System.out.println("이름 : " + name + " , 나이 : " + age );
		System.out.println(" , 몸무게 : " + weg + ", 주소 : " + add );
	}
	
	//메소드(함수) 블럭
	public static void main(String[] args) {
		/* 
		  절차지향 프로그래밍 ( POP ) : 시간의 순서에 따라서 프로그래밍.
		  	-성능이 우수, 유지보수 하기 힘듬
		  	- 개발하기 어려움 (규모가 커지면) , 반복된 코드가 계속 적용될 수 있다
		  	-한번 만들 때 최적화 해야함
		  객체지향 프로그래밍 ( OOP ) : 객체. 객체를 나누어서 프로그래밍.
		  	-유지보수가 쉽다
		  	-개발하기 쉽다
		  	-반복된 코드를 줄일 수 있다 
		  	-코드가 간결
		  	
		  	클래스 : 객체를 생성하는 틀, 설계도
		  	객체 (인스턴스) : 클래스를 기반으로 메모리에 로드
		  	
		 */
		
		//변수
		String abc;
		
		//1. 객체 생성 : 클래스를 메모리에 올림 (객체)
		//클래스명 객체 = new 클래스명();
		//타입     변수명	new		생성자 호출
		Object_D hong = new Object_D();		
		
		//2. 객체의 필드의 값 등록
		hong.name = "홍길동";
		hong.age = 30;
		hong.weg = 77.5;
		hong.add = "서울";
		
		//3. 객체의 메소드 호출
		hong.printName();
		
		System.out.println(hong.printAge());
		
		hong.printAll();
		
		System.out.println("===========================");
		
		//1.객체 생성 ㅣ 생성자에 매개변수의 값을 넣어서 객체 생성
		Object_D lee = new Object_D("이순신", 40, 88.8, "부산");
		// 2. 매소드 호출
		lee.printAll();
		System.out.println("=============================");

		// 1. 객체 생성 : 클래스(설계도) =======> 객체 (건물)
		Object_D kim = new Object_D("김설", 20, 54.00, "서울");
		
		//2. 메소드 호출
		
		kim.printAll();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		
		System.out.println("=============================");
		System.out.println(hong.name);
		System.out.println(hong.age);
		
		System.out.println("=============================");
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		System.out.println("=========필드의 값을 수정 ==========");
		lee.name = "이길동";
		lee.age = 77;
		
		System.out.println("=============================");
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		
		
	}

}
