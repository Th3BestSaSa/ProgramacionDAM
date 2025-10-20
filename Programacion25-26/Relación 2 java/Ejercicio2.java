import java.util.Scanner;

public class Ejercicio2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contador;
		contador=0;
		do {
			System.out.println("Introduce un numero del 1 al 10");
			numero= Integer.parseInt(teclado.nextLine());
		} while (numero<-1 || numero>11);
		while (contador<=10) {
			System.out.println(numero + "*" + contador +"=" + numero*contador);
			contador++;
		}
		
		
		
		
	}

}
