package Ejercicio1;

public class Hotel extends Alojamiento {
	
	
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
	

	public int calcularPrecioBase(int precioPersonaNoche, int numeroDeEstrellas){
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

	private static void SaberCategoria(int numeroDeEstrellas, String servicioDeHabitaciones) {
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
