package coches;

public class Coche {
	
	private final String maricula;
	private final String modelo;
	private final String marca;
	public Coche(String maricula, String modelo, String marca) {
		super();
		this.maricula = maricula;
		this.modelo = modelo;
		this.marca = marca;
	}
	/**
	 * @return the maricula
	 */
	public String getMaricula() {
		return maricula;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	
}
