import java.util.Scanner;
public class Eje3MOdulos {
	
		private static Scanner teclado = new Scanner(System.in);

		public static void main(String[] args) {
			int num, cantidad = 0;
			do {
				System.out.println("Introduce un número");
				num = Integer.parseInt(teclado.nextLine());
			} while (num < 0);
			cantidad = determinarNumCifras(num, cantidad);
			System.out.println(cantidad);
		}
		/**
		 * 
		 * @param num
		 * @param cantidad
		 * @return
		 */
		private static int determinarNumCifras(int num, int cantidad) {
			while (num > 0) {
				num = num / 10;
				cantidad++;
			}
			return cantidad;
		}
	}

