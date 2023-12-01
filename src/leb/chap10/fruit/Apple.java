package leb.chap10.fruit;

public class Apple extends Fruit {

	
	//부모의 필드가 상속
	
	//기본 생성자 명시
	Apple() {} 
	//생성자 
	Apple(String name, int cnt, int price){
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}
	@Override
	void totalPrice() {
		System.out.println(name + "의 총 가격은 " + (super.cnt * super.price) + "입니다.");
	}
	
}
