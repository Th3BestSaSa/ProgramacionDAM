package Ejercicio1;

public class Hotel extends Alojamiento {
	//Habría que definir como constantes el precio mínimo por noche por categoría
	
	private static final int NUMERO_ESTRELLAS_MAXIMO = 5;
	private static final int NUMERO_ESTRELLAS_MINIMO = 3;
	public static TSituacion situacion;
	public static TCategoria categoria;
	public static String servicioDeHabitaciones;
	
	
	public Hotel(String nombre, int numeroDeEstrellas, int precioPersonaNoche, String nombreLocalidad)
			throws AlojamientoException {
		super(nombre, numeroDeEstrellas, precioPersonaNoche, nombreLocalidad);
		// TODO Auto-generated constructor stub
	}
	
	//No es necesario pasar parámetros, tienes los campos guardados en la propia instancia
	public int calcularPrecioBase(int precioPersonaNoche, int numeroDeEstrellas){
		/**
		 * Mirando el precio base mínimo, habría que controlar que el precio no esté por debajo:
		 * categoria = getCategoria();
		 * int precioMinimo = 0;
		 * switch(categoria){
		 * 	case TCategoria.BAJA:
		 *  precioMinimo = PRECIO_MIN_BAJA
		 *  break;
		 * 	case TCategoria.MEDIA:
		 *  precioMinimo = PRECIO_MIN_MEDIA
		 *  break;
		 * 	case TCategoria.ALTA:
		 *  precioMinimo = PRECIO_MIN_ALTA
		 *  break;
		 * 	case TCategoria.LUJO:
		 *  precioMinimo = PRECIO_MIN_LUJO
		 *  break;
		 * }
		 * 
		 * if(precioMinimo > precioPersonaNoche){
		 * 	throw new Exception...
		 * } else {
		 * 	this.setPrecioPersonaNoche(precioPersonaNoche);
		 * }
		 */
		

		switch (numeroDeEstrellas) {
		case 3:
			precioPersonaNoche=30;
			break;
		case 4:
			precioPersonaNoche=42;
			break;
		case 5:
			precioPersonaNoche=50;
			break;
		default:
			break;
		}
		return precioPersonaNoche;
		
	}
	public static TSituacion getSituacion() {
		return situacion;
	}

	public static void setSituacion(TSituacion situacion) {
		Hotel.situacion = situacion;
	}

	public static TCategoria getCategoria(int numeroDeEstrellas, String servicioDeHabitaciones) {
		SaberCategoria(numeroDeEstrellas, servicioDeHabitaciones);
		return categoria;
	}

	//Los nombres de los métodos suelen llevar la primera letra en minúscula. Como este método va a poner el valor de un campo
	//calculado que nunca debe editarse, se podría llamar directamente setCategoria
	//Además, no hay que pasar ningún parámetro, vale con hacer this.getNumeroEstrellas y this.getServicioDeHabitaciones
	private static void SaberCategoria(int numeroDeEstrellas, String servicioDeHabitaciones) {
		/**
		 * Con servicioDeHabitaciones como boolean:
		 * if(!servicioDeHabitaciones && numeroDeEstrellas == 3){
		 *	categoria=TCategoria.BAJA;
		 * } else if(!servicioDeHabitaciones && numeroDeEstrellas == 4 ||
		 * 			  servicioDeHabitaciones && numeroDeEstrellas == 3){
		 *	categoria=TCategoria.MEDIA;
		 * } else if(!servicioDeHabitaciones && numeroDeEstrellas == 5 ||
		 * 			  servicioDeHabitaciones && numeroDeEstrellas == 4) {
		 *	categoria=TCategoria.ALTA;
		 * } else {
		 *	categoria=TCategoria.LUJO;
		 * }
		 * 
		 */
		if (servicioDeHabitaciones.equals("Si") && numeroDeEstrellas==3) {
			categoria=TCategoria.MEDIA;
		}
		if (servicioDeHabitaciones.equals("Si") && numeroDeEstrellas==4) {
			categoria=TCategoria.ALTA;
		}
		if (servicioDeHabitaciones.equals("Si") && numeroDeEstrellas==5) {
			categoria=TCategoria.LUJO;
		}
		if (servicioDeHabitaciones.equals("No") && numeroDeEstrellas==3) {
			categoria=TCategoria.BAJA;
		}
		if (servicioDeHabitaciones.equals("No") && numeroDeEstrellas==4) {
			categoria=TCategoria.MEDIA;
		}
		if (servicioDeHabitaciones.equals("No") && numeroDeEstrellas==5) {
			categoria=TCategoria.ALTA;
		}
	}

	public static void setCategoria(TCategoria categoria) {
		Hotel.categoria = categoria;
	}
	public static String getServicioDeHabitaciones() {
		
		return servicioDeHabitaciones;
	}

	public static void setServicioDeHabitaciones(String servicioDeHabitaciones) {
		servicioDeHabitaciones = servicioDeHabitaciones;
		//Cada vez que se actualice, hay que volver a calcular la categoría, también cuando cambie el número de estrellas
		// (faltan los getters y setters)
	}
	public TSituacion tipoSituacion (TSituacion situacion){
		return situacion;
		
	}

	@Override
	public void getLocalidad() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setLocalidad() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Hotel [getNombre()=" + getNombre() + ", getNumeroDeEstrellas()=" + getNumeroDeEstrellas()
				+ ", getPrecioPersonaNoche()=" + getPrecioPersonaNoche() + ", localidad()=" + localidad()
				+ ", getNombreLocalidad()=" + getNombreLocalidad() + "]";
	}

	



	



	
}
