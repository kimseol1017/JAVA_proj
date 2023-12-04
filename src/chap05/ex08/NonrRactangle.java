package chap05.ex08;

import java.util.Arrays;

public class NonrRactangle {

	public static void main(String[] args) {
//	2차원 베열 : 비정방형 배열 : 행에 대해서 열의 갯수가 다른 배열
		
		//1. 비정방형 배열 선언 
		int [][] arr = new int[3][]; // 행 3개(정의) 열을 정의하지 않음
		
		//2. 행에 대한 열의 방의 크기를 지정
		arr[0] = new int[2]; // 0 번 행의 열의 갯수 정의 2
		arr[1] = new int[3]; // 1 번 행의 열의 갯수 정의 3
		arr[2] = new int[5]; // 2 번 행의 열의 갯수 정의 5
		
		//3. Arrays.toString() 으로 출력
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		
		
	}

}
