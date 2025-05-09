package Ejemplos;
import java.util.LinkedList;

 public class ComparandoEficiencia {
	 //Prueba a incrementar el numero de vueltas y ya veras la diferencia
	 private static final long NUMERO_VUELTAS = 2000000;



	public static void main(String[] args) {
		
		LinkedList <Integer> lista=new LinkedList<Integer>();
		insertarEnLaListaFinal(lista);
	 
		 verContenido1(lista);
		 verContenido2(lista);
	 }

	private static void insertarEnLaListaFinal(LinkedList<Integer> lista) {
		
		for (int i=1; i< NUMERO_VUELTAS; i++){
			lista.add(i);
		}
		
	}

	private static void verContenido2(LinkedList<Integer> lista) {
		long suma=0;
		long inicio,fin;
		
        inicio = System.currentTimeMillis();
        for (int i=0; i< lista.size(); i++) {
        	suma= suma+  lista.get(i);
        }
   
        fin = System.currentTimeMillis();
        System.out.println("\nTiempo de listar forma 2 +: " + (fin-inicio));
	}
		
	
	
	private static void verContenido1(LinkedList<Integer> lista) {
		long inicio,fin;
		long suma=0;
		
        inicio = System.currentTimeMillis();
        for (Integer entero: lista) {
        	
        	suma= suma+entero;
        }
   
        fin = System.currentTimeMillis();
        System.out.println("\nTiempo de listar con  forma 1 +: " + (fin-inicio));
	}
}



        
