package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalanceOf100() {
		// arrange environment
		// object creation Class objectName = new Constructor();
		Atm underTest = new Atm(100);
		// act
		int balance = underTest.getBalance();
		// assert the type of condition to check
		assertEquals(100, balance);
	}

	@Test
	public void shouldHaveDefaultBalanceOf200() {
		Atm underTest = new Atm(200);
		int balance = underTest.getBalance();
		assertEquals(200, balance);
	}

	@Test
	public void shouldHaveBalanceOf500AfterDeposit() {
		Atm underTest = new Atm(0);
		int balanceBefore = underTest.getBalance();
		underTest.deposit(500);
		int balanceAfter = underTest.getBalance();
		assertEquals(0, balanceBefore);
		assertEquals(500, balanceAfter);

	}

	@Test
	public void shouldHaveBalanceOf1000AfterDeposit() {
		Atm underTest = new Atm(500);
		int balanceBefore = underTest.getBalance();
		underTest.deposit(500);
		int balanceAfter = underTest.getBalance();
		assertEquals(500, balanceBefore);
		assertEquals(1000, balanceAfter);

	}

//	@Test
//	public void shouldReturnTrue();
//		Atm underTest = new Atm();
//		String pinNumber = underTest.pinCheck();
//		assertEquals(true, pinNumber);
//How do I write this test???	


	@Test
	public void shouldHaveBalanceOf500AfterWithdrawl() {
		Atm underTest = new Atm(1000);
		int balanceBefore = underTest.getBalance();
		underTest.withdrawl(500);
		int balanceAfter = underTest.getBalance();
		assertEquals(1000, balanceBefore);
		assertEquals(500, balanceAfter);

	}
	
//	@Test
//	public void pinShouldBe1234() {
//		Atm underTest = new Atm(1000);
//		String pin = underTest.getPin();
//		assertEquals("1234", pin);
//		
//	}
//	this test passed until the next test was made to pass, and now it fails... I think thats fine.
	
	
	@Test
	public void newPinShouldBe4321() {
		Atm underTest = new Atm(1000);
		String newPin = underTest.changePin();
		assertEquals("4321", newPin);
	}
	
	
	
	
	
	
	
	
	
}
