package chap10.ex01;

public class Inherit01 {

	public static void main(String[] args) {
		/*
		 	상속 (Inheritance) : OOP 의 특징
		 		- 자바는 하나의 부모클래스만 상속 가능
				- 중복된 코드를 방지할 수 있다
					-OOP의 꽃
				- 부모클래스의 필드,메소드, 이너클래스가 그대로 자식클래스에게 상속된다 <== 생성자는 상속되지 않는다
				- 자식클래스를 생성하면 자식클래스 생성자 내부에 super() 라는 메소드가 생략되어있다
					 super() - 부모클래스의 생성자를 호출 
				- 자식클래스를 생성하면 부모클래스가 먼저 만들어지고 자식클래스가 생성
				- 자식클래스명 extends 부모클래스명	
		 */
		
		//1. Student 객체 생성
		Student s1 = new Student();
		
		//부모클래스에서 정의한 필드와 메소드
		s1.name = "홍길동";
		s1.age = 30;
		s1.eat(); //먹는다
		s1.sleep(); //잔다
		
		//Student 클래스의 필드와 메소드
		s1.studentID = 1111;
		s1.goToSchool();//학교를 갑니다
		
		s1.stuInfo();
		
		//2. Professor
		Professor p1 = new Professor();
		
		//부모의 필드 와 메소드
		p1.name = "김교수";
		p1.age = 50;
		
		p1.eat();
		p1.sleep();
		
		//자식의 필드오 메소드
		p1.professorID = 1122;
		p1.teach();
		 
		
		
		//3. Worker
		Worker w1 = new Worker();
		w1.name = "박교수";
		w1.age = 55;
		
		w1.eat();
		w1.sleep();
		
		w1.woirkerID =3333;
		w1.goToWork();
				
		
		
		System.out.println("======================");
		// this 키워드		: 자기자신의 객체, this.필드	this.메소드
		//	this () 메소드	: 생성자 실행 불럭에서 사용됨. 반드시 첫 라인에 와야함.
								// 다른 생성자를 호출
		
		
		// super 키워드 : 	부모의 필드, 메소드를 호출, sper.필드명, super.메소드명
		// super () 메소드 : 	생성자 실행블럭에서만 사용됨. 반드시 첫 라인에 와야함.
								// 부모클래스의 생성자를 호출
								// 자식클래스 생성자 내부에는 실행블럭 첫 라인에 super 메소드가 생략 되어있음
								// 자식 클래스를 생성하면 super() 에 의해서 부모클래스가 먼저 만들어진다.
		
		Student s2 = new Student(); //기본생성자 호출
		
		
		// Student 클래스의 input 이 1개인 생성자 호출
		System.out.println("=====================");
		Student s3 = new Student(9999);
		//1. Student (9999) 생성자 호출 ==> Human, Super("김똘똘",20); 호출
		//2. Object 가 생성 ==> Human 생성되고=> Student 생성
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s3.stuName);
		
		System.out.println("=====================");
		// Type Casting
		/*
		 	Upcasting : 자동 적용 될 수 있디ㅏ , 자식 --> 부모
		 		부모의 필드와 메소드만 사용가능
		 	DownCasting :명시가 필요하다 , 부모 --> 자식
		 		부모, 자식 필드와 메소드를 모두 사용할 수 있다
		 */
		
		// 자식객체를 만들면서 부모타입으로 지정함.  : 부모의 필드와 메소드를 사용가능
		//호출 : 1. Chird 호출 => 2. Professor 호출 =>Human 호출
		//생성 : 4. 호출의 역순
		
		Human ch01 = new Chird();		
		ch01.name =" 길동 ";
		ch01.eat();
		
		//다운 케스팅
		Professor pp1 = (Professor) ch01;
		
		//Human
		pp1.age = 10 ;
		
		//Professor
		pp1.professorID = 30;
		
		
		
	}
	
	

}
