/*
 * Realizar un método que informe de si un año es o no bisiesto. Un año es bisiesto si es múltiplo de 4, a
excepción de los que, siendo múltiplos de 4 son múltiplos de 100 y no de 400.
 */
import java.util.Scanner;
public class Ejercicio3 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		int anho;
		System.out.println("Introduce un año");
		anho=Integer.parseInt(teclado.nextLine());
		if(esBisiesto(anho)) {
			System.out.println("El año "+anho+" es bisiesto");
		}else {
			System.out.println("El año "+anho+" no es bisiesto");
		}

	}
	
	public static boolean esBisiesto(int anho) {
		boolean bisiesto=false;
		if(anho%4==0) {
			bisiesto=true;
		}
		if(anho%100==0) {
			bisiesto=false;
		}
		if(anho%400==0) {
			bisiesto=true;
		}
		return bisiesto;
	}

}
