import java.util.Scanner; // Necesitamos esta herramienta para leer lo que escribe el usuario

public class Ejercicio3 {
   
    public static final Scanner teclado = new Scanner(System.in);

  
    private static final String[] MESES = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
                                           "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE",
                                           "NOVIEMBRE", "DICIEMBRE"};

  
    public static void main(String[] args) {
        String mesIngresado; 

        System.out.println("Introduce el nombre de un mes:"); 
        mesIngresado = teclado.nextLine();

        boolean esUnMesValido = esUnMes(mesIngresado);

        System.out.println("¿Es un mes válido? " + esUnMesValido);


    }

    /**
     *
     * @param mes La cadena de texto a comprobar (ej: "enero", "Febrero", "AGOSTO").
     * @return true si la cadena es un mes válido, false en caso contrario.
     */
    public static boolean esUnMes (String mes) {
     
        String mesEnMayusculas = mes.toUpperCase();
        boolean meses= false;
        
        for (String m : MESES) { 
            if (m.equals(mesEnMayusculas)) {
                 meses= true;
        }

     
    }
        return  meses;
}
}