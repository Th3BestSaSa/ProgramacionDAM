import java.util.Scanner;

public class ContarCaracter {
	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String texto;
        char letra ;
        System.out.println("Introducir cadena");
        texto=teclado.nextLine();
        System.out.println("Introducir el caracter");
        letra=teclado.nextLine().charAt(0);
        
        int resultado = contarCaracter(texto, letra);
        System.out.println("El carácter '" + letra + "' aparece " + resultado + " veces.");
    }
 // Método que cuenta cuántas veces aparece un carácter en una cadena
    public static int contarCaracter(String cadena, char caracter) {
        int contador = 0;
        // Convertimos ambos a minúsculas para no distinguir mayúsculas/minúsculas
        cadena = cadena.toLowerCase();
       
        caracter = Character.toLowerCase(caracter);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
}
