
import java.util.Arrays;
import java.util.Random;

public class Arrays4 {

    private static final int Limite_UltimoDigito = 10;// 0–9
	private static final int NUM_ELEMENTOS = 60;
    private static final int LIMITE_SUPERIOR = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[NUM_ELEMENTOS];
        int[] contadorTerminaciones = new int[Limite_UltimoDigito]; // 0–9
        double suma = 0;

        asignarNumYMedia(random, numeros, contadorTerminaciones, suma);

        int maxRepeticiones = digitoMasCOmun(contadorTerminaciones);

        numeroConMayorTerminaciones(contadorTerminaciones, maxRepeticiones);

        digitosNoAparecen(contadorTerminaciones);

        numerosTerminanEnQueDigito(contadorTerminaciones);
        
        
        System.out.println(Arrays.toString(numeros));
    }

	public static int digitoMasCOmun(int[] contadorTerminaciones) {
		// Determinar el dígito más común en las terminaciones
        int maxRepeticiones = 0;
        for (int rep : contadorTerminaciones) {
            if (rep > maxRepeticiones) {
                maxRepeticiones = rep;
            }
        }
		return maxRepeticiones;
	}

	public static void asignarNumYMedia(Random random, int[] numeros, int[] contadorTerminaciones, double suma) {
		// Generar números aleatorios y registrar terminaciones
        for (int i = 0; i < NUM_ELEMENTOS; i++) {
            numeros[i] = random.nextInt(LIMITE_SUPERIOR + 1); // de 0 a 100
            suma += numeros[i];
            int ultimoDigito = numeros[i] % Limite_UltimoDigito;
            contadorTerminaciones[ultimoDigito]++;
        }

        // Calcular media
        double media = suma / NUM_ELEMENTOS;
        System.out.println("La media de los números leídos es: " + media);
	}

	public static void numeroConMayorTerminaciones(int[] contadorTerminaciones, int maxRepeticiones) {
		System.out.print("El dígitos en el que más números terminan: ");
        for (int i = 0; i < contadorTerminaciones.length; i++) {
            if (contadorTerminaciones[i] == maxRepeticiones) {
                System.out.print(i + " ");
            }
        }
        System.out.println("con " + maxRepeticiones + " apariciones");
	}

	public static void digitosNoAparecen(int[] contadorTerminaciones) {
		// Mostrar los dígitos que no aparecen
        for (int i = 0; i < contadorTerminaciones.length; i++) {
            if (contadorTerminaciones[i] == 0) {
                System.out.println("No hay ningún número que termine en " + i);
            }
        }
	}

	public static void numerosTerminanEnQueDigito(int[] contadorTerminaciones) {
		// Mostrar cuántos números terminan en cada dígito
        System.out.println("\nRepeticiones por dígito:");
        for (int i = 0; i < contadorTerminaciones.length; i++) {
            System.out.println("Dígito " + i + " -> " + contadorTerminaciones[i] + " números");
        }
	}
}
