import java.util.Scanner;

public class Ejercicio11 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1, numero2;
		do {
			System.out.println("Introduce un número entero positivo:");
			numero1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce un número entero positivo:");
			numero2 = Integer.parseInt(teclado.nextLine());
		} while (numero1 < 0 || numero2 < 0);
		while (numero1 < numero2) {
			System.out.println(numero1);
			numero1 = numero1 + 7;
		}
	}
}