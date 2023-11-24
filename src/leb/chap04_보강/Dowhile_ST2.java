package leb.chap04_보강;

import java.util.Scanner;

public class Dowhile_ST2 {

	public static void main(String[] args) {		

				Scanner sc = new Scanner (System.in);
				
				int a;
				
				do {
					System.out.println("===============================");
					System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의 배수 출력");
					System.out.println("4 . 10개의 정수를 입력받아 그 수들중 짝수의 개수가 몇개인지 출력합니다");
					System.out.println("5 . 프로그램 종료");
					System.out.println("===============================");
					System.out.println(" 위 내용을 정수로 입력하세요 >>>");
					a = sc.nextInt();
					if(a == 1) {
						System.out.println("1번 구구단 출력");
						//구구단 출력
						for(int i = 1; i < 10; i++) {
							System.out.println();
							for(int j = 1; j < 10; j++) {
								System.out.printf("%d * %d = %d \t", i ,j ,i*j);
							}
							System.out.println();
						}
						
					} else if (a == 2 ){
						System.out.println("2번 19단 출력");
						for(int i = 1; i < 20; i++) {
							System.out.println();
							for(int j = 1; j < 20; j++) {
								System.out.printf("%d * %d = %d \t", i ,j ,i*j);
							}
							System.out.println();
						}
					} else if (a == 3 ) {
//						System.out.println("1 ~ 1000까지 3의 배수 출력");  // while 문 사용
//						int z = 1;
//						while(z < 1000) {
//							if(z % 3 == 0) {
//								System.out.println(z);
//								
//							}
//							z++;
//						}
						System.out.println("1 ~ 1000까지 3의 배수 출력"); //for 문 및 continue 사용
						for(int m = 1; m < 1000; m++) {
							if(m % 3 != 0) {
							continue;
							}
							System.out.println(m);
							
						}
						
						
					}else if (a == 4) {
						//10개의 정수를 입력받아 그 수들중 짝수의 개수가 몇개인지 출력합니다
						Scanner ss = new Scanner(System.in);
						int h,k = 0;
						System.out.println("정수 10개를 입력하세요");
						for(int i = 0; i < 10; i++) {
							h = ss.nextInt();
							if( h <= 0) {
								continue;
							}
							else if (h % 2 == 0){
								k +=1 ;
							}
						}
						System.out.println("짝수의 개수는 " + k + " 개 입니다");
						
					}else if (a == 5 ) {
						System.out.println("프로그램을 종료합니다");
						break;
					}
					
				}while (true);
				
				
				sc.close(); // 메모리에서 스캐너를 제거 해야함 .
				
				
				
			}
	
}
