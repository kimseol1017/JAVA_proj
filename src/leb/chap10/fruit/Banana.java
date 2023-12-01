package leb.chap10.fruit;

public class Banana extends Fruit {

	Banana () {} 
	
	Banana(String name, int cnt, int price){
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}
	@Override
	void totalPrice() {
		System.out.println(name + "의 총 가격은 " + (super.cnt * super.price) + "입니다.");
	}
	
	
}
