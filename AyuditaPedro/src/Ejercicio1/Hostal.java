package Ejercicio1;

public class Hostal extends Alojamiento {
	
	public static String servicioDeHabitaciones;//Para campos de Si/No es mejor usar Boolean (true/false)
	//public static Boolean servicioDeHabitaciones;
	private static final int NUMERO_ESTRELLAS_MAXIMO = 3;
	private static final int NUMERO_ESTRELLAS_MINIMO = 1;
	public static int precioHostalBase=15;
	public static TSituacion situacion;
	public static TCategoria categoria;
	private String nombreLocalidad;
	
	public Hostal(String nombre, int numeroDeEstrellas, int precioPersonaNoche, String nombreLocalidad)
			throws AlojamientoException {
		super(nombre, numeroDeEstrellas, precioPersonaNoche, nombreLocalidad);
		//Aquí tienes que llamar al setPrecioHostalBase
		//Aquí puede llamarse al cálculo de la categoría
		//Puedes llamar a los métodos siempre y cuando hayas puesto antes el método super
	}
	
	public static int getPrecioHostalBase() {
		return precioHostalBase;
	}

	public static void setPrecioHostalBase(int precioHostalBase) throws AlojamientoException {
		if (precioHostalBase> precioHostalBase+ (precioHostalBase*0.17)) {
			throw new AlojamientoException("El precio es superior a lo permitido ");
		}
		Hostal.precioHostalBase = precioHostalBase;
	}


	public static TSituacion getSituacion() {
		return situacion;
	}

	public static void setSituacion(TSituacion situacion) {
		Hostal.situacion = situacion;
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
		Hostal.categoria = categoria;
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
		return "Hostal [nombreLocalidad=" + nombreLocalidad + ", getNombre()=" + getNombre()
				+ ", getNumeroDeEstrellas()=" + getNumeroDeEstrellas() + ", getPrecioPersonaNoche()="
				+ getPrecioPersonaNoche() + ", localidad()=" + localidad() + ", getNombreLocalidad()="
				+ getNombreLocalidad() + "]";
	}

	
	
	

	
	
}
