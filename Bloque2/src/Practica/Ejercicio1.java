package Practica;

import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int edad;
        double precio, descuento=0;
        char familiaNumerosa, tarjetaMonroy;

        do {
            System.out.println("Edad: ");
            edad =Integer.parseInt(teclado.nextLine());
        } while (edad < 0 || edad > 120);
        do {
            System.out.println("¿Es familia numerosa (S/N)?");
            familiaNumerosa =teclado.nextLine().charAt(0);
        } while (!(familiaNumerosa=='S') && !(familiaNumerosa=='N'));
        do {
            System.out.println("¿Tiene tarjeta Monroy+ (S/N)?");
            tarjetaMonroy=teclado.nextLine().charAt(0);
        } while (!(tarjetaMonroy=='S') || !!(tarjetaMonroy=='N'));
        if (edad < 13) {
            precio = 12;
        } else {
            if (edad >= 13 && edad <= 25) {
                precio = 16;
            } else {
                if (edad > 60) {
                    precio = 20;
                } else {

                    // TarifaGeneral
                    precio = 25;
                }
            }
        }
        if (familiaNumerosa=='S') {
            descuento = 0.1;
        }
        if (tarjetaMonroy=='S') {

            // Al entrar por aqui machaco el valor anterior
            descuento = 0.2;
        }
        System.out.println(descuento);
        precio = precio * descuento;
        System.out.println("El precio de la entrada es " + precio);
	}



    }

