/*
 * Realizar un programa que solicite un conjunto de números. Después de introducir cada número se
realizará la pregunta: "¿Desea introducir más números (S/N)". Si la respuesta es 'S' se solicitará otro
número. Cuando no desee introducir más números debe informar cual es el menor de los números
introducidos
 */
import java.util.Scanner;

public class Ejercicio8 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		int numero,menor;
		char aceptar;
		//Inicio programa
		System.out.println("Introduce un número");
		numero=Integer.parseInt(teclado.nextLine());
		menor=numero;
		System.out.println("¿Desea introducir otro número?(S-Si,N-No)");
		aceptar=teclado.nextLine().charAt(0);
		switch(aceptar) {
		case 'S':
			do {
				System.out.println("Introduce un número");
				numero=Integer.parseInt(teclado.nextLine());
				if(numero<menor) {
					menor=numero;
				}
				System.out.println("¿Desea introducir otro número?(S-Si,N-No)");
				aceptar=teclado.nextLine().charAt(0);
			}while(aceptar=='S');
			break;
		}
		System.out.println("El menor numero es "+menor);

	}

}
