package Practica;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
int numeroEntradas, contador, precioTotal, precioEntradas, auxiliarEntradas;
        char seleccionarZona;

        do {
            System.out.println("Introduce el número de entradas para el concierto (máximo 10) :");
            numeroEntradas =Integer.parseInt(teclado.nextLine());
        } while (numeroEntradas > 10 || numeroEntradas <= 0);
        contador = 1;
        precioTotal = 0;
        precioEntradas = 0;
        auxiliarEntradas = 0;
        
        while (contador <= numeroEntradas) {
        	System.out.println("Entrada "+ contador + ". Zona (A,B,C)");
        	seleccionarZona =teclado.nextLine().charAt(0);
            if (seleccionarZona == 'A') {
                precioEntradas = 80;
            } else {
                if (seleccionarZona == 'B') {
                    precioEntradas = 110;
                } else {
                    precioEntradas = 120;
                }
            }
          
            precioTotal = precioTotal + precioEntradas;
            if (auxiliarEntradas < precioEntradas) {
                auxiliarEntradas = precioEntradas;
            }  contador = contador + 1;
        }
        System.out.println("El precio total de su compra es de " + precioTotal + "euros");
        System.out.println("La entrada mas cara es " + auxiliarEntradas);
    }
}