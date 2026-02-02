

import java.util.Scanner;

public class Main {
	
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		Aeropuerto aeropuerto1;
		Aeropuerto aeropuerto2;
		Vuelo vuelo1,vuelo2;
		double precioBillete;
		
		//Inicio Programa
		//Primer vuelo
			try {
				aeropuerto1=crearAeropuerto("origen");
				aeropuerto2=crearAeropuerto("destino");
				vuelo1=new Vuelo("A1234", aeropuerto1, aeropuerto2, 150, 100);
				precioBillete=vuelo1.comprarBillete();
				System.out.println("El billete tiene un precio de "+precioBillete+"€");
				System.out.println(vuelo1);
			}catch(MonroyFlightException e) {
				System.out.println(e.getMessage());
			}
			
		//Segundo vuelo
			try {
				aeropuerto1=new Aeropuerto("Fiumicino", "Roma", 0);
				aeropuerto2=new Aeropuerto("San Pablo", "Sevilla", 0);
				vuelo2=new Vuelo("B8547", aeropuerto1, aeropuerto2, 200, 120);
				System.out.println(vuelo2);
			}catch(MonroyFlightException e) {
				System.out.println(e.getMessage());
			}
	}
	
/**
 * 
 * @param ubicacion nos dice si es el aeropuerto de origen o el de destino
 * @return
 * @throws NumberFormatException
 * @throws MonroyFlightException
 */
	public static Aeropuerto crearAeropuerto(String ubicacion) throws NumberFormatException, MonroyFlightException {
		System.out.println("Introduce el nombre del aeropuerto de "+ubicacion);
		String nombre=teclado.nextLine();
		System.out.println("Introduce la ciudad del aeropuerto de "+ubicacion);
		String ciudad=teclado.nextLine();
		System.out.println("Introduce recargo del aeropuerto de "+ubicacion);
		int recargo=Integer.parseInt(teclado.nextLine());
		Aeropuerto aeropuertoCreado=new Aeropuerto(nombre,ciudad,recargo);
		return aeropuertoCreado;
	}

}

