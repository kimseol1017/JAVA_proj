package chap10.ex01;

public class Human {  // 사람 : 부모 ( super class ) 
	
	// 기본생성자
	Human () {
		super();     // Object 클래스가 호출  ,  Java.lang.Object
	}
	
	//생성자
	Human (String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	
	//필드
	String name ;
	int age;
	
	//메소드
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
	
	
	
	
	
	
	
	
	
	
}
