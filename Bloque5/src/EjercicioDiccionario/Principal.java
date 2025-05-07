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

		switch (opc) {
		case 1:
			String palabra;
			String significado;
			diccionario.annadirEntrada(palabra, significado);
			System.out.println("Añadir la palabra");
			palabra= teclado.nextLine();
			System.out.println("Añadir la palabra");
			significado=teclado.nextLine();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
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
