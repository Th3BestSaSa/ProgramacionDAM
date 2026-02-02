import java.util.Scanner;
import java.util.Random;

public class TesorosOcultos {
	private static final int NUMERO_TESOROS = 3;
	private static final int INTENTOS = 5;
	private static final int TOTAL_ARRAYS = 20;
	private static Scanner teclado = new Scanner(System.in); 
    public static Random random = new Random();
    
    public static void main(String[] args) {

        int[] terreno = new int[TOTAL_ARRAYS]; 
        int tesorosRestantes = NUMERO_TESOROS;
        int intentos = INTENTOS;

        
        int colocados = 0;
        while (colocados < 3) {
            int tesoro = random.nextInt(20); // número entre 0 y 19
            if (terreno[tesoro] == 0) {
                terreno[tesoro] = 1;  // colocar tesoro
                colocados++;
            }
        }

        tesorosRestantes = juego(terreno, tesorosRestantes, intentos);

        // ------ FINAL DEL JUEGO ------
        if (tesorosRestantes == 0) {
            System.out.println("Has encontrado los 3 tesoros");
        } else {
            System.out.println("Fin del juego.");
        }

    }
	public static int juego(int[] terreno, int tesorosRestantes, int intentos) {
		// ------ JUEGO PRINCIPAL ------
        while (intentos > 0 && tesorosRestantes > 0) {

            int posicion = mostrarTerreno();
            // Validación de rango
            validacionDeEleccion(posicion);

            // ------ COMPROBAR TESORO ------
            if (terreno[posicion] == 1) {
                System.out.println("¡Tesoro encontrado!");
                tesorosRestantes--;

                // Mostrar casilla con T
                for (int i = 1; i <= 20; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i = 0; i < 20; i++) {
                    if (i == posicion) {
                    	System.out.print("T ");
                    }else {
                    	System.out.print("x ");
                    }
                }
                System.out.println();

            } else {
                // ------ COMPROBAR PROXIMIDAD ------
                boolean cerca = false;

                for (int i = posicion - 2; i <= posicion + 2; i++) {
                    if (i >= 0 && i < 20 && terreno[i] == 1) {
                        cerca = true;
                    }
                }

                if (cerca) {
                    System.out.println("No hay tesoro en la posición " + (posicion + 1) +
                                       ", pero hay un tesoro cerca.");
                } else {
                    System.out.println("No hay tesoro en la posición " + (posicion + 1) +
                                       ", tampoco en las proximidades.");
                }
            }

            intentos--;
            System.out.println("Intentos restantes: " + intentos );
        }
		return tesorosRestantes;
	}
	public static void validacionDeEleccion(int eleccion) {
		if (eleccion < 0 || eleccion >= TOTAL_ARRAYS) {
		    System.out.println("Posición inválida.");
		    
		}
	}
	public static int mostrarTerreno() {
		// Mostrar terreno con X
		System.out.println("Tesoros ocultos");
		for (int i = 1; i <= 20; i++) {
		    System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
		    System.out.print("x ");
		}
		System.out.println();

		System.out.print("Elige posición: ");
		int eleccion = teclado.nextInt(); 
		eleccion -=1;
		return eleccion;
	}
}
