import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contador;
		contador=0;
		do {
			System.out.println("Introduce un numero");
			numero= Integer.parseInt(teclado.nextLine());
			if (numero>0) {
				System.out.println("Numero es positivo");
			}else if (numero==0) {
				System.out.println("Numero es 0");
			}else {
				System.out.println("Numero es negativo");
			}
			contador ++;
			
		} while ( contador<10);
		
	}

}
