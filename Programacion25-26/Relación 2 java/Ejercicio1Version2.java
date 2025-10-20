import java.util.Scanner;

public class Ejercicio1Version2 {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce un numero");
			numero= Integer.parseInt(teclado.nextLine());
			if (numero>0) {
				System.out.println("Numero es positivo");
			}else if (numero==0) {
				System.out.println("Numero es 0");
			}else {
				System.out.println("Numero es negativo");
			}
			
		}
		
	
	}

}
