package Ejercicio2;
import java.time.LocalTime;

public class Trayecto {

	private static final int MAXIMO_NUMERO_ESTACIONES = 50;
	private Estacion[] trayecto;
	private int numeroRealDeEstaciones;
	
	public Trayecto ( ) {
		trayecto=new Estacion[MAXIMO_NUMERO_ESTACIONES];
		numeroRealDeEstaciones=0;
	}
	
	public void annadirEstacion(Estacion nuevaEstacion) throws TrayectoException {
		if ( numeroRealDeEstaciones==MAXIMO_NUMERO_ESTACIONES) {
			throw new TrayectoException("No se pueden añadir más estaciones");
		}
		trayecto[numeroRealDeEstaciones]=nuevaEstacion;
	}
	
	
	public int  numeroEstacionesEntre( String nombreEstacion1, String nombreEstacion2)  throws TrayectoException{
		int numeroEstaciones = 0;
		if (nombreEstacion1.equals(nombreEstacion2)) {
			throw new TrayectoException("La estacion es la misma");
		}
		if(nombreEstacion1 ==null || nombreEstacion2==null) {
			throw new TrayectoException("La estacion es la misma");
		}
		if ( numeroRealDeEstaciones<MAXIMO_NUMERO_ESTACIONES) {
			numeroEstaciones= numeroRealDeEstaciones ;
		}
		return numeroEstaciones;
		
	}
	
	public LocalTime horaDeEstacion ( String nombreEstacion) throws TrayectoException{
		LocalTime hora= null;
		if (nombreEstacion== null) {
			throw new TrayectoException("La estacion no se encuentra");
		}
		
		return hora;
	}
	
	
	
}
