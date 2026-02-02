package ExamenBloque2;

import java.util.Scanner;

public class Ejercicio1 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();
		
		esDigitalPalindromo(cadena);
		String cadena2;
		System.out.println("Introduce un numero de telefono");
		cadena2 = teclado.nextLine();
		boolean esCorrecto = esTelefonoCorrecto(cadena2);
		if (esCorrecto) {
			System.out.println("Es valido");
		} else {
			System.out.println("Es invalido");
		}
		String m=obtenerCodigo("Su código es @1234#. No debe confundir con el código 666");
		System.out.println(m);
	}

	
	private static boolean esTelefonoCorrecto(String cadena2) {
		// TODO Auto-generated method stub
		boolean esCorrecto = true;

		if (cadena2.startsWith("+34")) {
			String sinPrefijo = cadena2.substring(3);
			if (sinPrefijo.length() == 9) {
				for (int i = 0; i < sinPrefijo.length() && esCorrecto; i++) {
					if (!Character.isDigit(sinPrefijo.charAt(i))) {
						esCorrecto = false;
					}
				}
			}

		}

		return esCorrecto;
	}

	private static void esDigitalPalindromo(String cadena) {
		// TODO Auto-generated method stub
		boolean esPalindormo = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isDigit(c)) {
				sb.append(c);
			}
		}
		for (int i = 0; i < sb.length(); i++) {
			for (int j = sb.length() - 1; j > 0; j--) {
				if (sb.charAt(i) == sb.charAt(j)) {
					esPalindormo = true;
				}
			}
		}
		if (esPalindormo) {
			System.out.println("Es palindormo");
		} else {
			System.out.println("No es palindormo");
		}

	}
	public static String obtenerCodigo(String mensaje) {
	    String resultado = "";

	    if (mensaje != null) {
	        int inicio = mensaje.indexOf('@');
	        int fin = mensaje.indexOf('#');

	        if (inicio != -1 && fin != -1 && inicio < fin) {
	            String posibleCodigo = mensaje.substring(inicio + 1, fin);
	            boolean soloNumeros = true;

	            for (int i = 0; i < posibleCodigo.length(); i++) {
	                if (!Character.isDigit(posibleCodigo.charAt(i))) {
	                    soloNumeros = false;
	                }
	            }

	            if (soloNumeros) {
	                resultado = posibleCodigo;
	            }
	        }
	    }

	    return resultado;
	}


}
