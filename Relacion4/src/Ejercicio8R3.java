
import java.util.Scanner;

public class Ejercicio8R3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = '*';
		int ancho, alto;
		do {
			System.out.println("Introduce el acho");
			ancho = Integer.parseInt(teclado.nextLine());
		} while (ancho < 0);
		do {
			System.out.println("Introduce el alto");
			alto = Integer.parseInt(teclado.nextLine());
		} while (alto < 0);

		pintarTrianguloConEspacios(caracter, ancho, alto);

	}

	private static void pintarTrianguloConEspacios(char caracter, int ancho, int alto) {
		for (int j = 1; j <= alto; j++) {

			for (int i = 1; i <= ancho; i++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
}
