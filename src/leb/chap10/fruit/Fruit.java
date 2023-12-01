package leb.chap10.fruit;

public class Fruit {	//부모클래스
	
	//필드
	String name; //이름
	int cnt; //갯수
	int price; //가격
	
	//메소드
	void totalPrice () {
		System.out.println("모든 과일의 합계는 : " + ( cnt * price )); 
	}
	
}
