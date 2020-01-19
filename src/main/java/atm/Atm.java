package atm;

import java.util.Scanner;

public class Atm {

	private int balance;
	private static String pin = "1234";
	
	public Atm(int balance) {
		this.balance = balance;
		//^ "this." makes the class's variable balance become the current method's iteration of balance. 
	}

	public int getBalance() {
		System.out.println(this.balance);
		return balance;
	}

	public void deposit(int depositAmount) {
		balance = balance + depositAmount;
		
	}

	public static void pinCheck() {
		Scanner input = new Scanner(System.in);
		String pinTest;
		do {
			System.out.println("Please enter pin.");
			pinTest = input.next();
			if (pinTest.contains(pin)) {
			System.out.println("Access granted.");
			break;
			} 
			else {
				System.out.println("Incorrect pin.");
				continue;
			}
		} while (pinTest != pin);
		input.close();	
	}

	public String getPin() {
		return pin;
	}

	public String changePin() {
		Scanner input = new Scanner(System.in);
		String pinTest;
		do {
			System.out.println("Please enter old pin.");
			pinTest = input.next();
			if (pinTest.contains(pin)) {
			System.out.println("Access granted.");
			break;
			} 
			else {
				System.out.println("Incorrect pin.");
				continue;
			}
		} while (pinTest != pin);
		System.out.println("Please enter new pin.");
		String newPin = input.next();
		input.close();
		pin = newPin;
		return newPin;
	} //To improve security program an attempt count that will lock the system if enough failed attempts happen.

	public void withdrawl(int withdrawlAmount) {
		balance = balance - withdrawlAmount;
		
	}
	
	
	public void mainMenu() {
		System.out.println("What would you like to do?");
		System.out.println("Enter coorisponding number.");
		System.out.println(" 1. Check Balance");
		System.out.println(" 2. Make Deposit");
		System.out.println(" 3. Make Withdrawl");
		System.out.println(" 4. Change Pin");
		System.out.println(" 5. Exit");
		System.out.println(" 6. Eat a cookie");
	}
	
	public void eatACookie() throws InterruptedException {
		System.out.println("You eat a cookie you only dreamed could be real...");
		Thread.sleep(1000);
		System.out.println("Wait...");
		Thread.sleep(1500);
		System.out.println("No...");
		Thread.sleep(3000);
		System.out.println("THE COOKIE EATS YOU!");
		System.out.println("     ********    ");
		System.out.println("    ** 0  0 **   ");
		System.out.println("   **   oo   **  ");
		System.out.println("  ** vvvvvvvv ** ");
		System.out.println("  **          ** ");
		System.out.println("   ** ^^^^^^ **  ");
		System.out.println("    **      **   ");
		System.out.println("     ********    ");
		
	}
	
	
	
	
	
	
	

}
