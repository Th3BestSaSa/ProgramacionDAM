import java.util.Scanner;

public class Ejercicio3Version2 {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero, contador = 1, cantidadDeNumeros;
		System.out.println("Introduce la cantidad de numeros a introducir");
		cantidadDeNumeros = Integer.parseInt(teclado.nextLine()); // cambiar a cantidad
		if (cantidadDeNumeros <= 0) {
			System.err.println("El numero introducido es incorrecto");
		} else {
	
			for (int i = 0; i <= cantidadDeNumeros; i++) {
				
				System.out.println("Introduce el numero (" + contador + "/" + cantidadDeNumeros + ")");
				numero = Integer.parseInt(teclado.nextLine());
				if (numero % 2 == 0) {
					System.out.println("Es par");
				} else {
					System.out.println("Es impar");
				}
			}
			
		
		}
		
		
	}

}
