package StringBuilderYCadenas;

import java.util.Scanner;

public class PalabrasProhibidas {
    public static void main(String[] args) {
        // Lista de palabras prohibidas
        String[] palabrasProhibidas = {"malo", "prohibido", "ofensivo", "insulto", "robot"};

        // Leer texto del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String texto = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para comparación

        boolean contieneProhibida = false;

        // Verificar si el texto contiene alguna palabra prohibida
        for (String palabra : palabrasProhibidas) {
            if (texto.equals(palabra.toLowerCase())) {
                contieneProhibida = true;
                System.out.println("Se encontró una palabra prohibida: " + palabra);
            }
        }

        if (!contieneProhibida) {
            System.out.println("El texto está limpio. No contiene palabras prohibidas.");
        }

     
    }
}
