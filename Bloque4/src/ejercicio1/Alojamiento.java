package ejercicio1;

public abstract class Alojamiento implements Localizable,Comparable<Alojamiento>{

	private static final int NUMERO_ESTRELLAS_MAXIMO = 5;
	private static final int NUMERO_ESTRELLAS_MINIMO = 1;
	
	private String nombre;
	private int numeroDeEstrellas;
	private int precioPersonaNoche;
	private String localidad;
	
	public Alojamiento(String nombre, int numeroDeEstrellas, int precioPersonaNoche,String localidad) throws AlojamientoException {
		
		this.nombre = nombre;
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
		if ( numeroDeEstrellas < NUMERO_ESTRELLAS_MINIMO || numeroDeEstrellas > NUMERO_ESTRELLAS_MAXIMO ) {
			throw new AlojamientoException("Numero de estrellas incorrecto");
		}
		this.numeroDeEstrellas = numeroDeEstrellas;
	}

	public int getPrecioPersonaNoche() {
		return precioPersonaNoche;
	}

	public void setPrecioPersonaNoche(int precioPersonaNoche) throws AlojamientoException {
		if (precioPersonaNoche <=0) {
			throw new AlojamientoException("Precio incorrecto");
		}
		this.precioPersonaNoche = precioPersonaNoche;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "NOMBRE: " + nombre +" LOCALIDAD" + localidad + " PRECIO POR PERSONA Y NOCHE: "
				+ precioPersonaNoche + "EUROS ESTRELLAS: " + numeroDeEstrellas ;
	}
	
	
	
	
	
	
	
}
