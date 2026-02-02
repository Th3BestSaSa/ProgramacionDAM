import java.util.Scanner;

public class Ejercicio4 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		
		System.out.println("Introduce la edad");
		edad=Integer.parseInt(teclado.nextLine());
		if (edad<0 ||  edad>=100) {
			System.out.println("Error");
		} else {
			if (edad<12) {
				System.out.println("Es un niño");
			} else {
				if (edad<=17) {
					System.out.println("Es un adolescente");
				} else {
					if (edad<=29) {
						System.out.println("Es un joven");
					} else {
						System.out.println("Es un adulto");
					}
				}
			}
		}
	}

}
