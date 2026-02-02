import java.util.*;

public class JuegoMagos {
	private static final int VALOR_DEL_ARRAY = 10;
	private static final int VIDA_MAXIMA = 50;
	private static Scanner teclado = new Scanner(System.in);
	public static Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vidaJugador = VIDA_MAXIMA;
		int vidaCPU = VIDA_MAXIMA;

		int[] hechizosJugador = new int[VALOR_DEL_ARRAY];
		int[] hechizosCPU = new int[VALOR_DEL_ARRAY];

		hechizos(hechizosJugador, hechizosCPU);

		luchaEntreCPUyJugador(vidaJugador, vidaCPU, hechizosJugador, hechizosCPU);
	}

	public static void luchaEntreCPUyJugador(int vidaJugador, int vidaCPU, int[] hechizosJugador, int[] hechizosCPU) {
		int eleccion, cpuEleccion, dañoJugador, dañoCPU;
		while (vidaJugador > 0 && vidaCPU > 0) {
			System.out.println("Vida del jugador: " + vidaJugador);
			System.out.println("Vida de la CPU: " + vidaCPU);

			eleccion = validacionHechizosJugador();

			cpuEleccion = random.nextInt(VALOR_DEL_ARRAY) + 1;
			System.out.println("La CPU ha elegido el " + cpuEleccion);

			dañoJugador = hechizosJugador[eleccion - 1];
			dañoCPU = hechizosCPU[cpuEleccion - 1];

			if (dañoJugador > dañoCPU) {
				System.out.println("CPU pierde 10 puntos.");
				vidaCPU -= 10;
			} else if (dañoCPU > dañoJugador) {
				System.out.println("Jugador pierde 10 puntos.");
				vidaJugador -= 10;
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

	public static int validacionHechizosJugador() {
		System.out.print("Elige tu hechizo (1-10): ");
		int eleccion = Integer.parseInt(teclado.nextLine());

		if (eleccion < 1 || eleccion > VALOR_DEL_ARRAY) {
			System.out.println("Hechizo inválido. Elige un número del 1 al 10.");

		}
		return eleccion;
	}

	public static void hechizos(int[] hechizosJugador, int[] hechizosCPU) {
		// Generar el daño de los hechizos
		for (int i = 0; i < hechizosJugador.length; i++) {
			hechizosJugador[i] = random.nextInt(1, 20) + 1;
			hechizosCPU[i] = random.nextInt(1, 20) + 1;
		}
	}
}
