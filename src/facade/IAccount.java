package facade;

import java.math.BigDecimal;

public interface IAccount {
	public int getAccountID();
	public boolean transfer(IAccount account, BigDecimal total);
	public boolean receiveTransfer(BigDecimal total);
	public String getBalance();

}
