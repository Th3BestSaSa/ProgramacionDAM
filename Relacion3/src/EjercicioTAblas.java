
public class EjercicioTAblas {
	
	    public static void main(String[] args) {
	        int numero1, numero2, resultado;

	        numero2 = 0;
	        resultado = 0;
	        while (numero2 <=10) { System.out.println("Tabla del "+ numero2);
	            numero1 = 0;
	            while (numero1 <= 10) {
	                resultado = numero1 * numero2;
	                System.out.println(numero1 + "x" + numero2 + "=" + resultado);
	                numero1 = numero1 + 1;
	           }
	            numero2 = numero2 + 1;
	        }
	    }
	}