import java.util.*;
public class Ejercicionose {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		        int numero;
		        char caracter;
		        caracter = '*';
		      do {
				System.out.println("Introduce la base:");
		        numero = Integer.parseInt(teclado.nextLine());
			} while (numero<0 || numero%2==0);

		     
		        pintarTriangilo(numero, caracter);
		    }
	private static void pintarTriangilo(int numero, char caracter) {
		for (int i = 0; i <= numero; i=i+2) {
			for (int j = 0; j <= i; j++) {
				System.out.print(caracter);
				
			}System.out.println("");
		}
	}
	}