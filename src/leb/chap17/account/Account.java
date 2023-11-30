package leb.chap17.account;

//계좌 정보를 저장하는 클래스
class Account {
 private String accountNumber;
 private double balance;

 // 생성자
 public Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // 게터 메소드
 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 // 입금 메소드
 public void deposit(double amount) {
     balance += amount;
     System.out.println(amount + "원이 입금되었습니다. 현재 잔고: " + balance + "원");
 }

 // 출금 메소드
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println(amount + "원이 출금되었습니다. 현재 잔고: " + balance + "원");
     } else {
         System.out.println("잔고가 부족합니다. 현재 잔고: " + balance + "원");
     }
 }
}
