import java.util.Scanner;

public class Ejercicio4 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, suma = 0;
		do {
			System.out.println("Introduce la cantidad de numeros a introducir");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero <= 0);
		while (numero > 0) {
			suma = suma + numero;
			numero--;
		}
		System.out.println(suma);
	}
}

