package ejemplo7;

import figura.Circulo;
import figura.Figura;
import figura.Triangulo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(10.0);
		Triangulo triangulo = new Triangulo(2.3, 4.5);
		/*circulo.imprimir();
		triangulo.imprimir();*/
		printdata(circulo);
		printdata(triangulo);
				
	}
	public static void printdata(Figura  figura) {
		figura.imprimir();
		System.out.println(figura.getRadio());
	}

}
