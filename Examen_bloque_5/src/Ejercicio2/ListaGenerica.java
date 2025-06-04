package Ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaGenerica<T> {

	private LinkedList<T> lista;

	public ListaGenerica() {

		lista = new LinkedList<T>();
	}

	public void annadirElemento(T elemento) {
		lista.add(elemento);
	}

	public ListaGenerica<T> listaHastaElemento(T elementoBuscado)  {
		ListaGenerica<T> resultado = new ListaGenerica<T>();

		Iterator<T> iterator = this.lista.iterator();
		Boolean encontrado = false;
		while (iterator.hasNext()) {
			T actual = iterator.next();
			
			if (!encontrado) {
				resultado.annadirElemento(actual);
			}

			if (actual.equals(elementoBuscado)) {
				encontrado = true;
			}
		}
		

//		if (!encontrado) {
//		//	throw new ListaGenericaException("No se ha encontrado el elemento buscado."); // si esta vacio laza																			// EXCEPTIONS
//		//	resultado = null;
//		}

		return resultado;
	}

	@Override
	public String toString() {
		return "ListaGenerica=" + lista;
	}

}
