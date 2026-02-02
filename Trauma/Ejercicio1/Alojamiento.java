package Ejercicio1;

public abstract class Alojamiento implements Localizable {

	private static final int NUMERO_ESTRELLAS_MAXIMO = 5;
	private static final int NUMERO_ESTRELLAS_MINIMO = 1;
	private String nombreLocalidad;
	private String nombre;
	private static int numeroDeEstrellas;
	private static int precioPersonaNoche;

	public Alojamiento(String nombre, int numeroDeEstrellas, int precioPersonaNoche, String nombreLocalidad)
			throws AlojamientoException {

		this.setNombre(nombre);
		this.setNumeroDeEstrellas(numeroDeEstrellas);
		this.setPrecioPersonaNoche(precioPersonaNoche);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeEstrellas() {
		return numeroDeEstrellas;
	}

	public void setNumeroDeEstrellas(int numeroDeEstrellas) throws AlojamientoException {
		if (numeroDeEstrellas < NUMERO_ESTRELLAS_MINIMO || numeroDeEstrellas > NUMERO_ESTRELLAS_MAXIMO) {
			throw new AlojamientoException("Numero de estrellas incorrecto");
		}
		this.numeroDeEstrellas = numeroDeEstrellas;
	}

	public int getPrecioPersonaNoche() {
		return precioPersonaNoche;
	}

	public void setPrecioPersonaNoche(int precioPersonaNoche) throws AlojamientoException {
		if (precioPersonaNoche <= 0) {
			throw new AlojamientoException("Precio incorrecto");
		}
		this.precioPersonaNoche = precioPersonaNoche;
	}

	public String localidad() {
		return nombreLocalidad;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	@Override
	public String toString() {
		return "Alojamiento [nombreLocalidad=" + nombreLocalidad + ", nombre=" + nombre + ", numeroDeEstrellas="
				+ numeroDeEstrellas + ", precioPersonaNoche=" + precioPersonaNoche + ", localidad()=" + localidad()
				+ "]";
	}
	
	

}
