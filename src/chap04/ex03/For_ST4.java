package chap04.ex03;

public class For_ST4 {

	public static void main(String[] args) {
		// 이중  for문
		
		
		
	for (int i = 0; i < 10 ; i++) {
		System.out.println("바깥쪽 For:" + i);
		for ( int j = 0; j <10; j++) {
			System.out.println("i 변수 :" + i + "j변수 : " + j );
			
		}
		System.out.println("======================================");
		
	}
		
	System.out.println("==================구구단 출력= 아래방향===================");
		System.out.println();
		
		//2중 for 문으로 구구단 
		for( int i = 1 ; i <10 ;i++) {
			System.out.println("================" + i + " 단 출력===============");
			for (int j = 1 ; j <10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		System.out.println("======================================");
		System.out.println("==================구구단 출력= 옆방향===================");
		System.out.println();
		
		//2중 for 문으로 구구단 
		for( int i = 1 ; i <10 ;i++) {
		
			for (int j = 1 ; j <10; j++) {
				System.out.printf("%d * %d = %d \t",i, j, i*j);
			}
			System.out.println();

		}		
		
		
	}

}
