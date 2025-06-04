import java.util.Scanner; // Necesitamos esta herramienta para leer lo que escribe el usuario

public class Ejercicio2 {
    
    public static final Scanner teclado = new Scanner(System.in);

   
    public static void main(String[] args) {

        System.out.println("Introduce la contraseña anterior:");
        String oldPassword = teclado.nextLine(); 

        System.out.println("Introduce la nueva contraseña:");
        String newPassword = teclado.nextLine(); 

       
        validatePasswordChange(oldPassword, newPassword);

      
    }

    /**
     * Esta función valida si la nueva contraseña cumple con las reglas.
     * Reglas (basadas en el enunciado original):
     * 1. La nueva contraseña debe tener al menos 8 caracteres.
     * 2. La nueva contraseña no debe contener espacios.
     * Si no cumple, imprime un mensaje de error específico.
     *
     * Nota: La "contraseña anterior" no se usa para la validación de la *nueva* contraseña,
     * solo para pedirla, siguiendo los ejemplos del enunciado.
     *
     * @param oldPassword La contraseña anterior (no se usa para validar la nueva en este caso).
     * @param newPassword La nueva contraseña que se va a validar.
     * @return true si la nueva contraseña es válida, false en caso contrario.
     */
    public static boolean validatePasswordChange(String oldPassword, String newPassword) {
       boolean contrasennaCorrecta=false;
        if (newPassword.length() < 8) {
            System.out.println("La nueva contraseña no es válida, no tiene los 8 caracteres mínimos o contiene espacios.");
            contrasennaCorrecta= true; 
        }

        if (newPassword.contains(" ")) {
            System.out.println("La nueva contraseña no es válida, no tiene los 8 caracteres mínimos o contiene espacios.");
             contrasennaCorrecta= false;
        }

       
        System.out.println("Nueva contraseña: Correcta.");
          contrasennaCorrecta= true;
    }

  return contrasennaCorrecta;
}

