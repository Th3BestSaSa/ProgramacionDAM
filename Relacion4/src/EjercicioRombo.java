import java.util.Scanner;

public class EjercicioRombo {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int base;
	do {
		System.out.println("Introduce la altura(Impar)");
		base = Integer.parseInt(teclado.nextLine());
	} while (base < 0 && base % 2 == 0);

	pintarRombo(base);
}
	private static void pintarRombo(int base) {
		int auxiliar;
		int espaciosInvertidos;
		for ( int vueltas = 1; vueltas <= base / 2 + 1; vueltas++) {
			for ( int espacios = 1; espacios <= base - vueltas; espacios++) {
				System.out.print(" ");
			}
			for (int asteriscos = 1; asteriscos <= 2 * vueltas - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
		auxiliar=base-2;
		espaciosInvertidos=base/2+1;
		for ( int vueltas = 1; vueltas <= base / 2 + 1; base=-2) {
			
			
			for (int espacios = 1; espacios <=  espaciosInvertidos; espacios++) {
				System.out.print(" ");
			}espaciosInvertidos++;
			for (int  asteriscos = 1; asteriscos <=auxiliar; asteriscos++) {
				System.out.print("*");
			
			}	auxiliar= auxiliar-2;
			System.out.println();
		}
	}
	
}
