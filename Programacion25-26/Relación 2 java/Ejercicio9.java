import java.util.Scanner;

public class Ejercicio9 {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, divisor=1, suma=0;
		
		do {
			System.out.println("Introduce un número entero positivo:");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero <= 0);
		
		while(divisor<=(numero/2)) {
			if(numero%divisor==0) {
				suma=suma + divisor;
				divisor++;
			}else {
				divisor++;
			}
		
		}
		
		if(numero==suma) {
			System.out.println("El número "+ numero+ " es perfecto");
		}else{
			System.out.println("El número "+ numero+ " no es perfecto");
		}
		
	}

}
