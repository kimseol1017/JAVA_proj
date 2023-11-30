package leb.chap17.account;

import java.util.List;
import java.util.Scanner;

//계좌 거래를 처리하는 클래스
class AccountTest {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // 계좌 생성
     System.out.print("계좌 번호를 입력하세요: ");
     String accountNumber = scanner.nextLine();

     System.out.print("초기 잔고를 입력하세요: ");
     double initialBalance = scanner.nextDouble();

     Account account = new Account(accountNumber, initialBalance);

     // 거래 처리
     while (true) {
         System.out.println("\n1. 입금");
         System.out.println("2. 출금");
         System.out.println("3. 종료");
         System.out.print("원하시는 거래를 선택하세요 (1, 2, 3): ");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("입금할 금액을 입력하세요: ");
                 double depositAmount = scanner.nextDouble();
                 account.deposit(depositAmount);
                 break;

             case 2:
                 System.out.print("출금할 금액을 입력하세요: ");
                 double withdrawAmount = scanner.nextDouble();
                 account.withdraw(withdrawAmount);
                 break;

             case 3:
                 System.out.println("거래를 종료합니다. 현재 잔고: " + account.getBalance() + "원");
                 System.exit(0);

             default:
                 System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
         }
     }
 }
}
