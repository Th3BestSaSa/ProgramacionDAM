package StringBuilderYCadenas;

/*Crear un método que reduzca un texto a una cierta cantidad de caracteres sin cortar

palabras. Si no cabe, agregar "..." al final.

*/

public class Ejercicio1 {

	public static void main(String[] args) {

		String resultado = reducirTextoACantidadPalabras("Esto es un texto para probar si funciona", 10);
		System.out.println(resultado);

	}

// segun fatima lo mas facil seria con el split 
	private static String reducirTextoACantidadPalabras(String texto, int cantidadCaracteres) {

		String corte = null;
		if (texto.length() >= cantidadCaracteres) {
			// Corta el texto hasta el límite
			corte = texto.substring(0, cantidadCaracteres);
			// Busca el último espacio para no cortar una palabra
			int ultimoEspacio = corte.lastIndexOf(" ");
			if (ultimoEspacio != -1) { // si hay una sola palabra hace que no salte error, no se puede substring(0,-1)
				corte = corte.substring(0, ultimoEspacio); // substring para quitar las letras sobrantes
			}
			corte = corte.concat("...");
		} else {
			corte = texto;
		}
		return corte;

	}
}