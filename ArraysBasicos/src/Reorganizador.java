import java.util.Scanner;

public class Reorganizador {
	private static Scanner teclado = new Scanner(System.in); 
    private static final String VOCALES = "aeiouAEIOUáéíóúÁÉÍÓÚ";
    public static void main(String[] args) {
    	String entrada,resultado;

        System.out.print("Introduce una cadena de texto: ");
         entrada = teclado.nextLine();  // Leer la cadena del teclado

         resultado = reorganizarCadena(entrada);
        System.out.println("Cadena reorganizada: " + resultado);

        
    }
    public static String reorganizarCadena(String texto) {
        StringBuilder consonantes = new StringBuilder();
        StringBuilder vocales = new StringBuilder();
        char c;
       
        for (int i = 0; i < texto.length(); i++) {
             c = texto.charAt(i);

            if (c != ' ') { // Eliminamos espacios
                if (VOCALES.indexOf(c) != -1) {
                    vocales.append(c);
                } else {
                    consonantes.append(c);
                }
            }
        }
        
        return consonantes.toString() + vocales.toString();
    }

   
}
