import java.util.Scanner;

public class Ejercicio7 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		System.out.println("Introduce una letra");
		letra = teclado.nextLine().charAt(0);

		if (letra == 'A') {
			System.out.println("A");
		} else {
			if (letra == 'E') {
				System.out.println("E");
			} else {
				if (letra == 'I') {
					System.out.println("I");
				} else {
					if (letra == 'O') {
						System.out.println("O");
					} else {
						if (letra == 'U') {
							System.out.println("U");
						}
					}
				}
			}
		}
	}
}
