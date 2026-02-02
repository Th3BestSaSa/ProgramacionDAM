/*
 * Realizar un programa que solicite 3 números cualesquiera y los muestre por pantalla ordenados de
menor a mayor.
 */
import java.util.Scanner;

public class Relacion3Ejercicio1 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		int numero1, numero2, numero3;
		//Inicio Programa
		System.out.println("Introduce el primer numero");
		numero1=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el segundo numero");
		numero2=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el tercer numero");
		numero3=Integer.parseInt(teclado.nextLine());
		
		if(numero1>=numero2) {
			if(numero3>=numero1) {
				System.out.println(numero3 +" "+ numero1 +" "+ numero2);
			}else {
				if(numero3>=numero2) {
					System.out.println(numero1 +" "+ numero3 +" "+ numero2);
				}else {
					System.out.println(numero1 +" "+ numero2 +" "+ numero3);
				}
			}
		}else {
				if(numero3>=numero2) {
					System.out.println(numero3 +" "+ numero2 +" "+ numero1);
				}else {
					if(numero3>=numero1) {
						System.out.println(numero2 +" "+ numero3 +" "+ numero1);
					}else {
						System.out.println(numero2 +" "+ numero1 +" "+ numero3);
					}
			}
		}
	}

}
