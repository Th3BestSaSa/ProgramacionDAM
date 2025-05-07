

public class ProbandoClasesGenericoConString {

	private static final int MAXIMO_ELEMENTOS = 5;

	public static void main(String[] args) throws ArrayException  {
		
		ArrayConHuecosGenerico<String> array=new ArrayConHuecosGenerico<String>(MAXIMO_ELEMENTOS);
		array.annadirElemento("Hola");
		array.annadirElemento("Adios");
		array.annadirElemento("Otro");
		System.out.println("Contendio del array: " + array);
		array.borrarElemento("Adios");
		System.out.println("Array despues de borrar: " + array);
		
		

	}

}