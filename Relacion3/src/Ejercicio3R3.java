import java.util.Scanner;

public class Ejercicio3R3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num, cantidad = 0;
		do {
			System.out.println("Introduce un número");
			num = Integer.parseInt(teclado.nextLine());
		} while (num < 0);
		while (num > 0) {
			num = num / 10;
			cantidad++;
		}
		System.out.println(cantidad);
	}
}