package cha05.ex04;

public class Array_Definitioin {

	public static void main(String[] args) {
		/*
		   배열 선언방법 : 3가지
		  */
		
		//1. 배열 선언 - 1
		
		int[] arr1 = new int[3]; //선언과 동시에 방의 크기 지정
		
		int[] arr2 ; 		//선언
		arr2 = new int[3];	// 빙의 크기는 다중에 지정
		
		// 2 배열선언 - 2
		int arr3[] = new int[3];
		
		int arr4[];
		arr4 = new int[3];
		
	
		// 3. 배열선언 -3 <==== 배열 선언과 동시에 값을 할당
		int[] arr5 = new int[] {10,20,30,40,50};
		
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);
		
		System.out.println(arr5.length); //방의 개수
		System.out.println("========================");
		
		int[] arr6;
		arr6 = new int[] {100,200,300,400,500,600,700}; //값을 나중에 할당
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		System.out.println(arr6[3]);
		System.out.println(arr6[4]);
		System.out.println(arr6[5]);
		System.out.println(arr6[6]);
		
		// 4. 배열선언 -4 : 배열 선언하며 값을 바로 할당 
		System.out.println("========================");
		int[] arr7 = {11,22,33,44,55}; //new int[] 를 생략
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		System.out.println(arr7[3]);
		System.out.println(arr7[4]);
		// 주의 : 선언과 값할당을 분리하면 오류 발생 분리 할 땐 new int[] 가 들어가야함
		
		int[] arr8 ;
//		arr8 = {66,77,88,99}; <== 오류발생 new int[]{66,77,88,99}; 로 해결함
		System.out.println("========================");
		
		String [] arr9 = {"아버님", "어머님", "형제","동생"}; //String 으로 선언 ==> 문자열
		
		for (int i = 0; i < arr9.length; i++) { //arr9.length 방의 갯수
			System.out.println(arr9[i]);
		}
			
		System.out.println("========================");
		//배열 방의 값을 수정
		
		arr9[0] = "BTS";
		arr9[1] = "걸그룹";
		arr9[2] = "소녀시대";
		arr9[3] = "원더걸스";
			
		for (int i = 0; i < arr9.length; i++) { //arr9.length 방의 갯수
			System.out.println(arr9[i]);
			}
		}
	}
	


