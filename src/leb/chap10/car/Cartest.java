package leb.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Cartest {  

	public static void main(String[] args) {
		//
		
		//자식객체를 생성하면서 부모입으로 지정후 부모의 메소드 호출시 Overriding 된 자식의 메소드가 작동
		Car c1 = new  H_car();//H카 자식클래스
		c1.run();				//부모 클래스의 run() 호출 시 자식의 Overriding 된 메소드 적용
		
		Car c2 = new  K_car();//K카 자식클래스
		c2.run();
		
		Car c3 = new  S_car();//s카 자식클래스
		c3.run();
		
		Car c4 = new Car(); //부모 클래스
		c4.run();
		
		// ArrarList<Car>
		List<Car> aList = new ArrayList<>();
		
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		
		System.out.println("====================");
		//for 문을 사용해서 꺼내어 출력
		for (int i = 0; i < aList.size();i++) {

			aList.get(i).run();
		}
		

		
		
		
	}

}
