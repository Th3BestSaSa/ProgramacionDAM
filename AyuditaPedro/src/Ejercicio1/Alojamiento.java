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

		this.nombre = nombre; //Si tienes el método setNombre que hace lo mismo es más limpio usar el método
		//this.setNombre(nombre); Además es recomendable usar this. también con los métodos de la misma clase
		setNumeroDeEstrellas(numeroDeEstrellas);
		setPrecioPersonaNoche(precioPersonaNoche);
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
	//Uno de los 2 métodos sobra, hacen los dos lo mismo. Si el nombre del método es localidad, debería sobrar el de arriba
	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	@Override
	public String toString() {
		//Lo recomedable es usar los getter para los atributos (con this. delante)
		/**
		return "Alojamiento [nombreLocalidad=" + this.getNombreLocalidad() + ", nombre=" + this.getNombre() + ", numeroDeEstrellas="
				+ this.getNumeroEstrellas() + ", precioPersonaNoche=" + this.getprecioPersonaNoche + "]";
		 */
		return "Alojamiento [nombreLocalidad=" + nombreLocalidad + ", nombre=" + nombre + ", numeroDeEstrellas="
				+ numeroDeEstrellas + ", precioPersonaNoche=" + precioPersonaNoche + ", localidad()=" + localidad()
				+ "]";
	}
	
	

}
