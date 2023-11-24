package leb.chap04_보강;

public class While_ST {

	public static void main(String[] args) {
		/* 
		  1000 부터 1까지 5씩 감소하면서 출력  , for , while
		 */
		
			for(int i = 1000; i > 0; i-=5) { 
	//내가 입력한 조건은 i == 1 이었지만 이건 i를 1000으로 초기화 한 상태에서 i 가 1일 때 5를 빼므로 결과가 나올 수 가 없다
				System.out.println(i);
				
			}
		System.out.println("===================");
		System.out.println();
		
			int a = 1000;
			while(a > 0) {
				System.out.println(a);
				
				a-=5;
			
			}
		
	}

}
