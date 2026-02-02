
public class EjercicioTAblas {
	
	    private static final int MAXIMO_DE_MULTIPLICADORES = 10;
		private static final int MAXIMO_DE_TABLAS = 10;

		public static void main(String[] args) {
	        int numero1, numero2;

	        numero2 = 0;
	       
	        while (numero2 <=MAXIMO_DE_TABLAS) { 
	        	System.out.println("Tabla del "+ numero2);
	            numero1 = 0;
	            tablasMulti(numero1, numero2);
	            numero2 = numero2 + 1;
	        }
	    }

		private static void tablasMulti(int numero1, int numero2) {
			int resultado;
			while (numero1 <= MAXIMO_DE_MULTIPLICADORES) {
			    resultado = numero1 * numero2;
			    System.out.println(numero1 + "x" + numero2 + "=" + resultado);
			    numero1 = numero1 + 1;
         }
		}
	}