/*
 * Realiza un programa que pida la temperatura media (entero) que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con esos datos.
Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Variables
		String[] meses= {"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC",};
		//Inicio Programa
		int[] temperatura=new int[meses.length];
		introduceTemperaturas(meses,temperatura);
		pintaAsteriscos(meses,temperatura);

	}

	private static void pintaAsteriscos(String[] meses, int[] temperatura) {
		for (int i = 0; i < meses.length; i++) {
			System.out.print(meses[i]+" ");
			for (int j = 0; j < temperatura[i]; j++) {
				System.out.print('*');
				
			}
			System.out.println();
		}
		
		
	}

	private static void introduceTemperaturas(String[] meses, int[] temperatura) {
		for (int i = 0; i < meses.length; i++) {
			System.out.println("Introduce la temperatura en "+meses[i]);
			temperatura[i]=Metodos.introducirNumero();
		}
		
	}

}
