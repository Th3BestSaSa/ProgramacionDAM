import java.util.Scanner;
/*
	 * Realizar un programa que solicite la base de un triángulo (debe ser un número
	 * impar) así como un carácter. El programa pintará por pantalla un triángulo
	 * con esa base de esta forma.
	 */
public class EjerciciosNose2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int base;
		
		do {
			System.out.println("Introduce la altura(Impar)");
			base = Integer.parseInt(teclado.nextLine());
		} while (base < 0 && base % 2 == 0);

		for (int vueltas = 1; vueltas <= base / 2 + 1; vueltas++) {
			for (int espacios = 1; espacios <= base - vueltas; espacios++) {
				System.out.print(" ");
			}
			for (int asteriscos = 1; asteriscos <= 2 * vueltas - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
