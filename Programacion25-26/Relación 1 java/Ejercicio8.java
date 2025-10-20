import java.util.Scanner;

public class Ejercicio8 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char estadoCivil;
		int edad;
		System.out.println("Introduce el estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado)");
		estadoCivil=teclado.nextLine().charAt(0);
		
		System.out.println("Introduce la edad");
		edad=Integer.parseInt(teclado.nextLine());
		
		if (estadoCivil=='S' || estadoCivil=='D') {
			System.out.println("12%");
		}else {
			if (edad>50) {
				System.out.println("8.5%");
			}else {
				if (estadoCivil=='C' || estadoCivil=='V') {
					System.out.println("11.3%");
				}else {
					System.out.println("10.5%");
				}
			}
		}		
	}

}
