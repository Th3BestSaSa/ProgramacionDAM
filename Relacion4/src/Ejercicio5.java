/*
 * Realizar un método llamado pintarNuevaHora al que se le pasen 4 parámetros enteros:
◦ horaActual
◦ minutosActuales
◦ segundosActuales
◦ segundosASumar
El método no devuelve nada y debe mostrar dos mensajes:
La hora anterior era H: M: S
La nueva hora es H: M: S
El método supondrá que los datos de entrada son correctos. Esta validación de datos se realizará desde el
main.
Probar el método desde el main
 */

import java.util.Scanner;

public class Ejercicio5 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		int segundos, minutos, horas, sumaSegundos;
		do {
			System.out.println("Introduce la hora");
			horas = Integer.parseInt(teclado.nextLine());
		} while (horas >= 24||horas<0);
		do {
			System.out.println("Introduce los minutos");
			minutos = Integer.parseInt(teclado.nextLine());
		} while (minutos >= 60||minutos<0);
		do {
			System.out.println("Introduce los segundos");
			segundos = Integer.parseInt(teclado.nextLine());
		} while (segundos >= 60||segundos<0);
		System.out.println("Introduce los segundos a sumar");
		sumaSegundos = Integer.parseInt(teclado.nextLine());
		pintarNuevaHora(horas, minutos, segundos, sumaSegundos);

	}

	public static void pintarNuevaHora(int hora, int minuto, int segundo, int suma) {
		System.out.printf("La hora anterior era ", hora, minuto, segundo);
//		if (suma >= 3600) {
//			hora = hora + (suma / 3600);
//			suma = suma % 3600;
//		}
//		if (suma >= 60) {
//			minuto = minuto + (suma / 60);
//			suma = suma % 60;
//		}
//		segundo = segundo + suma;
//		
//		//Ajuste de la hora si sobrepasa su limite
//		if (segundo >= 60) {
//			segundo = segundo % 60;
//			minuto++;
//
//		}
		
		// Sumar todos los segundos a la hora actual de forma más simple
		int totalSegundos = hora * 3600 + minuto * 60 + segundo + suma;

		// Ajustar las 24 horas (en segundos)
		totalSegundos = totalSegundos % (24 * 3600);

		// Calcular la nueva hora, minutos y segundos
		hora = totalSegundos / 3600;
		minuto = (totalSegundos % 3600) / 60;
		segundo = totalSegundos % 60;

		if (minuto >= 60) {
			minuto = minuto % 60;
			hora++;
		}
		if (hora >= 24) {
			hora = hora % 24;
		}

		System.out.printf("La nueva hora es %02d:%02d:%02d\n", hora, minuto, segundo);
	}

}
