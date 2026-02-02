/*
 * Realizar un método llamado diasDeUnMes que tenga como entrada un número de mes (entre 1 y 12)
y un año y devuelva el número de días de ese mes y año. Usar el método anterior para cuando el año
sea bisiesto, febrero tenga 29 días.
 */
import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		int mes, anho;
		do {
			System.out.println("Introduce un mes(numero entre 1 y 12)");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);
		System.out.println("Introduce un año");
		anho = Integer.parseInt(teclado.nextLine());
		System.out.println("El mes "+mes+" del año "+anho+" tiene "+diasDeUnMes(mes, anho)+" dias");

	}

	public static int diasDeUnMes(int mes, int anho) {
		int dias = 0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias = 31;
		} else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			} else {
				if (Ejercicio3.esBisiesto(anho)) {
					dias = 29;
				} else {
					dias = 28;
				}
			}
		}

		return dias;
	}

}
