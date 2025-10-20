import java.util.Scanner;

public class Ejercicio12Version2 {
	private static final double TARTA_CHOCOLATE_BLANCO = 15;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		double precio = 0;
		char sabor, chocolate, nata, nombre;
		// Inicio programa
		System.out.println("Introduce el sabor de la tarta(M-Manzana,F-Fresa,C-Chocolate)");
		sabor = teclado.nextLine().charAt(0);

		switch (sabor) {
		case 'F':
			precio = 16;
			break;
		case 'M':
			precio = 12;
			break;
		case 'C':
			System.out.println("¿Que tipo de chocolate?(B-Blanco,N-negro)");
			chocolate = teclado.nextLine().charAt(0);
			if (chocolate == 'B') {
				precio = TARTA_CHOCOLATE_BLANCO;
			} else {
				precio = 14;
			}
			break;
		default:
			
			break;
	
			

		}
		System.out.println("¿Desea nata?(S-Si,N-NO)");
		nata=teclado.nextLine().charAt(0);
		if(nata=='S') {
			precio=precio+2.5;
		}
		System.out.println("¿Desea escribir algo?(S-Si,N-NO)");
		nombre = teclado.nextLine().charAt(0);
		if (nombre == 'S') {
			precio = precio + 2.75;
		}
		System.out.println("El precio es de " + precio + " euros");
	}
}
