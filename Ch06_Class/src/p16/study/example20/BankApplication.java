package p16.study.example20;

import java.util.Scanner;

public class BankApplication {
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int i;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("1~5까지만 입력해주세요");
			}

		}
		System.out.println("프로그램 종료");
	}

//계좌생성하기
	private static void createAccount() {
		String ano = null;
		String owner = null;
		int balance = 0;

		System.out.println("---------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------");

		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.println("초기입금액: ");
		balance = scanner.nextInt();

		accountArray[i] = new Account(ano, owner, balance);
		i++;
	}

//계좌목록보기	
	private static void accountList() {
		System.out.println("---------------------------");
		System.out.println("계좌목록");
		System.out.println("---------------------------");

		if (i == 0) {
			System.out.println("계좌가없습니다.");
		} else if (i > 0) {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] != null) {

					System.out.println(accountArray[i].getAno() + "   " + accountArray[i].getOwner() + "   "
							+ accountArray[i].getBalance());
				}
			}

		}

	}

//예금하기	
	private static void deposit() {
		String checkano = null;
		int upbalance = 0;
		Account search = null;
		System.out.println("---------------------------");
		System.out.println("예금");
		System.out.println("---------------------------");

		System.out.print("계좌번호: ");
		checkano = scanner.next();

		System.out.print("예금액: ");
		upbalance = scanner.nextInt();

		search = findAccount(checkano);

		if (search != null) {// 계좌번호가 있는 것을 확인한 경우에는 예금액을 업데이트 시켜야함.
			search.setBalance(search.getBalance() + upbalance);
			System.out.println("결과 : 예금이 성공하였습니다");
			System.out.println("현재 잔고 = " + search.getBalance());
		} else {
			System.out.println("계좌번호를 확인해주세요");
		}
	}

//출금하기	
	private static void withdraw() {
		String checkano = null;
		int downbalance = 0;
		Account search = null;

		System.out.println("---------------------------");
		System.out.println("출금");
		System.out.println("---------------------------");

		System.out.print("계좌번호: ");
		checkano = scanner.next();

		System.out.println("출금액: ");
		downbalance = scanner.nextInt();

		search = findAccount(checkano);
		if (search == null) {
			System.out.println("계좌번호를 다시 입력하세요");
		} else if (search.getBalance() < downbalance) {
			System.out.println("출금액이 잔고보다 더 큽니다.");
		} else {
			search.setBalance(search.getBalance() - downbalance);
			System.out.println("결과 : 출금이 성공하였습니다");
			System.out.println("현재 잔고 = " + search.getBalance());
		}

	}

	// Account배열에서 ano와 동일한 Account객체 찾기
	private static Account findAccount(String ano) {

		for (Account acc : accountArray) {
			if (acc == null) {
				return null;
			}
			if (acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
}
