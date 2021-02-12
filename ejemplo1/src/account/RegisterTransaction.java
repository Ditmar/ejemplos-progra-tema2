package account;

import java.util.ArrayList;
import java.util.Arrays;

public class RegisterTransaction {
	ArrayList<StructTransaction> transactions;
	
	public RegisterTransaction() 
	{
		transactions = new ArrayList<>();
	}
	public void registerTransaction(StructTransaction data) {
		this.transactions.add(data);
	}
	public ArrayList<StructTransaction> getTransactions() {
		return this.transactions;
	}
}
