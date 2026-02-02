import java.util.Scanner;

public class EjercicioRombo {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int altura, auxiliar, espaciosInvertidos;

		do {
			System.out.println("Introduce la altura(Impar)");
			altura = Integer.parseInt(teclado.nextLine());
		} while (altura < 0 || altura % 2 == 0);

		for (int vueltas = 1; vueltas <= altura / 2 + 1; vueltas++) {
			for (int espacios = 1; espacios <= altura - vueltas; espacios++) {
				System.out.print(" ");
			}
			for (int asteriscos = 1; asteriscos <= 2 * vueltas - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
		auxiliar = altura - 2;
		espaciosInvertidos = altura / 2 + 1;
		for (int vueltas = 1; vueltas <= altura / 2 + 1; altura -= 2) {

			for (int espacios = 1; espacios <= espaciosInvertidos; espacios++) {
				System.out.print(" ");
			}
			espaciosInvertidos++;
			for (int asteriscos = 1; asteriscos <= auxiliar; asteriscos++) {
				System.out.print("*");

			}
			auxiliar -= 2;
			System.out.println();
		}
	}

}
