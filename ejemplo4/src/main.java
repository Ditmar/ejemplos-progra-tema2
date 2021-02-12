
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mate test = new Mate();
		System.out.println(test.sumar(10.0, 15.0));
		
		Vector r = test.restar(new Vector(10.0, 15.7), new Vector(-4.7, 10.78));
		System.out.println("X= " + r.getX() + " " + "Y = " + r.getY() );
	}

}
