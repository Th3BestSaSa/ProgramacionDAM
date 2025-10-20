import java.util.Random;
import java.util.Scanner;

public class Ejercicio5r3 {
	private static final int MAXIMO = 9000;
	private static Scanner teclado = new Scanner(System.in);
	  public static void main(String[] args) {
	  	int numeroScreto;
	  	Random serieAleatoria=new Random();
		
	  	numeroScreto=serieAleatoria.nextInt(MAXIMO) + 1;
	    int numero, intentos=1;
	    do{
	    System.out.println("Introduce el numero secreto");
	    numero=Integer.parseInt(teclado.nextLine());
	     if (numero<0 || numero>MAXIMO) {
			System.out.println("Numero incorecto");
		}
	    if (intentos==5) {
	    	System.out.println("Numero de intentos superado");
		}
	    if (numero == numeroScreto) {
			 System.out.println("Has ganado");
		}
	      
	    intentos++;
	    }while(numero != numeroScreto && intentos<=5);
	    
	    System.out.println("El numero secreto es " + numeroScreto);
	    
	  }
}