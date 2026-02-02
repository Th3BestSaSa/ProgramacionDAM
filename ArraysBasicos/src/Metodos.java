import java.util.Scanner;
import java.util.Random;

public class Metodos {


	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {

	}
	public static int introducirNumero() {
		int numero;
		numero=Integer.parseInt(teclado.nextLine());
		return numero;
	}
	public static char introducirCaracter() {
		char caracter;
		caracter=teclado.nextLine().charAt(0);
		return caracter;
	}
	public static String introducirCadena() {
		String cadena;
		cadena=teclado.nextLine();
		return cadena;
	}
	public static int generaAleatorio(int MAXIMO_NUMERO,int MINIMO_NUMERO) {
		int numeroAleatorio;
		Random serieAleatorio=new Random();
		numeroAleatorio=serieAleatorio.nextInt(MAXIMO_NUMERO)+MINIMO_NUMERO;
		return numeroAleatorio;		
	}
	public static boolean esPar(int numero) {
		boolean par;
		if(numero%2==0) {
			par=true;
		}else {
			par=false;
		}
		return par;
	}

}
