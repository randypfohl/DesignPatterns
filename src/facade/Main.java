package facade;

import java.math.BigDecimal;

public class Main{
	
	// the main class represents any portion of the main system that will need to access the bank service and should only see what we want you to see. aka hiding complexity.
	public static void main(String[] args) {
		
		BankService bank = new BankService();
		
		int checking = bank.createNewAccount("checking", new BigDecimal("15000"));
		int saving = bank.createNewAccount("saving", new BigDecimal("5000"));
		int investment = bank.createNewAccount("investment", new BigDecimal("150000"));

		bank.transferFunds(checking, saving, new BigDecimal("10000.25"));
		System.out.println(bank.getBalance(checking));
		System.out.println(bank.getBalance(saving));
		
		bank.transferFunds(investment, saving, new BigDecimal("100000"));
		System.out.println(bank.getBalance(investment));
		System.out.println(bank.getBalance(saving));
		
		bank.transferFunds(investment, saving, new BigDecimal("100000"));
		System.out.println(bank.getBalance(investment));
		System.out.println(bank.getBalance(saving));
		
	}

}
