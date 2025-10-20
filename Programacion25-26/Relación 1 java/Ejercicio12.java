/*
 * Una pastelería nos ha pedido realizar un programa que calcule el presupuesto de las tartas que
fabrica.
◦ El programa preguntará primero de qué tipo quiere la tarta (M- Manzana, F-Fresa o C-Chocolate).
La tarta de manzana vale 12 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el
programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14
euros y la segunda 15.
◦ Por último, en cualquiera de los tipos de tarta, se pregunta si se añade nata y si se personaliza con
un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
◦ Para simplificar el ejercicio, puede suponerse que los datos de entrada son correctos, es decir, no
debe validarse ningún dato de entrada.

 */
import java.util.Scanner;
public class Ejercicio12 {

	private static final int TARTA_CHOCOLATE_BLANCO = 15;
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// Variables
		double precio=0;
		char sabor,chocolate,nata,nombre;
		//Inicio programa
		System.out.println("Introduce el sabor de la tarta(M-Manzana,F-Fresa,C-Chocolate)");
		sabor=teclado.nextLine().charAt(0);
		if(sabor=='C') {
			System.out.println("¿Que tipo de chocolate?(B-Blanco,N-negro)");
			chocolate=teclado.nextLine().charAt(0);
			if(chocolate=='B') {
				precio=TARTA_CHOCOLATE_BLANCO;
			}else {
				precio=14;
			}
		}else {
			if(sabor=='M') {
				precio=12;
			}else {
				precio=16;
			}
		}
		System.out.println("¿Desea nata?(S-Si,N-NO)");
		nata=teclado.nextLine().charAt(0);
		if(nata=='S') {
			precio=precio+2.5;
		}
		System.out.println("¿Desea escribir algo?(S-Si,N-NO)");
		nombre=teclado.nextLine().charAt(0);
		if(nombre=='S') {
			precio=precio+2.75;
		}
		System.out.println("El precio es de "+ precio+" euros");

	}

}

