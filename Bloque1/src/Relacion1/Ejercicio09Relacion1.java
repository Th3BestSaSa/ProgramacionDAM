package Relacion1;

import java.util.Scanner;

public class Ejercicio09Relacion1 {

	// Constantes
	private static final int HORA_SEGUNDOS = 3600; // total de segundos de una
													// hora
	private static final int MIN_SEGUNDOS = 60; // total de segundos de un
												// minuto

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int hora1, minutos1, segundos1;
		int hora2, minutos2, segundos2;
		int totalSegundos1, totalSegundos2;

		System.out.println("Introduce la primera marcación (hora INTRO minutos INTRO segundos INTRO): ");
		hora1 = Integer.parseInt(teclado.nextLine());
		minutos1 = Integer.parseInt(teclado.nextLine());
		segundos1 = Integer.parseInt(teclado.nextLine());
		if (hora1 < 0 || hora1 >= 24 || minutos1 < 0 || minutos1 >= 60 || segundos1 < 0 || segundos1 >= 60) {

			System.out.println("Introduce la segunda marcación (hora INTRO minutos INTRO segundos INTRO): ");
			hora2 = Integer.parseInt(teclado.nextLine());
			minutos2 = Integer.parseInt(teclado.nextLine());
			segundos2 = Integer.parseInt(teclado.nextLine());
			if (hora2 < 0 || hora2 >= 24 || minutos2 < 0 || minutos2 >= 60 || segundos2 < 0 || segundos2 >= 60) {

				// Convertimos las marcaciones a segundos para compararlas

				totalSegundos1 = (hora1 * HORA_SEGUNDOS) + (minutos1 * MIN_SEGUNDOS) + segundos1;
				totalSegundos2 = (hora2 * HORA_SEGUNDOS) + (minutos2 * MIN_SEGUNDOS) + segundos2;

				if (totalSegundos1 > totalSegundos2) {
					System.out.println("Hora 1 es mayor que Hora 2");
				} else {
					if (totalSegundos1 < totalSegundos2) {
						System.out.println("Hora 2 es mayor que Hora 1");
					} else {
						System.out.println("Hora 1 es igual que Hora 2");
					}
				}
			}
		}
	}
}
