package chap17.ex02;

import java.util.List;

public class Method {
	
	
		//1. 필드 
	List<Student> aList;
	int[] arr;
	
		//2. 기본 생성자 생략됨
	
		//3. 메소드 : 인풋 == (프로그램) == > 출력 ,  객체 생성후 메소드 호출
	void arryListOut (List<Student>aList) {
		
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	}
}
