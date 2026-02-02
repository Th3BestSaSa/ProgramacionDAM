import java.util.Scanner;

public class ContarTiposCaracteres {
	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.print("Introduce una cadena de caracteres: ");
        String texto = teclado.nextLine();

        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        System.out.println("Número de letras mayúsculas: " + mayusculas);
        System.out.println("Número de letras minúsculas: " + minusculas);
        System.out.println("Número de caracteres numéricos: " + numeros);

    }        
}