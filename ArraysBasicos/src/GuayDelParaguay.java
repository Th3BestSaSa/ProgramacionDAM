

import java.util.Scanner;

public class GuayDelParaguay {
	private static Scanner teclado = new Scanner(System.in); 
    private static final int TAM = 4;   

    public static void main(String[] args) {

        System.out.print("Introduce texto: ");
        String texto = teclado.nextLine();

        if (esGuayDelParaguay(texto))
            System.out.println("Es Guay del Paraguay");
        else
            System.out.println("NO es Guay del Paraguay");
    } 
    public static boolean esGuayDelParaguay(String texto) {
    	 String inicio ;
         String fin;
         boolean b;
        if (texto.length() < TAM * 2) {
        	b= false;
        } 

         inicio = texto.substring(0, TAM);
         fin = texto.substring(texto.length() - TAM);
         b=inicio.equalsIgnoreCase(fin);
        return b;
    }
}
