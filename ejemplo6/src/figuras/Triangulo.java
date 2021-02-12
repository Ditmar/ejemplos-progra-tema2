package figuras;

public class Triangulo extends Figura {
	Double superficie = 0.0;
	Double base = 10.0;
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSuperficie(Double superficie) {
		// TODO Auto-generated method stub
		superficie = superficie * base / 2;
	}

	@Override
	public Double getSuperficie() {
		// TODO Auto-generated method stub
		return this.superficie;
	}

}
