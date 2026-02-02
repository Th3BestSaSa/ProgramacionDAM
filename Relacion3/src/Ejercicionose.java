import java.util.*;
public class Ejercicionose {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		        int numero, contador, asterizcos;
		        String caracter;

		        caracter = "*";
		        contador = 1;
		        System.out.println("Introduce la base:");
		        numero = Integer.parseInt(teclado.nextLine());
		        while (contador <= numero) {
		            asterizcos = 1;
		            while (asterizcos <= contador) {
		                System.out.print(caracter);
		                asterizcos = asterizcos + 1;
		            }
		            System.out.println("");
		            contador = contador + 2;
		        }
		    }
	}
