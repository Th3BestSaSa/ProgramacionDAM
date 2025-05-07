package Relacion4;

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        try (// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in)) {
			// Pedimos al usuario que ingrese un año
			System.out.print("Introduce un año: ");
			int año = scanner.nextInt();

			// Llamamos al método esBisiesto y mostramos el resultado
			if (esBisiesto(año)) {
			    System.out.println("El año " + año + " es bisiesto.");
			} else {
			    System.out.println("El año " + año + " no es bisiesto.");
			}
		}

    }



		    // Método para verificar si un año es bisiesto
		    public static boolean esBisiesto(int año) {
		        // Si el año es divisible por 400, es bisiesto
		        if (año % 400 == 0) {
		            return true;
		        }
		        // Si el año es divisible por 100, pero no por 400, no es bisiesto
		        else if (año % 100 == 0) {
		            return false;
		        }
		        // Si el año es divisible por 4, pero no por 100, es bisiesto
		        else if (año % 4 == 0) {
		            return true;
		        }
		        // En cualquier otro caso, no es bisiesto
		        else {
		            return false;
		        }
		    }
}

		   


		    
		