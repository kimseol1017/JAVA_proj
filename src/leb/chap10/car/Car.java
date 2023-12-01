package leb.chap10.car;

public class Car {	//부모클래스
	
	//필드
	String name;
	
	
	//메소드 [인스컨스 메소드] : 인스턴스 메소그만 Overriding 가능
	
	void run() { // 자식에서 오버라이딩
		System.out.println("모든 자동차는 달립니다.");
	}

}
