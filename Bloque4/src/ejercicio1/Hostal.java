package ejercicio1;

public class Hostal extends Alojamiento{
	
	private static final int PRECIO_MINIMO=15;
	private static final int PORCENTAJE_DIFERENCIA=17;
	private int estrellas;
	private TipoSituacion situacion;

	public Hostal(String nombre, int numeroDeEstrellas, int precioPersonaNoche,String localidad,TipoSituacion situacion) throws AlojamientoException {
		super(nombre, numeroDeEstrellas, precioPersonaNoche, localidad);
		setNumeroDeEstrellas(numeroDeEstrellas);
		setSituacion(situacion);
	}
	
	
	//Le asignamos un precio que no puede ser inferior al precio mínimo
	public void setPrecioPersonaNoche(int precioPersonaNoche) throws AlojamientoException {
		if (precioPersonaNoche < PRECIO_MINIMO) {
			throw new AlojamientoException("Precio incorrecto");
		}
		super.setPrecioPersonaNoche(precioPersonaNoche);
	}
	
	//Nos aseguramos que el precio no difiere el tanto porciento del precio inicial
	public void modificarPrecio(int nuevoPrecio) throws AlojamientoException {
		int precioInicial=this.getPrecioPersonaNoche();
		double porcentaje=PORCENTAJE_DIFERENCIA/100;
		if(nuevoPrecio<(precioInicial*(1-porcentaje))||nuevoPrecio>(precioInicial*(1+porcentaje))) {
			throw new AlojamientoException("El nuevo precio no puede diferir más de un "+PORCENTAJE_DIFERENCIA+" porciento del anterior");
		}
		super.setPrecioPersonaNoche(nuevoPrecio);
	}
	

	public int getEstrellas() {
		return estrellas;
	}

	public void setNumeroDeEstrellas(int numeroDeEstrellas) throws AlojamientoException {
		if(estrellas>3||estrellas<1) {
			throw new AlojamientoException("El número de estrellas debe estar entre 1 y 3");
		}
		this.estrellas = numeroDeEstrellas;
	}

	public TipoSituacion getSituacion() {
		return situacion;
	}

	public void setSituacion(TipoSituacion situacion) {
		this.situacion = situacion;
	}

	@Override
	public String toString() {
		return "HOSTAL "+super.toString()+" SITUACION "+getSituacion();
	}

	@Override
	public int compareTo(Alojamiento o) {
		int posicion;
		if(this.getPrecioPersonaNoche()>o.getPrecioPersonaNoche()) {
			posicion=1;
		}else if(this.getPrecioPersonaNoche()<o.getPrecioPersonaNoche()) {
			posicion=-1;
		}else {
			posicion=0;
		}
		return posicion;
	}
	
	


}
