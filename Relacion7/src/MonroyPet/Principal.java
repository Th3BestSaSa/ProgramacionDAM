package MonroyPet;

import java.util.Scanner;

public class Principal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		MonroyPet mascota1 = new MonroyPet("Ink", "PERRO");
		MonroyPet mascota2 = new MonroyPet("Mielle", "GATO");

		int opcion;
		int minutosTotales = 0;
		System.out.println("  ☆ ☆ ☆  M O N R O Y   P E T  ☆ ☆ ☆");
		System.out.println("");
		System.out.println("        /\\_/\\        /^-----^\\");
		System.out.println("       ( o.o )       V  o o  V");
		System.out.println("        > ^ <         |  Y  |");
		System.out.println("");
		System.out.println("      ¡Cuida, juega y diviértete!");

		do {
			System.out.println("\n--- MENÚ MONROYPET ---");
			System.out.println("1. Dar comida a la mascota");
			System.out.println("2. Comprar comida");
			System.out.println("3. Jugar");
			System.out.println("4. Información de mascotas");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");

			opcion = Integer.parseInt(teclado.nextLine());

			try {
				switch (opcion) {

				case 1:
					System.out.print("¿A qué mascota? (1-2): ");
					int mComida = Integer.parseInt(teclado.nextLine());

					if (mComida == 1) {
						mascota1.darComida();
					}else if (mComida == 2) {
						mascota2.darComida();
					}else {
						System.out.println("Mascota incorrecta");
					}

					break;

				case 2:
					System.out.print("¿A qué mascota? (1-2): ");
					int mCompra = Integer.parseInt(teclado.nextLine());

					System.out.print("Cantidad de comida a comprar: ");
					int cantidad = Integer.parseInt(teclado.nextLine());

					if (mCompra == 1) {
						mascota1.comprarComida(cantidad);
					}else if (mCompra == 2) {
						mascota2.comprarComida(cantidad);
					}else {
						System.out.println("Mascota incorrecta");
					}
					
					break;

				case 3:
					System.out.print("¿Qué mascota va a jugar? (1-2): ");
					int mJugar = Integer.parseInt(teclado.nextLine());

					System.out.print("Minutos de juego: ");
					int minutos = Integer.parseInt(teclado.nextLine());

					if (mJugar == 1){
						mascota1.jugar(minutos);
					}else if (mJugar == 2) {
						mascota2.jugar(minutos);
					}
						
					else {
						System.out.println("Mascota incorrecta");
						break;
					}

					minutosTotales += minutos;

					// CONTROL PARENTAL
					if (minutosTotales > 100) {
						System.out.println("Las mascotas tienen sueño... Se van a dormir ZZZZ");
					}
					break;

				case 4:
					System.out.println("\n--- INFORMACIÓN ---");
					System.out.println("Mascota 1:");
					System.out.println(mascota1);
					System.out.println("\nMascota 2:");
					System.out.println(mascota2);
					break;

				case 5:
					System.out.println("Saliendo del juego...");
					break;

				default:
					System.out.println("Opción no válida");
				}

			} catch (MonroyPetException e) {
				System.out.println("Error: " + e.getMessage());

			}

		} while (opcion != 5);
	}
}