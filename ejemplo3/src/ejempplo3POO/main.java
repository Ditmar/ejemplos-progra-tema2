package ejempplo3POO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.prueba("HOLA MUNDO");
		Integer[] params = {3, 4, 5, 6, 6};
		String cad = test.prueba("HOLA MUNDO", params);
		 cad = test.prueba("HOLA MUNDO", 1,2, 34 ,4 );
		System.out.print(cad);
	}

}
