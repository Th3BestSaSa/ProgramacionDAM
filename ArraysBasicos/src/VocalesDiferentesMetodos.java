import java.util.Scanner;

public class VocalesDiferentesMetodos {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String texto;
		int cantidad;

		System.out.println("Introduce una palabra o frase:");
		texto = teclado.nextLine().toLowerCase();

		boolean[] vocales = new boolean[5]; // a, e, i, o, u

		marcarVocales(texto, vocales);

		cantidad = contarVocales(vocales);
		System.out.println("Cantidad de vocales diferentes: " + cantidad);

	}

	// Método que marca las vocales presentes en el array
	public static void marcarVocales(String texto, boolean[] vocales) {

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			switch (caracter) {
			case 'a':
				vocales[0] = true;
				break;
			case 'e':
				vocales[1] = true;
				break;
			case 'i':
				vocales[2] = true;
				break;
			case 'o':
				vocales[3] = true;
				break;
			case 'u':
				vocales[4] = true;
				break;
			}
		}
	}

	// Método que cuenta cuántas vocales diferentes aparecieron
	public static int contarVocales(boolean[] vocales) {
		int contador = 0;
		for (boolean contieneVocal : vocales) {
			if (contieneVocal)
				contador++;
		}
		return contador;
	}
}
