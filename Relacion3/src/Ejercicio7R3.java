import java.util.Scanner;

public class Ejercicio7R3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividendo,divisor,resultado;
		do {
			System.out.println("Introduce un número");
			dividendo = Integer.parseInt(teclado.nextLine());
		} while (dividendo < 0);
		do {
			System.out.println("Introduce un número");
			divisor = Integer.parseInt(teclado.nextLine());
		} while (divisor < 0);
		do {
			resultado=dividendo%divisor;
			dividendo=divisor;
			divisor=resultado;
			
		}while (resultado != 0);
		System.out.println("En MCD es "+ dividendo);
	
	}

}
