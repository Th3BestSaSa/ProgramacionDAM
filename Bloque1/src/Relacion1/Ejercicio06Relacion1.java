package Relacion1;

/*
 * Un profesor usa una tabla de porcentajes para convertir calificaciones numéricas a letras. El programa
debe solicitar al usuario su calificación numérica y luego mostrar la letra correspondiente según esta
tabla:
● A: 90 - 100
● B: 80 - 89
● C: 70 - 79
● D: 60 - 69
● F: 0 - 59

 */

import java.util.Scanner;

public class Ejercicio06Relacion1 {

	private static final int MAXIMO_NOTA_B = 89;
	private static final int MAXIMO_NOTA_C = 79;
	private static final int MAXIMO_NOTA_D = 69;
	private static final int MAXIMA_NOTA_F = 59;
	private static final int NOTA_MAXIMA = 100;
	private static final int NOTA_MINIMA = 0;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int nota;

		System.out.println("Introduce tu nota del " + NOTA_MINIMA +  " al " + NOTA_MAXIMA + " y te dire tu calificación final");
		nota = Integer.parseInt(teclado.nextLine());
		
		
		if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
			System.out.println(" Error, no es una nota válida ");
		} else {
			if (nota <= MAXIMA_NOTA_F) {
				System.out.println("Tu calificación es F");
			} else {
				if (nota <= MAXIMO_NOTA_D) {
					System.out.println("Tu calificación es D");
				} else {
					if (nota <= MAXIMO_NOTA_C) {
						System.out.println("Tu calificación es C");
					} else {
						if (nota <= MAXIMO_NOTA_B) {
							System.out.println("Tu calificación es B");
						} else {
							System.out.println("Tu calificación es A");
						}
					}
				}
			}
		}
	}
}
