package StringBuilderYCadenas;

public class Ej1CorregidoConSplit {

	public static void main(String[] args) {

		String resultado = reducirTextoACantidadPalabras("hola que pasa como estas", 13);
		System.out.println(resultado);

	}



	private static String reducirTextoACantidadPalabras(String texto, int longitudMaxima) {

		StringBuilder resultado = new StringBuilder();
		String[] palabras=texto.split(" ");
		int i=0;
		boolean terminar= false;
		
		while (i< palabras.length && terminar==false) {
			if (resultado.length()+ palabras.length> longitudMaxima) {
				terminar= true;
			}else {
				resultado.append(palabras[i]).append(" ");
				i++;
			}
			if (terminar==true) {
				resultado.append(". . .");
			}
		}
		return resultado.toString();
	}
}
