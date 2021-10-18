package ListPackage;

import java.util.List;
import java.util.ArrayList;

public class Account {
	private long id;
	private String accountType;
	
	public Account() {}
	
	public Account(long id, String accountType) {
		this.id = id;
		this.accountType = accountType;
	}
	
	public long getID() {
		return this.id;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setID(long ID) {
		this.id = ID;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public static List<Account> createAccounts(int numAccounts) {
		
		List<Account> accounts = new ArrayList<>();
		
		for (int i = 0; i < numAccounts; i++) {
			
			if(Math.random()> .5)
				accounts.add(new Account(i, "checking"));
			else
				accounts.add(new Account(i, "savings"));
		}
		
		return accounts;
	}
	
	@Override
	public String toString() {
		return ("Account ID: " + this.getID() + "\nAccount Type: " + this.getAccountType() + "\n");
	}
}
