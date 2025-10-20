import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, contador = 0;

		do {
			System.out.println("Introduce un número");
			numero = Integer.parseInt(teclado.nextLine());
			contador++;
		} while (numero > 0);
		contador--;
		System.out.println("Has introducido " + contador + " numeros positivos");

	}
}
