package Relacion4;

import java.util.*;

public class Ejercicio2 {
	 private static Scanner teclado = new Scanner(System.in);

	    public static void main(String[] args) {
	        long factorial;
	      
	        factorial = factoriales();
	        System.out.println("El factorial es: " + factorial);
	    }

	    // Método que pide un número y calcula su factorial
	    public static long factoriales() {
	        int numero;
	        long factorial = 1;
	        
	        
	        do {
	            System.out.println("Introduce un numero entero positivo:");
	            numero = Integer.parseInt(teclado.nextLine());
	        } while (numero < 0); 
	        
	        
	        for (int contador = 1; contador <= numero; contador++) {
	            factorial *= contador; // Multiplicamos por el contador
	        }
	        // Imprimir el resultado
	        System.out.println("El factorial de " + numero + " es " + factorial);
	        
	        // Devolver el factorial calculado
	        return factorial;
	    }
	}
