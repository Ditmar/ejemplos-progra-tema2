package figura;

public class Circulo extends Figura{
	private Double radio;
	public Circulo(Double r) {
		this.radio = r;
	}
	public void imprimir () {
		System.out.println("Radio del circulo "  + radio);
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
}
