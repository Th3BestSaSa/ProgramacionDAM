package Ejemplos;
import java.util.Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import java.util.LinkedList;


public class CreandoUnaColeccionAPartirDeOtra {
	public static void main(String[] args) {
		//Creamos un HashSet
		HashSet<Persona> conjuntoPersonas = new HashSet<Persona>();
	
		conjuntoPersonas.add(new Persona("11", "Pepe"));
		conjuntoPersonas.add(new Persona("22", "Pepa"));
		conjuntoPersonas.add(new Persona("33", "Pepita"));

		//Creamos un linkedList a partir del HashSet
		
		LinkedList<Persona>  listaPersonas=new LinkedList<Persona>(conjuntoPersonas);
		
		//Lo podemos ordenar
		
		Collections.sort(listaPersonas, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre()) ;
			}
			
		});
	
		
		//Al cambiar uno de los objetos, cambia en los dos, es el mismo
		//objeto en ambas colecciones
		listaPersonas.get(0).setNombre("TEN CUIDADO CAMBIA EN LOS DOS");
	
		
		System.out.println("HashSet");
		mostrarColeccionConFor(conjuntoPersonas);

		System.out.println("Lista");
		mostrarColeccionConFor(listaPersonas);

	}

	private static <T> void mostrarColeccionConFor(Collection<T> conjuntoPersonas) {

		for (T persona : conjuntoPersonas) {
			System.out.println(persona);
		}

	}

//	private static void mostrarColeccionUsandoIterador(HashSet<Persona> conjuntoPersonas) {
//		Iterator<Persona> iterador;
//		Persona persona;
//		iterador = conjuntoPersonas.iterator();
//
//		while (iterador.hasNext()) {
//			persona = iterador.next();
//			System.out.println(persona);
//		}
//	}



}
