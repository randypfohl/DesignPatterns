package facade;

import java.math.BigDecimal;
import java.util.HashMap;


//this bank service will represent the facade and will hide both the account interface and underlying complexity from the rest of the system. 
public class BankService {

	private HashMap<Integer, IAccount> accounts;
	
	public BankService() {
		this.accounts = new HashMap<Integer, IAccount>();
	}
	
	public int createNewAccount(String type, BigDecimal amount) {
		IAccount account = null;
		switch(type) {
		case "saving":
			account = new Saving(amount);
			break;
		case "checking":
			account = new Checking(amount);
			break;
		case "investment":
			account = new Investment(amount);
			break;
		default:
			break;
		}
		
		if(account != null) {
			int id = account.getAccountID();
			this.accounts.put(id, account);
			return id;
		}
		
		return -1;
	}
	
	
	public boolean transferFunds(int fromAccountID, int toAccountID, BigDecimal total) {
		if(this.accounts.containsKey(fromAccountID) && this.accounts.containsKey(toAccountID)) {
			IAccount from = this.accounts.get(fromAccountID);
			IAccount to = this.accounts.get(toAccountID);
			return from.transfer(to, total);
		}
		else {
			return false;
		}
	}
	
	public String getBalance(int id) {
		if(this.accounts.containsKey(id)) {
			return this.accounts.get(id).getBalance();
		}
		else return "";
	}
	
	
}
