import java.util.Scanner;

public class Ejercicio1R3Version2 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		int numero1, numero2, numero3, auxiliar;
	
		System.out.println("Introduce el primer numero");
		numero1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el segundo numero");
		numero2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el tercer numero");
		numero3 = Integer.parseInt(teclado.nextLine());
		
		if (numero1> numero2) {
			auxiliar=numero1;
			numero1=numero2;
			numero2=auxiliar;
		}

			if (numero3 <= numero1) {
				System.out.println(numero3 + " " + numero1 + " " + numero2);
			} else {
				if (numero3 <= numero2) {
					System.out.println(numero1 + " " + numero3 + " " + numero2);
				} else {
					System.out.println(numero1 + " " + numero2 + " " + numero3);
				}
			}
		}
	}

