package quiz05;

public class Account {
	
	String name;
	String password;
	int balance;
	
	Account() {
		
	}
	
	Account(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}
	
	// 입금 - 매개변수로 입력받은 값을 멤버 변수로 누적
	void deposit(int money) {
		balance += money;
	}
	
	// 출금
	void withDraw(int money) {
		balance -= money;
	}
	
	// 잔액 조회
	int getBalance() {
		return balance; // 클래스 외부에서 값을 가져갈 수 있음 
	}

}
