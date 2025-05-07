package EjercicioDiccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class EntradaDiccionario {

	private String palabra;
	private HashSet<String> listaSignificados;

	public EntradaDiccionario(String palabra, String significado) {
		this.listaSignificados = new HashSet<String>();
		this.palabra = palabra;
//		this.significado=significado;
	}

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @return the listaSignificados
	 */
	public HashSet<String> getListaSignificados() {
		return listaSignificados;
	}

	public void annadirSignificado(String significado) {

	}

	public void borrarPalabra(String palabra) {

	}

	@Override
	public int hashCode() {
		return Objects.hash(palabra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaDiccionario other = (EntradaDiccionario) obj;
		return Objects.equals(palabra, other.palabra);
	}

}
