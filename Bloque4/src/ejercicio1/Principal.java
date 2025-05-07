package ejercicio1;

import java.util.Arrays;

public class Principal {
	
	private Alojamiento[] tour;

	private static void listadoAlojamientosOrdenadosPorPrecio(Alojamiento[] tour) {
		Arrays.sort(tour);
		for (int i = 0; i < tour.length; i++) {
			System.out.println(tour[i]);
			
		}
	}
	
	private static Hotel primerHotelConServicioDeHabitaciones(Alojamiento[] tour) throws AlojamientoException {
		Hotel hotelConServicio=null;
		boolean encontrado=false;
		for (int i = 0; i < tour.length && !encontrado; i++) {
			if(tour[i] instanceof Hotel) {
				hotelConServicio=(Hotel) tour[i];
				encontrado=true;
			}
			
		}
		if(hotelConServicio==null) {
			throw new AlojamientoException("No se ha encontrado ningún hotel con servicio de habitaciones");
		}
		return hotelConServicio;
	}
}
