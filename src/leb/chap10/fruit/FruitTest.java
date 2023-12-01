package leb.chap10.fruit;

import java.util.List;
import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		/*
		  1.자식 객체를 생성 후
		  	Apple("사과",30,5000) Fruit 타입으로 정의
		  	Banana("바나나",44,6000)
		  	StrawBerry("딸기" , 55, 7000)
		  	
		  2.ArrayList 객체  3개를 저장
		  
		  3.for문으로 ArrayList 의 객체를 꺼내어 totalPrice() 호출시 오버라이딩된 가격을 출력
		  4. 출력 : " 000 의 전체 가격은 : 000 입니다 "
		  
		  자식객체를 생성하면서 부모 타입으로 지정하면 , 배열이나 클래스에 동일한 타입으로 저장
		  
		  
		 */
		
		Fruit f1 = new Apple("사과",30,5000);
		Fruit f2 = new Banana("바나나", 44, 6000);
		Fruit f3 = new Strawberry("딸기", 55, 7000);
	
		
		List<Fruit> aList = new ArrayList<>(); //List<클래스명> 리스트변수명 = new ArrayList<>();
		
		Apple a1 = new Apple();
		
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		aList.add(a1);	// 자동 upcast 가 이루어져서 Apple타입이 Fruit 타입으로 배열에 들어감
		
		float t = 0;
		t = (f1.cnt*f1.price) + (f2.cnt*f2.price) + (f3.cnt*f3.price);
		for (int i = 0 ; i < aList.size();i++) {
			aList.get(i).totalPrice();
			
		}
		System.out.println("모든 과일의 총 가격은 " + t + " 입니다" );
	}

}
