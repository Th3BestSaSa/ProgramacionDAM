import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo1ColeccionString {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
	
		HashSet<String> conjuntoCiudades= new HashSet<String>();
		Iterator<String> iterador;
		String ciudad;
		
		boolean insertado;
		
		insertado=conjuntoCiudades.add("Sevilla");
		if (insertado) {
			System.out.println("Se ha añadido ");
		}
		insertado=conjuntoCiudades.add("Sevilla");
		insertado=conjuntoCiudades.add("Málaga");
		insertado=conjuntoCiudades.add("Córdoba");
		
		System.out.println("Hay " + conjuntoCiudades.size() + " ciudades");
		
		//Saber si una ciudad esta o no
		System.out.println("Introduce una ciudad a buscar:");
		ciudad= teclado.nextLine();
		
		if ( conjuntoCiudades.contains(ciudad)) {
			System.out.println("Esta en la coleccion");
		}
		else {
			System.out.println("No está en la coleccion");
		}
		for (String string : conjuntoCiudades) {
			
		}
		conjuntoCiudades.remove("Sevilla");
		//devuelve un boolean
		
		
		iterador= conjuntoCiudades.iterator();
		
		
		while (iterador.hasNext()) {
			
			ciudad= iterador.next();
			System.out.println(ciudad);
		}
			
	
	}
}
