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
//SEGUN GEMINI ESTO NO EVUELVE NULO
	public ListaGenerica<T> listaHastaElemento( T elementoBuscado) throws ListaGenericaException {
		ListaGenerica<T> resultado = new ListaGenerica<T>();
		Iterator<T> it = this.lista.iterator();
		Boolean encontrado = false;
		while(it.hasNext()) {
			T actual= it.next();
			 if(!encontrado){
	            	resultado.annadirElemento(actual);
	            }
	            
	            if(actual.equals(elementoBuscado)){
	            	encontrado = true;
	            }
	            if (!encontrado) {
	            	throw new ListaGenericaException ("No se encuentra el elemento");
				}
		}
		return resultado;
	}


	

	@Override
	public String toString() {
		return "ListaGenerica=" + lista ;
	}
	
	
	
}
