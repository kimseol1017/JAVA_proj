package leb.chap10.car;

public class H_car extends Car{
	
	@Override  // @ (어노테이션), @Override : 부모의 메소드를 오버라이딩 하겠다고 선언 + 부모에 있는 메소드인지 확인
	void run() {
		System.out.println("현대 자동차입니다");
	}

}
