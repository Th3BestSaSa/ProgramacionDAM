package Ej1;

public class Rectangulo {
	public double altura = 1;
	public double ancho = 1;

	/**
	 * @param altura
	 * @param ancho
	 */
	public Rectangulo(int altura, int ancho) {
		super();
		this.setAltura(altura);
		this.setAncho(ancho);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {

		if (altura > 20 || altura < 0) {
			System.out.println("Error");
		} else {
			this.altura = altura;
		}

	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho > 20 || ancho < 0) {
			System.out.println("Error");
		} else {
			this.ancho = ancho;
		}

	}

	public double area() {
		double totalArea = ancho * altura;
		return totalArea;
	}

	public double perimetro() {
		double totalPerimetro = 2 * (ancho + altura);
		
		return totalPerimetro;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", ancho=" + ancho + "]";
	}

}
