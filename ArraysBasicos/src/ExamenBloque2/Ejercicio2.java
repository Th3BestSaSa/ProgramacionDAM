package ExamenBloque2;

import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena2;
		System.out.println("Introduce un numero de telefono");
		cadena2 = teclado.nextLine();
		
		intercambiar(cadena2);
		
	}
	public static void intercambiar(String cadena2) {
		String[] a= cadena2.split(" ");
		String b;
		for (int i = 0; i < a.length; i++) {
			 b = a[i];
			StringBuilder sb= new StringBuilder(b);
			sb.reverse();
			b=sb.toString();
			System.out.print(b +" ");
		}
	}

}
