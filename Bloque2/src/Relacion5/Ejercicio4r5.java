package Relacion5;
	import java.util.*;
public class Ejercicio4r5 {



		private static final int CANTIDAD_NUMEROS_GENERAR= 60;
		private static final int MAXIMO = 101;

		public static void main(String[] args) {
			
		double media = Ejercicio4r5.sacarMedia();
	//	int numeroDeCifras = Ejercicio4r5.digitoNumerosTerminan();	
		}	
		
		private static double sacarMedia ()  {
		// La media de los números leídos.
			int[] vector;
			double media;
			double suma = 0;
			
			vector = new int [CANTIDAD_NUMEROS_GENERAR];
			Random serieAleatoria=new Random();
			for (int i = 0; i < vector.length; i++) {
				vector[i]=serieAleatoria.nextInt(MAXIMO) + 1;
			}
			System.out.println(Arrays.toString(vector));
			
			
			for (int i = 0; i < vector.length; i++) {
				vector[i]=serieAleatoria.nextInt(MAXIMO) + 1;
				suma =vector[i] + suma;
				
			}
			media= suma/CANTIDAD_NUMEROS_GENERAR;
			System.out.println(media);
			return media;
			
		}
//		private static int digitoNumerosTerminan (int[] vector) {
//			//El dígito en el que más números terminan.
//			int i = 0;
//			int finalNumero =vector[i];
//			int numeroDeCifras = 0;
//			
//			 for (i = 0; i < vector.length; i++) {
//				 for (int j = 0; j < vector.length; j++) {
//					 i = vector[j];
//					System.out.println(Arrays.toString(vector)); 
//					numeroDeCifras = numeroDeCifras +1;
//					finalNumero = vector[i] % 10;	
//				 }
//// falta parte del codigo
//	numeroDeCifras = numeroDeCifras +1;
//	finalNumero = vector[i] / 10;	
//				}
//			return numeroDeCifras;
//				

	}


