package chap17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
					배열 :
						하나의 변수에 많은 값을 저장 : 방번호가 있다. index 0 ~~
						동일한 타입의 자료를 저장. : 기본자료형, 참조자료형
							int[] arr1 : new int[10];
						
						단점 : 
							- 배열의 중간에 값을 삭제할 셩우 , 자동으로 당겨지고 늘어나지 않는다.
							- 배열의 방의 크기가 지정되면 수정이 불가능,
							-
					
					컬렉션 (프레임 워크) : 배열의 단점을 보완해서 만든 클래스 
						-List (인터페이스) : ArrayList , LinkedList, vector
						 		<메소드 선언> :    <메소드 구현>
						- Set <인터페이스> : hashSet,LinkedHashSet<E>,TreeSet<E>
						- Map <인터페이스> : HashMap<E>,LinkedHashMap<E>.....
						
						장점: 값을 넣으면 무한히 저장을 할 수 있다.  <== 방크기를 선언하지 않는다 
							- 중간에 값을 삭제하면 자동으로 당겨진다. 중간에 값을 넣었을 경우 자동으로 이동이 된다
							- 제너릭 타입으로 타입을 지정함. < >
					 
		  */
		//배열 : 
			String arr1 [] = new String[] {"가","나","다","라","마","바","사"};
			
			for(int i = 0 ; i < arr1.length;i++) {
				System.out.print(arr1[i] + " , ");
			}
			System.out.println();
			System.out.println(arr1.length);
			
		// 특정 방의 값을 삭제 <=== 자동으로 줄어들지 않는다. 방 크기도 줄어들지 않음
			arr1[2] = null; 
			arr1[3] = null;
			System.out.println(Arrays.toString(arr1));
		
		//컬럭션 : ArrayList : 
				//List : 인터페이스 <======메소드를 선언
				//ArrayList : List 인터페이스를 구현 구현체
				//import 필요
			//1. ArrayList
			List<String> aList = new ArrayList<String>();
			
			List<String> aList2 = new ArrayList<>();
			
			ArrayList<String> aList3 = new ArrayList<>();
			
			// ArrayList : 메소드를 사용해서 값을 넣고 , 삭제 
			// aList.size() 	: 방의 갯수를 출력
			// aList.add("가") , aList.add("나") <=== 값을 넣을 때
			// aList.remove("나")				<=== 값을 삭제
			
			//방의 크기를 출력
			
			System.out.println(aList.size()); // 방의 갯수 : 0
			
			// 값을 입력
			
			aList.add("가");		// 마지막 방에 추가
			System.out.println(aList.size()); // 방의 갯수 : 1
			
			// 방의 값을 출력
			System.out.println(aList); //컬렉션을 toString() 가 오버라이딩 되어있다.
			
			// 값을 더 입력
			aList.add("나");aList.add("다");aList.add("라");
			aList.add("마");	aList.add("바");aList.add("사");
			
			// 출력
			
			System.out.println(aList);
			System.out.println(aList.size());
			
			// 중간에 값을 넣기
			aList.add(3, "안녕");	//index 3번에 안녕 을 넣음
			
			System.out.println(aList);
			System.out.println(aList.size());
			
			
			// 중간에 값 삭제하기 
			aList.remove(3);
			System.out.println(aList);
			System.out.println(aList.size());
			
			aList.remove("라");
			System.out.println(aList);
			System.out.println(aList.size());
			
			// 특정 방의 내용 출력  aList.get()
			System.out.println("=============");
			for (int i = 0; i < aList.size(); i++){
				System.out.println(aList.get(i));
			}
			// 배열의 모든 값을 출력	: Arrays
			
			
			
	}

}
