import java.util.Scanner;

public class Binario {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		String binario=solicitarNumero();
		boolean	esBinario = comprobarBinario(binario);
		if (esBinario) {
			System.out.println("Es binario");
			int numero= calcularDecimal(binario);
			System.out.println("El número " + binario + " en decimal es " + numero);
		}else {
			System.out.println("No es binario");
		}
		
	}
	private static int calcularDecimal(String binario) {
		int decimal = 0;

		for (int i = 0; i < binario.length(); i++) {
		    int digito = binario.charAt(i) - '0';
		    decimal = decimal * 2 + digito;
		}

		return decimal;
	}
	public static boolean comprobarBinario(String binario) {
		boolean esBinario=true;
		for (int i = 0; i < binario.length()&& esBinario; i++) {
			char c=binario.charAt(i);
			if (c != '0' && c != '1') {
                esBinario = false;
            }
		}
		return esBinario;
	}
	public static String solicitarNumero() {
		System.out.println("Introduce un numero en binario");
		return teclado.nextLine();
	}

}
