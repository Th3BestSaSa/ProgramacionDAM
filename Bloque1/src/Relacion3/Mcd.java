package Relacion3;

import java.util.Scanner;

public class Mcd {
	public static void main(String[] args) {
    	try (Scanner teclado = new Scanner(System.in)) {
    		int mcd;
    		int a;
    		int b;
        System.out.print("Ingrese el primer número entero positivo: ");
        a =Integer.parseInt(teclado.nextLine());

        System.out.print("Ingrese el segundo número entero positivo: ");
        b = Integer.parseInt(teclado.nextLine());

        mcd = calcularMCD(a, b);
     
    	 System.out.println("El MCD de " + a + " y " + b + " es: " + mcd) ;
    	}
    }

    // Método para calcular el MCD usando el algoritmo del eclipse
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int resto = a % b; // Obtener el resto de la división
            a = b; 
            b = resto; 
        }
        return a;
        
}
}