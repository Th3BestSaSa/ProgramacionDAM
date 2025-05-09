package EjercicioDiccionario;

import java.util.Scanner;

public class Principal {

	private static Scanner teclado=new Scanner(System.in);
	private static final int OPCION_SALIR = 5;

	public static void main(String[] args) {
	
		Diccionario diccionario=new Diccionario();
		int opc;
		
		do {
			opc=mostrarMenu();
			tratarOpciones(opc, diccionario);
		}while (opc!=OPCION_SALIR);
	}

	private static void tratarOpciones(int opc, Diccionario diccionario) {
		String palabra, comienzo, significado;
		
		switch (opc) {
		case 1:
			palabra=teclado.nextLine();
			significado=teclado.nextLine();
			diccionario.annadirEntrada(palabra, significado);
			break;
		case 2:
			
			palabra = solicitarPalabra();
			diccionario.buscarPalabra(palabra);
			break;
		case 3:
			palabra = solicitarPalabra();
			diccionario.borrarPalabra(palabra);
			break;
		case 4:
			comienzo=solicitarPalabra();
			System.out.println(diccionario.listadoPalabrasEmpiecenPor(comienzo));
			break;
		}
		
	}

	/**
	 * TODO Descripción del método.
	 *
	 * @author DAM1
	 * @date 8 may 2025
	 *
	 * @return
	 */
	public static String solicitarPalabra() {
	
		return null;
	}

	private static int mostrarMenu() {
		int opc;
		do {
		System.out.println("1.Añadir palabra");
		System.out.println("2.Buscar palabra en el diccionario");
		System.out.println("3.Borrar palabra en el diccionario");
		System.out.println("4.Listado de palabras que empiecen por..");
		
		opc=Integer.parseInt(teclado.nextLine());
		}while (opc<1 || opc > OPCION_SALIR);
		return opc;
	}

}
