import java.util.Scanner; // Necesitamos esta herramienta para leer lo que escribe el usuario

public class Ejercicio1 {
    
    public static Scanner teclado = new Scanner(System.in);

   
    public static void main(String[] args) {

        String textoDelUsuario; // Creamos un espacio para guardar el texto que el usuario va a escribir

        System.out.println("Escribe algo de texto:"); // Pedimos al usuario que escriba
        textoDelUsuario = teclado.nextLine(); // Guardamos lo que el usuario escribió

       
        String textoSinComentarios = textoSinComentarios(textoDelUsuario);
        System.out.println("El texto sin comentarios es: \"" + textoSinComentarios + "\"");

      
        boolean esIgualPrincipioYFin = empiezaYAcabaMismaPalabra(textoSinComentarios);
        System.out.println("¿La primera y última palabra son iguales? " + esIgualPrincipioYFin);

        
    }

    /**
     * Esta función revisa si un texto empieza y acaba con la misma palabra.
     * No le importa si son mayúsculas o minúsculas (por ejemplo, "Hola" y "hola" las considera iguales).
     *
     * @param texto La frase que queremos analizar.
     * @return 'true' si la primera y última palabra son iguales, 'false' si no lo son.
     */
    public static boolean empiezaYAcabaMismaPalabra(String texto) {
       
        String textoLimpio = texto.trim().toLowerCase();

       
        String[] palabras = textoLimpio.split("\\s+");

     
        if (palabras.length == 0 || (palabras.length == 1 && palabras[0].isEmpty())) {
            return false;
        }

       
        String primera = palabras[0];
        
        String ultima = palabras[palabras.length - 1];

        // Comparamos si la primera palabra es EXACTAMENTE igual a la última
        return primera.equals(ultima);
    }

    /**
     * Esta función quita la parte de "comentario" de un texto.
     * El comentario empieza con el primer guion '-' que encuentra y se quita todo lo que va después.
     * Si no hay guion, el texto se queda igual.
     *
     * @param texto La frase original que puede tener un comentario.
     * @return El texto sin el comentario.
     */
    public static String textoSinComentarios(String texto) {
        
        int posicionDelGuion = texto.indexOf('-');

        
        if (posicionDelGuion == -1) {
            return texto;
        } else {
          
            return texto.substring(0, posicionDelGuion).trim();
        }
    }
}

