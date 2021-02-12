package account;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
	private Double balance;
	RegisterTransaction managementtransactions;
	public Account(Double balance) {
		this.balance = balance;
		
		this.managementtransactions = new RegisterTransaction();
	}
	//Ingresar datos
	public void addBalance(Double money) {
		/* carga de datos se necesitas registrar */
		StructTransaction data = new StructTransaction();
		data.setType("abono");
		data.setMoveMoney(money);
		String nowdate = LocalDate.now().toString() + LocalDate.now();
		data.setDate(nowdate);
		this.managementtransactions.registerTransaction(data);
		this.balance = this.balance + money;
	}
	public Boolean extracBalance(Double money) {
		if (this.balance >= money) {
			StructTransaction data = new StructTransaction();
			data.setType("debito");
			data.setMoveMoney(money);
			String nowdate = LocalDate.now().toString();
			data.setDate(nowdate);
			this.managementtransactions.registerTransaction(data);
			this.balance = this.balance - money;
			return true;
		}
		return false;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public ArrayList<StructTransaction> getTransactions() {
		return this.managementtransactions.getTransactions();
	}
	
}
