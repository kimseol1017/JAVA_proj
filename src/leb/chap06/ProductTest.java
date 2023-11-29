package leb.chap06;

public class ProductTest {

	public static void main(String[] args) {

		//product 객체 4개 생성
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		
		//Setter를 사용해서 객체의 필드의 값을 입력
		p1.setIdk(1);
		p1.setProName("A");
		p1.setYear(2000);
		p1.setQty(2); //갯수
		p1.setProColor("White");
		
		p2.setIdk(2);      
		p2.setProName("B"); 
		p2.setYear(2010);      
		p2.setQty(21); //갯수  
		p2.setProColor("SkyBlue");
		 
		p3.setIdk(3);      
		p3.setProName("C"); 
		p3.setYear(2022);      
		p3.setQty(1); //갯수  
		p3.setProColor("Black");
		
		p4.setIdk(4);      
		p4.setProName("D"); 
		p4.setYear(2021);      
		p4.setQty(3); //갯수  
		p4.setProColor("Red");
		
		
		//배열 arr [10] product 객체 4개 를 저장
		
		Product[] arr = new Product[10];	//Product(클래스) 라는 참조 타입 클래스 변수
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		System.out.println("===========================");
		//배열에 있는 값을 꺼내어 Product 변수 p 에 담고 출력 for
		for(int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			if(p == null) {
				break;
			}
			System.out.println(p);
		}
		
		
		
	}

}
