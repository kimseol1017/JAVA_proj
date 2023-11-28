package leb.chap05;

import java.util.Arrays;

public class Ractangle_Arrary {

	public static void main(String[] args) {
/* 
 	arr[3][10] : 행의 방 번호는 0 ~ 2 , 열의 방 번호는 0 ~ 9
 				0번 행에는 1부터 시작해서 1씩 증가
 				1번 행에는 3의 배수 저장
 				2번 행에는 7의 배수,  8의 배수저장
 				
 				2중 for문 사용
 				Enhanced for
 				Arrars.toString
  
 	*/
	int arr[][] = new int[3][10];
	int a = 1;
	int b = 3;
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			if(i == 0) {
				arr[i][j] = a++;
			}
			if(i == 1){
				arr[i][j] = b;
				b+=3;
			}
			if(i == 2) {
				int z = 1;
				for(j = 0; j < arr[i].length; z++) {
					if( z % 7 == 0 || z % 8 == 0) {
						arr[i][j] = z;
						j++;
					}
				}
			}
		}
		
	}
	System.out.println("=============For============");
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
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
	
	System.out.println("==========for문을 사용해서 Array.toString===========");
	for(int i = 0; i < arr.length ; i++) {
		System.out.println(Arrays.toString(arr[i]));
	}
		
		
	}

}
