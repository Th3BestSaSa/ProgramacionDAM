import java.util.Scanner;

public class SumaDeInteger {
	   private static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
    	String frase;
    	System.out.println("Introduce una frase");
        frase = teclado.nextLine();
        StringBuilder sb = new StringBuilder();
        int suma = 0;

        suma = metodos(frase, sb, suma);

        System.out.println( suma);
    }
	public static int metodos(String frase, StringBuilder sb, int suma) {
		for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c); // acumula los dígitos
            } 
            else if (sb.length() > 0) {
                // cuando termina el número, lo convertimos
                int a = Integer.parseInt(sb.toString());
                suma += a;
                sb.delete(0, sb.length()); // limpiamos el StringBuilder
            }
        }

        // Por si el texto termina en número
        if (sb.length() > 0) {
            suma += Integer.parseInt(sb.toString());
        }
		return suma;
	}
}
