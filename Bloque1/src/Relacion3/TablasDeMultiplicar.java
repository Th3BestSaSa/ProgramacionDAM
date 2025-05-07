package Relacion3;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
    	int contador1;
    	int contador2;
    	int resultado;
    	
        for (contador1 = 1; contador1 < 11; contador1++) {
            for (contador2 = 1; contador2 < 11; contador2++) {
                resultado = contador1 * contador2;
                System.out.printf(" %d * %d = %d%n ", contador1, contador2, resultado);
            }
        }
    }
}