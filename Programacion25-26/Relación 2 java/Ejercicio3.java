import java.util.Scanner;

/**
 * Realizar un programa que solicite una cantidad de números que van a
 * introducirse por teclado. Después, para cada uno de ellos que indique si el
 * número es par o impar. Si la cantidad de números introducida es 0 o negativa
 * volverá a solicitarse el dato.
 * 
 */
public class Ejercicio3 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, contador = 1, cantidadDeNumeros;
		System.out.println("Introduce la cantidad de numeros a introducir");
		cantidadDeNumeros = Integer.parseInt(teclado.nextLine()); // cambiar a cantidad
		if (cantidadDeNumeros <= 0) {
			System.err.println("El numero introducido es incorrecto");
		} else {
			while (contador <= cantidadDeNumeros) {
				System.out.println("Introduce el numero (" + contador + "/" + cantidadDeNumeros + ")");
				numero = Integer.parseInt(teclado.nextLine());
				if (numero % 2 == 0) {
					System.out.println("Es par");
				} else {
					System.out.println("Es impar");
				}
				contador++;
			}
		}

	}

}
