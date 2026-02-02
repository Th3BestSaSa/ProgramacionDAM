import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JuegoMagosV2 {

    private static final int VALOR_DEL_ARRAY = 10;
    private static final int VIDA_MAXIMA = 50;
    private static Scanner teclado = new Scanner(System.in); 
    public static Random random = new Random();
    public static String[] nombreHechizos = {"Tornado de Fuego", "Mano Celestial", "Gran Tornado", "Remate del Dragón","Tormenta de Fuego", "Pegaso Alado", "Tsunami Gigante", "Tiro del Halcón","Llamarada Explosiva", "Super Nova"
    };
    public static void main(String[] args) {

        int vidaJugador = VIDA_MAXIMA;
        int vidaCPU = VIDA_MAXIMA;

       

        int[] hechizosJugador = new int[VALOR_DEL_ARRAY];
        int[] hechizosCPU = new int[VALOR_DEL_ARRAY];

        hechizos(hechizosJugador, hechizosCPU);
        luchaEntreCPUyJugador(vidaJugador, vidaCPU, nombreHechizos, hechizosJugador, hechizosCPU);
    }

    public static void luchaEntreCPUyJugador(int vidaJugador, int vidaCPU, String[] nombres, int[] hechizosJugador, int[] hechizosCPU) {
    	int cpuEleccion,eleccion,dañoJugador,dañoCPU ;
        while (vidaJugador > 0 && vidaCPU > 0) {
            System.out.println("Vida del jugador: " + vidaJugador);
            System.out.println("Vida de la CPU: " + vidaCPU);

             eleccion = validacionHechizosJugador(nombres);

             cpuEleccion = random.nextInt(VALOR_DEL_ARRAY);
            System.out.println("La CPU ha elegido: " + nombres[cpuEleccion]);

             dañoJugador = hechizosJugador[eleccion];
             dañoCPU = hechizosCPU[cpuEleccion];

            if (dañoJugador > dañoCPU) {
                System.out.println("CPU pierde "+dañoJugador+" puntos.");
                vidaCPU -= dañoJugador;
            } else if (dañoCPU > dañoJugador) {
            	System.out.println("Jugador pierde "+dañoCPU+" puntos.");
                vidaJugador -= dañoCPU;
            } else {
                System.out.println("Empate, nadie pierde puntos.");
            }
        }

        if (vidaJugador <= 0) {
            System.out.println("La CPU gana la batalla");
        } else {
            System.out.println("El jugador gana la batalla");
        }
    }

   
    public static int validacionHechizosJugador(String[] nombresHechizos) {
        
       
        int indiceHechizo = -1; 
        boolean hechizoValido = false; 

        while (!hechizoValido) {
            System.out.println("Elige tu hechizo por nombre:");
            System.out.println(Arrays.toString(nombresHechizos));
           

            String entrada = teclado.nextLine();

            for (int i = 0; i < nombresHechizos.length; i++) {
                if (nombresHechizos[i].equals(entrada)) {
                    indiceHechizo = i; 
                    hechizoValido = true; 
                }
            }

            if (!hechizoValido) {
                System.out.println("Hechizo no válido. Intenta otra vez.");
            }
        }
       
        return indiceHechizo; 
    }


    public static void hechizos(int[] hechizosJugador, int[] hechizosCPU) {
        for (int i = 0; i < hechizosJugador.length; i++) {
            // Genera valores entre 1 y 20 (inclusive)
            hechizosJugador[i] = random.nextInt(20) + 1; 
            hechizosCPU[i] = random.nextInt(20) + 1;
        }
    }

}