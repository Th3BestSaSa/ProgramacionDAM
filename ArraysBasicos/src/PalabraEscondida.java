import java.util.Scanner;
public class PalabraEscondida {
	

	private static Scanner teclado = new Scanner(System.in);
	    public static void main(String[] args) {
	        
	    	String cadena,palabraAencontrar;
	        System.out.print("Introduce frase: ");
	        cadena = teclado.nextLine();

	        System.out.print("Palabra escondida: ");
	        palabraAencontrar = teclado.nextLine();

	        buscarPalabra(cadena, palabraAencontrar);

	        
	    }
		public static void buscarPalabra(String texto, String palabra) {
			int j = 0; // índice para recorrer la palabra

	        for (int i = 0; i < texto.length() && j < palabra.length(); i++) {
	            if (texto.charAt(i) == palabra.charAt(j)) {
	                j++;
	            }
	        }

	        if (j == palabra.length()) {
	            System.out.println("Encontrada");
	        } else {
	            System.out.println("No se encuentra");
	        }
		}
	}


