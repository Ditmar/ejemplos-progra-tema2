import java.io.IOException;

import lector.Lector;
import lector.Test;

public class main {

	public static void main(String[] args) {
		Test t = new Test();
		t.setA("HOLA");
		t.getA();
		// TODO Auto-generated method stub
		String cad =  "TEST";
		
		System.out.println("HOLA MUNDO");
		Lector read = new Lector();
		
		System.out.println("Leer cadenas");
		try {
			String datos = read.readLine();
			System.out.println(datos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Leer Intereos");
		Integer number =  read.readInt();
		System.out.println("El número es " + number);

		System.out.println("Leer Double");
		Double doublenumber =  read.readDouble();
		System.out.println("El número es " + doublenumber);
		
	}

}
