package ejmeplo1POO;

import java.util.ArrayList;
import java.util.Scanner;

import account.LimitAccount;
import account.StructTransaction;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Integer option = -1;
		LimitAccount account = new LimitAccount(0.0);
		do {
		  System.out.println("1.-) Crear Cuenta Limitada");
		  System.out.println("2.-) Agregar Dinero");
		  System.out.println("3.-) Extraer Dinero");
		  System.out.println("4.-) Mostrar saldo");
		  System.out.println("5.-) Ver extracto Histórico");
		  System.out.println("6.-) Salir");
		  option = Integer.parseInt(read.nextLine()) ;	
		  switch(option) {
			  case 1: {
				  System.out.println("Cuanto saldo desea agregar");
				  Double balance = Double.parseDouble(read.nextLine()) ;	
				  account.setBalance(balance);
				  account.settingLimit();
				  break;
			  }
			  case 2: {
				  System.out.print("Cuanto dinero desea agregrar a la cuenta");
				  Double money = Double.parseDouble(read.nextLine()) ;
				  account.addBalance(money);
				  account.settingLimit();
				  break;
			  }
			  case 3: {
				  Double limit = account.getLimit();
				  System.out.print("Su limite posible es de " + limit);
				  Double money = Double.parseDouble(read.nextLine()) ;
				  if (account.extracBalance(money)) {
					  System.out.print("transacción exitosa ");
					  account.settingLimit();
				  } else {
					  System.out.println("Supero el limite de la cuenta ");
					  System.out.println(money + ">" + limit);
				  };
				  
				  break;
			  }
			  case 4: {
				  System.out.println("Su saldo es de " + account.getBalance() + " Bs.");
				  break;
			  }
			  case 5: {
				  ArrayList<StructTransaction> list =  account.getTransactions();
				  for (int i = list.size() -1 ; i >= 0; i--) {
					  System.out.println("Typo " + list.get(i).getType() + " Fecha " + list.get(i).getDate() + "  " + list.get(i).getMoveMoney());
				  }
				  break;
			  }
		  }
		} while(option != 6);
		System.out.print("TERMINO!");
	}

}