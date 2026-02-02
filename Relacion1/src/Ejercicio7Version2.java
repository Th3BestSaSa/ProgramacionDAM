import java.util.Scanner;

public class Ejercicio7Version2 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		System.out.println("Introduce una letra");
		letra = teclado.nextLine().charAt(0);
		switch (letra) {
		case 'A':
			System.out.println("A");
			break;
		case 'I':
			System.out.println("I");
			break;
		case 'E':
			System.out.println("E");
			break;
		case 'O':
			System.out.println("O");
			break;
		case 'U':
			System.out.println("U");
			break;

		default:
			System.out.println("El caracter no es una vocal");
			break;
		}

	}
}