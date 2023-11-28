package leb.chap05;

import java.util.Arrays;

public class Ractangle_Arrary2 {

	public static void main(String[] args) {
		
		/*
		  
		  arr : 배열 변수명, 2차원 배열, [5][10] , 행 0 ~ 4 , 열 0 ~ 9
		  
		  	arr[0] : 짝수만
		  	arr[1] : 홀수만 , 3의 배수 제외
		  	arr[2] : 4 , 5의 배수 
		  	arr[3] : 10 의 배수 저장
		  	arr[4] : 8단 (구구단)
		  	
		  	for문
		  	E_for문
		  	Arrays_toString
		 */
		
		int[][] arr = new int [5][10];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				int a = 1;
				for(int j = 0; j < arr[i].length; a++) { // a 는 계속 증가 
					if(a % 2 == 0) {
						arr[i][j] = a;
						j++;	// 값이 입력 될 때 방번호 증가
					}
				}
			//	int a = 2;
			//	for(int j = 0; j < arr[i].length; j++){
			//			arr[i][j];
			//			a+=2;
			//		}
			}else if( i == 1) {
				int a = 1;
				for(int j = 0; j < arr[i].length; a++) {
					if(a % 3 == 0) continue;
					if(a % 2 != 0) {
						arr[i][j] = a;
						j++;
					}
				}
				/*if(a % 2!= 0){ 
				  if (a % 3 != 0){			//중첩 if 문 사용 2조건을 모두 만족해야 실행
				  arr[i][j] = a;
				  j++
				  	}
				  		} */
			}else if( i == 2) {
				int a = 1;
				for(int j = 0; j < arr[i].length; a++) {
					if(a % 4 == 0 || a % 5 == 0) {
						arr[i][j] = a;
						j++;		//값을 넣어야 방번호가 증가
					}	
				}		
			}else if( i == 3) {
				int a = 1;
				for(int j = 0; j < arr[i].length; a++) {
					if(a % 10 == 0) {
						arr[i][j] = a;
						j++;
					}	
				}	
			}else {
				int b = 0;
				for(int j = 0; j < arr[i].length; j++) {
					for(int a = 1; a <= 10; j++) {
						b = a * 8;
						arr[i][j] = b;
						a++;
				}
			}
		}
		
				
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("=============E_For============");
		for(int[]i : arr) {
			for(int v : i) {
				System.out.print(v);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		System.out.println("=============Arrars.toString============");	
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
		
		System.out.println("==========for문을 사용해서 Array.toString===========");
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		

	}//main 
}
