package atm;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello welcome to the Cookie Security Trust Bank ATM.");
		
		Atm cookie = new Atm(0);
		
		System.out.println("Default pin is " + cookie.getPin());
		
		Atm.pinCheck();
		
		int userInput = 0;
		Scanner appInput = new Scanner(System.in);
		do {
			cookie.mainMenu();
			userInput = 0;
			userInput = appInput.nextInt();
			if (userInput == 1) {
				cookie.getBalance();
			}
			if (userInput == 2) {
				System.out.println("How much are you depositing?");
				int appDeposit = appInput.nextInt();
				cookie.deposit(appDeposit);
			}
			if (userInput == 3) {
				System.out.println("How much are you withdrawling?");
				int appWithdrawl = appInput.nextInt();
				cookie.withdrawl(appWithdrawl);
			}
			if (userInput == 4) {
				cookie.changePin();
			}
			if (userInput == 6) {
				cookie.eatACookie();
				System.exit(0);
			}
			
		} while ( cookie.getBalance() >= 0);
			System.out.println("Any day you don't get eaten...");
			System.out.println("by a cookie, is a good day.");
			appInput.close();
			
			
			
	}

}
