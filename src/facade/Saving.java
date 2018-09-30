package facade;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class Saving implements IAccount {

	
	private BigDecimal balance;
	private int accountID;

	
	public Saving(BigDecimal balance) {
		this.balance = balance;
		this.accountID = -1;
	}

	@Override
	public int getAccountID() {
		if( this.accountID == -1) {
			this.accountID = ThreadLocalRandom.current().nextInt(0, 100001);
		}
		return this.accountID;
	}

	@Override
	public boolean transfer(IAccount toAccount, BigDecimal total) {
		if(this.balance.compareTo(total) == 1) {
			this.balance = this.balance.subtract(total);
			toAccount.receiveTransfer(total);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean receiveTransfer(BigDecimal total) {
		this.balance = this.balance.add(total);
		return false;
	}
	
	@Override
	public String getBalance() {
		return this.balance.toString();
	}
}
