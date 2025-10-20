/*
 * Un parque de atracciones ofrece tarifas de entrada diferenciadas según la edad y la ocupación del
visitante. Las tarifas son:
● Niños menores de 12 años: Entrada gratuita.
● Jóvenes entre 12 y 18 años: 50% de descuento.
● Adultos mayores de 60 años: 25% de descuento.
● Estudiantes (cualquier edad): 30% de descuento.
● Profesores (cualquier edad): Entrada gratuita.
El programa debe pedir la edad y la ocupación del visitante, y calcular el descuento correspondiente.
Si el visitante no cumple con ninguno de estos casos, se debe mostrar que paga el precio completo.
Los descuentos no son acumulables, y además debe diseñarse el programa para que se aplique el
descuento más favorable a cada caso.

 */
import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// Variables
		char profesion;
		int edad;
		//Inicio programa
		System.out.println("Introduce tu profesión(E-Estudiante,P-Profesor,O-Otro)");
		profesion=teclado.nextLine().charAt(0);
		if(profesion=='P') {
			System.out.println("La entrada es gratuita");
		}else {
			System.out.println("Indique su edad");
			edad=Integer.parseInt(teclado.nextLine());
			if(edad<12) {
				System.out.println("La entrada es gratuita");
			}else {
				if(edad<18) {
					System.out.println("Tiene un 50% de descuento");
				}else {
					if(profesion=='E') {
						System.out.println("Tiene un 30% de descuento");
					}else {
						if(edad>60) {
							System.out.println("Tiene un descuento del 25%");
						}else {
							System.out.println("El precio no tiene descuento");
						}
					}
				}
			}
		}

	}

}

