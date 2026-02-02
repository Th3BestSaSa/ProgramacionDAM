import java.util.Scanner;

public class Ejercicio10Version2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		int numero1, numero2;

		
		System.out.println("Introduce el caracter");
		caracter=teclado.nextLine().charAt(0);
		System.out.println("Introduce el primer numero");
		numero1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el primer numero");
		numero2=Integer.parseInt(teclado.nextLine());
		
		
		switch (caracter) {
		case '+':
			  numero1 = numero1 + numero2;
			break;
		case '-':
			  numero1 = numero1 - numero2;
			break;
		case '*':
			numero1 = numero1 * numero2;
			break;
		case '/':
			numero1 =  numero1 / numero2;
			break;
		
			
		default:
			System.out.println("El caracter no es aritmetico");
			break;
	}
		   System.out.println("El resultado es " + numero1);
}
}
