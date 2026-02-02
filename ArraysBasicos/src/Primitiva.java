import java.util.Arrays;
import java.util.Random;

public class Primitiva {

	private static final int MAXIMO = 49;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random serieAleatoria=new Random();
		
		int[] primitiva= new int[6];
		 primitiva(serieAleatoria, primitiva);
		 System.out.println(Arrays.toString(primitiva));

	}

	public static void primitiva(Random serieAleatoria, int[] primitiva) {
		for (int i = 0; i < primitiva.length; i++) {
			 int numeroScreto=serieAleatoria.nextInt(1, MAXIMO) + 1;
			 primitiva[i] = numeroScreto;
	         
	        }
	}

}