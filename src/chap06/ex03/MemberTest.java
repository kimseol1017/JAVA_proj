package chap06.ex03;

public class MemberTest {

	public static void main(String[] args) {
//		같은 패키지 내에선 import 없이 클래스를 사용할 수 있다. 
//		접근 제어자가 default 이상일 때
		
		//1. 객체 생성
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		
		//2. 객체의 필드 접근 << DB의 값을 불러와서 자바 객체에 필드의 값을 주입
			//입력 setter 
		m1.setIdx(1);
		m1.setId("Adminisrator");
		m1.setPw("1001");
		m1.setPhone("010.1111.1111");
		m1.setName("관리자");
		m1.setYear(2000);
		m1.setMonth(10);
		m1.setDay(17);
		m1.setAddr("Seoul");
		
		
		m2.setIdx(2);
		m2.setId("id002");
		m2.setPw("1002");
		m2.setPhone("010.1221.2211");
		m2.setName("김길동");
		m2.setYear(1999);
		m2.setMonth(10);
		m2.setDay(1);
		m2.setAddr("Busan");
		
		m3.setIdx(3);
		m3.setId("id003");
		m3.setPw("1003");
		m3.setPhone("010.1321.2331");
		m3.setName("김길순");
		m3.setYear(1939);
		m3.setMonth(12);
		m3.setDay(1);
		m3.setAddr("Ulsan");
		
		m4.setIdx(4);
		m4.setId("id004");
		m4.setPw("1004");
		m4.setPhone("010.1421.2414");
		m4.setName("강원구");
		m4.setYear(1993);
		m4.setMonth(11);
		m4.setDay(12);
		m4.setAddr("Yangsan");
		//3. 필드의 값을 출력 : getter
		
		System.out.println("===========================");
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
		System.out.println(m1.getPw());
		System.out.println(m1.getPhone());
		System.out.println(m1.getName());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getAddr());
		System.out.println("===========================");
		
		//4. 객체 자체를 출력시 객체의 Heap 의 주소가 출력
		System.out.println(m1); //chap06.ex03.Member@2f92e0f4 ---> 패키지명.클래스명@Heap의 주소
		System.out.println(m2);	//오버라이딩 후엔 heap 의 주소가 나오지 않고 필드의 내용이 나옴
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println("=============for==============");
		//5. 객체를 배열에 저장 ======> 컬렉션 (ArrayList) 에 저장
		
		
		Member[] arr = new Member[10]; //arr 배열에 Member 객체를 담음
		
		arr[0] = m1;
		arr[1] = m2;
		arr[2] = m3;
		arr[3] = m4;
		
		//6. 배열의 정보를 꺼내어 출력
		for(int i = 0 ; i < arr.length; i++) {
			Member mem1 = arr[i];
			
			System.out.println(mem1);
		}
		
		
	}

}
