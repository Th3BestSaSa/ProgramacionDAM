import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		System.out.println("Introduce el numero");
		numero=Integer.parseInt(teclado.nextLine());
		
		if (numero%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
