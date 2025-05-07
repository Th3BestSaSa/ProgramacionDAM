package Relacion4;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        int limiteInferior = 1;
        int limiteSuperior = 10;
       
        int numero = solicitarNumeroEnRango(limiteInferior, limiteSuperior);
        System.out.println("El número ingresado es: " + numero);
    }

    public static int solicitarNumeroEnRango(int limiteInferior, int limiteSuperior) {
    	try (Scanner teclado = new Scanner (System.in)) {
			int numero;
			
			do {
			    System.out.println("Ingresa un número entre " + limiteInferior + " y " + limiteSuperior + ": ");
			    numero = Integer.parseInt(teclado.nextLine());
			} while (numero < limiteInferior || numero > limiteSuperior);
			
			return numero;
		}
		
    }
}

