
import java.util.*;

public class Ahorcado {
	private static Scanner teclado = new Scanner(System.in);
	public static Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabraSecreta[] = { "frigorifico", "lenguaje", "programacion", "entorno" };
		int fallos = 0;
		boolean noQuedanIntentos=false;
		boolean palabraCompleta=false;
		int numeroDeLaPalabraElegida = random.nextInt(0, palabraSecreta.length);
		String palabraElegida = palabraSecreta[numeroDeLaPalabraElegida ];
		StringBuilder sb = new StringBuilder();

		
		for (int i = 0; i < palabraElegida.length(); i++) {
			sb.append("-");
		}
		System.out.println(sb.toString());

		while (!palabraCompleta && !noQuedanIntentos) {
			boolean acierto=false;
			System.out.println("Introduce una letra");
			char c = teclado.nextLine().charAt(0);
			for (int i = 0; i < palabraElegida.length(); i++) {
				if (c == palabraElegida.charAt(i)) {
					sb.setCharAt(i, c);
					acierto=true;

				}

			}
			if (!acierto) {
				fallos++;
				
			}
			if (fallos >= 7) {
			        noQuedanIntentos = true;
			        System.out.println("Te quedaste sin intentos");
			    }
			System.out.println(sb.toString());
			if (sb.toString().equals(palabraElegida)) {
				palabraCompleta=true;
			}

		}
		
	}
}
