import java.util.*;

public class ParesImparesArrays {

	private static final int NUMERO_MAXIMO_RANDOM = 101;

	public static void main(String[] args) {
		
		Random serieAleatoria = new Random();
		int[] numeros = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = serieAleatoria.nextInt(NUMERO_MAXIMO_RANDOM);
		}

		int[] pares = new int[numeros.length];
		int[] impares = new int[numeros.length];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				par++;
				pares[par] = numeros[i];
			} else {
				impar++;
				impares[impar] = numeros[i];
			}
		}

		int i = 0;
		
		for (int j = 0; j < par; j++) {
			i++;
			numeros[i] = pares[j];
		}
		
		for (int j = 0; j < impar; j++) {
			i++;
			numeros[i] = impares[j];
		}

		System.out.println("Array con pares primero y luego impares:");
		System.out.println(Arrays.toString(numeros));
	
	}

}
