package leb.chap04_보강;

public class For_ST2 {

	public static void main(String[] args) {
		/* 
		    2중 for  문을 사용해서 1 ~ 19 단 까지, 각 단을 옆으로 출력 printf
		   		-- 6단과 7단 ,12단,  을 제외 하고 출력 continue
		   
		  */

		
		for (int i = 1; i < 20; i++) {
			if( i == 6 || i == 7 || i == 12) continue;
			for (int j = 1; j < 10; j++) {
				
				System.out.printf("%d * %d = %d\t", i, j, i*j);		
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
