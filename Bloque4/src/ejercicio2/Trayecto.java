package ejercicio2;
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
		int numeroEstaciones=0,posicion1=0,posicion2=0;
		Estacion estacion1=null,estacion2=null;
		for (int i = 0; i < trayecto.length; i++) {
			if(trayecto[i].getNombre().equals(nombreEstacion1)) {
				estacion1=trayecto[i];
				posicion1=i;
			}
			if(trayecto[i].getNombre().equals(nombreEstacion2)) {
				estacion2=trayecto[i];
				posicion2=i;
			}
		}
		if(estacion1.equals(null)||estacion2.equals(null)) {
			throw new TrayectoException("No se ha enconrtado una de las estaciones");
		}
		numeroEstaciones=posicion2-posicion1;
		return numeroEstaciones;
	}
	
	public LocalTime horaDeEstacion ( String nombreEstacion) throws TrayectoException{
		LocalTime hora=null;
		boolean encontrado=false;
		for (int i = 0; i < trayecto.length && !encontrado; i++) {
			if(trayecto[i].getNombre().equals(nombreEstacion)) {
				hora=trayecto[i].getHorallegada();
				encontrado=true;
			}
			
		}
		if(hora==null) {
			throw new TrayectoException("No se ha encontrado la estación");
		}
		return hora;
	}
	
}
