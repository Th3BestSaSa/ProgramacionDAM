package Relacion2;
import java.util.Scanner;

public class Ejercicio09Relacion2 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, divisorPosible, sumaDivisores;
		
		do {
			System.out.println("Introduce un numero entero positivo:");
			numero=Integer.parseInt(teclado.nextLine());
		}while (numero <=0);
		
		sumaDivisores=0;
		for (divisorPosible=1; divisorPosible<=numero/2; divisorPosible++) {
			
			if ( numero % divisorPosible==0) {
				sumaDivisores=sumaDivisores + divisorPosible;
			}
		}
		
		if ( numero==sumaDivisores) {
			System.out.println("El número " + numero + " es perfecto");
		}else {
			System.out.println("El número "+ numero + " NO es perfecto");
		}
		
	}

}
