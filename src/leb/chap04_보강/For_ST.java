package leb.chap04_보강;

public class For_ST {

	public static void main(String[] args) {

		// 구구단 7단
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("7 * %d = %d \n", i, i*7);
		}
		
		
	System.out.println("=========================");
	for (int i = 0, j = 7; i < 10; i++) {
		System.out.printf("%d * %d = %d \n",j, i, i*j);
	}
		
	System.out.println("========탭으로 구분해서 한 라인으로  출력==============");
	
	for (int i = 0, j = 7; i < 10; i++) {
		System.out.printf("%d * %d = %d \t",j, i, i*j);
	}
	
	System.out.println();
	
	for (int i = 0, j = 8; i < 10; i++) {
		System.out.printf("%d * %d = %d \t",j, i, i*j);
	}
	}

}
