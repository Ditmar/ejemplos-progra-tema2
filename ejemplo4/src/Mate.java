
public class Mate {
	public Mate() {
		
	}
	public Double sumar(Double a, Double b) {
		return a + b;
	}
	public Double restar(Double a, Double b) {
		return a - b;
	}
	public Double multiplicar(Double a, Double b) {
		return a * b;
	}
	public Vector sumar(Vector a, Vector b) {
		Vector r = new Vector();
		r.setX(a.getX() + b.getX());
		r.setY(a.getY() + b.getY());
		return r;
	};
	public Vector restar(Vector a, Vector b) {
		Vector r = new Vector();
		r.setX(a.getX() - b.getX());
		r.setY(a.getY() - b.getY());
		return r;
	};
	public Vector restar(Vector a, Double r) {
		Vector result = new Vector();
		
		result.setX(a.getX() * r);
		result.setY(a.getY() * r);
		return result;
	};
	
}
