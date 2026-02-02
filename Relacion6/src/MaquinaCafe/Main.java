package MaquinaCafe;

import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina maquina;
		double monedero;
		int opcion;
		monedero = solicitarDinero("Introduce la cantidad inicial del monedero: ");
		maquina = new Maquina(monedero);

		do {
			opcion = mostrarMenuCafes();
			tratarMenuCafes(maquina, opcion);
		} while (opcion != 5);
		mostrarMenuCafes();
		tratarMenuCafes(maquina, opcion);
	}

	private static int mostrarMenuCafes() {
		// TODO Auto-generated method stub
		int opcion;
		do {
			System.out.println("_______MAQUINA DE CAFE_______ <3");
			System.out.println("1. Servir café solo (1 euro)");
			System.out.println("2. Servir leche (0,8 euros)");
			System.out.println("3. Servir café con leche (1,5 euros)");
			System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero");
			System.out.println("5. Apagar máquina y salir");
			opcion = Integer.parseInt(teclado.nextLine());

		} while (opcion < 1 || opcion > 5);
		return opcion;

	}

	private static double solicitarDinero(String mensaje) {

		String cadena;
		double monedero;

		System.out.println(mensaje);
		cadena = teclado.nextLine();
		monedero = Double.parseDouble(cadena);

		return monedero;
	}

	private static void mostrarCambio(double cambio) {
		if (cambio > 0) {
			System.out.printf("Recoge tu cambio %.2f", cambio);
		}
	}
	
	private static void tratarMenuCafes(Maquina maquina, int opcion) {
		// TODO Auto-generated method stub
		double dinero;
		double cambio = 0;
		switch (opcion) {
		case 1:
			dinero = solicitarDinero("Introduce el dinero para el café solo: ");
			cambio = maquina.servirCafe(dinero);
			mostrarCambio(cambio);
			break;
		case 2:
			dinero = solicitarDinero("Introduce el dinero para la leche: ");
			cambio = maquina.servirLeche(dinero);
			mostrarCambio(cambio);
			break;
		case 3:
			dinero =solicitarDinero("Introduce el dinero para el café con leche: ");
			cambio = maquina.servirCafeconLeche(dinero);
			mostrarCambio(cambio);
			break;
		case 4:
			System.out.println(maquina);
		}
	}
}