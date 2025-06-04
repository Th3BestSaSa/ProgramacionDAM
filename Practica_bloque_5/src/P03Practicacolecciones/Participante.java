package P03Practicacolecciones;

import java.util.*;

public class Participante {
	private String dni;
	private String nombre;
	private LinkedList<Relato> relatos;

	public Participante(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.relatos = new LinkedList<Relato>();
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void annadirRelato(Relato relato) throws ConcursoException {

	}

	public void eliminarRelatosPuntuacionMenorA5( ) {

	}

	public String listadoRelatosConPuntuacionMayorA8DeGenero(String genero) {
		return null;
	}

	public List<Relato> relatosSeleccionadosParaLaFinalOrdenadosPorPuntuacion () {
		return null;
	}

	
	public double sumaPuntuacionesEnUnGenero(String genero) {
		return 0;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(dni, other.dni);
	}


	
}