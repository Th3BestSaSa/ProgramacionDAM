


import java.util.Scanner;

public class Arrays8 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Seb", "Oct", "Nov", "Dic" };
		int[] numero = new int[meses.length];

		introducirNumerosEnArray(meses, numero);

		pintar(meses, numero);

	}

	private static void introducirNumerosEnArray(String[] meses, int[] numero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < meses.length; i++) {
			System.out.print("Introducir la temperatura de " + meses[i]);
			numero[i] = Integer.parseInt(teclado.nextLine());
		}
		//System.out.println(Arrays.toString(numero));
	}

	private static void pintar(String[] meses, int[] numero) {
	    char caracter = '*';

	    for (int i = 0; i < meses.length; i++) {
	        System.out.print(meses[i] + ": ");
	        int temperatura = numero[i];
	        if (temperatura == 0) {
	            System.out.print("0");
	        } else {
	            for (int contador = 0; contador < temperatura; contador++) {
	                System.out.print(caracter);
	            }
	        }
	        System.out.println(); 
	    }
	}
}
