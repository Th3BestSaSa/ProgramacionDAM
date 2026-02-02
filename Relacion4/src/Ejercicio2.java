import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;

		System.out.println("Introduce el limite inferior");
		numero = Integer.parseInt(teclado.nextLine());
	
		factorial(numero);
		 
	}
	private static long factorial(int numero) {
		// TODO Auto-generated method stub
		long resultado = 1;
		if (numero < 0) {
			resultado = -1;
		} else {

			for (int contador = 1; contador <= numero; contador++) {
				resultado = resultado * contador;

			}
		}
		return resultado;  

	}
     	



}

