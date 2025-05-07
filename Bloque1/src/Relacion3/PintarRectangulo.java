package Relacion3;
import java.util.Scanner;

public class PintarRectangulo {
	   public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		int ancho;
		int alto;
		int contador;
		int contador2;
	
		{
		      System.out.print("Introduce el ancho: ");
		    ancho = Integer.parseInt(teclado.nextLine());

		    System.out.print("Introduce el alto: ");
		    alto = Integer.parseInt(teclado.nextLine());

		    for (contador = 0; contador < alto; contador = contador +1) {
		        for (contador2 = 0; contador2 < ancho; contador2 = contador2 +1) {
		            System.out.print("*");
		        }
		        System.out.println(); 
		    }

		}
	} 
	}
}