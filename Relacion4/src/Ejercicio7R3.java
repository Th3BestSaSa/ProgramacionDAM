import java.util.Scanner;

public class Ejercicio7R3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int dividendo;
		int divisor;
		do {
			System.out.println("Introduce un número");
			dividendo = Integer.parseInt(teclado.nextLine());
		} while (dividendo < 0);
		
		do {
			System.out.println("Introduce un número");
			divisor = Integer.parseInt(teclado.nextLine());
		} while (divisor < 0);
		dividendo = mcd(dividendo, divisor);
		System.out.println("En MCD es "+ dividendo);

	}

	public static int mcd(int dividendo, int divisor) {
		int resultado;
		do {
			resultado=dividendo%divisor;
			dividendo=divisor;
			divisor=resultado;
			
		}while (resultado != 0);
		return dividendo;
	}

}
