import java.util.Scanner;
// mas eficinte con bucles 
public class Ejercicio5 {
	private static final int CANTIDAD_NUMEROS = 4;
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, numero3, numero4;
		double media;
		System.out.println("Introduce el primer numero");
		numero1= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el segundo numero");
		numero2= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el tercer numero");
		numero3= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el cuarto numero");
		numero4= Integer.parseInt(teclado.nextLine());
		
		media= (numero1+numero2+numero3+numero4)/CANTIDAD_NUMEROS;
		System.out.println("La media es " + media);
		if (media<numero1) {
			System.out.println(numero1 + " es superior a la media " + media);
		}
		if (media<numero2) {
			System.out.println(numero2 + " es superior a la media " + media);
		}
		if (media<numero3) {
			System.out.println(numero3 + " es superior a la media " + media);
		}
		if (media<numero4) {
			System.out.println(numero4 + " es superior a la media " + media);
		}
		
		
		
		
		
	}

}
