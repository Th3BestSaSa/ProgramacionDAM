package ejercicio1;

public class Hotel extends Alojamiento{
	
	public static final int BAJA=24;
	public static final int MEDIA=30;
	public static final int ALTA=42;
	public static final int LUJO=50;
	private boolean servicioHabitaciones;
	private TipoCategoria categoria;
	private int estrellas;

	public Hotel(String nombre, int numeroDeEstrellas, int precioPersonaNoche,String localidad,
			boolean servicioHabitaciones,TipoCategoria categoria) throws AlojamientoException {
		super(nombre, numeroDeEstrellas, precioPersonaNoche, localidad);
		setServicioHabitaciones(servicioHabitaciones);
		setNumeroDeEstrellas(numeroDeEstrellas);
		setCategoria();
	}

	public boolean isServicioHabitaciones() {
		return servicioHabitaciones;
	}

	public void setServicioHabitaciones(boolean servicioHabitaciones) {
		this.servicioHabitaciones = servicioHabitaciones;
	}

	public void setNumeroDeEstrellas(int numeroDeEstrellas) throws AlojamientoException {
		if(numeroDeEstrellas>5||numeroDeEstrellas<3) {
			throw new AlojamientoException("El número de estrellas debe estar entre 3 y 5");
		}
		this.estrellas=numeroDeEstrellas;
	}
	
	public TipoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if(servicioHabitaciones) {
			if(estrellas==3) {
				categoria=TipoCategoria.MEDIA;
			}else if(estrellas==4){
				categoria=TipoCategoria.ALTA;
			}else {
				categoria=TipoCategoria.LUJO;
			}
		}else{
			if(estrellas==3) {
				categoria=TipoCategoria.BAJA;
			}else if(estrellas==4){
				categoria=TipoCategoria.MEDIA;
			}else {
				categoria=TipoCategoria.ALTA;
			}
		}
	}
	//Le asignamos un precio que no puede ser inferior al de su categoria
	public void setPrecioPersonaNoche(int precioPersonaNoche) throws AlojamientoException {
		if(this.categoria.equals(TipoCategoria.valueOf("BAJA"))) {
			if(precioPersonaNoche<BAJA) {
				throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
			}
		}else {
			if(this.categoria.equals(TipoCategoria.valueOf("MEDIA"))) {
				if(precioPersonaNoche<MEDIA) {
					throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
				}
			}else {
				if(this.categoria.equals(TipoCategoria.valueOf("MEDIA"))) {
					if(precioPersonaNoche<ALTA) {
						throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
					}
				}else {
					if(precioPersonaNoche<LUJO) {
						throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
					}
				}
			}
		}
		super.setPrecioPersonaNoche(precioPersonaNoche);
	}
	//Nos aseguramos que el al cambiar el precio no sea inferior al de la categoria
	public void modificarPrecio(int nuevoPrecio) throws AlojamientoException {
		if(this.categoria.equals(TipoCategoria.valueOf("BAJA"))) {
			if(nuevoPrecio<BAJA) {
				throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
			}
		}else {
			if(this.categoria.equals(TipoCategoria.valueOf("MEDIA"))) {
				if(nuevoPrecio<MEDIA) {
					throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
				}
			}else {
				if(this.categoria.equals(TipoCategoria.valueOf("MEDIA"))) {
					if(nuevoPrecio<ALTA) {
						throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
					}
				}else {
					if(nuevoPrecio<LUJO) {
						throw new AlojamientoException("El precio no puede ser inferior al de la categoría");
					}
				}
			}
		}
		super.setPrecioPersonaNoche(nuevoPrecio);
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder(" CATEGORIA "+getCategoria());
		if(servicioHabitaciones) {
			sb.append(" CON SERVICIO DE HABITACIONES");
		}else {
			sb.append(" SIN SERVICIO DE HABITACIONES");
		}
		return "HOTEL "+ super.toString()+sb.toString();
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
