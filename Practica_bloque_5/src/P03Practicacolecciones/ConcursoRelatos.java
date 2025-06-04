package P03Practicacolecciones;

import java.util.*;

public class ConcursoRelatos {
	private String nombreConcurso;

	private HashMap<String, Participante> participantes;

	public ConcursoRelatos(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
		this.participantes = new HashMap<String, Participante>();
	}
	
	
	public String getNombreConcurso() {
		return nombreConcurso;
	}

	public void setNombreConcurso(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
	}



	public void registrarParticipante(Participante p) throws ConcursoException {
		
		
		
	}
	
	public void eliminarParticipante( Participante p) throws ConcursoException{
		
	}



	public String listadoParticipantesOrdenadoPorNumeroRelatosSeleccionados() {
	
		return null;
	}

	public Participante obtenerGanadorPorGenero(String genero) throws ConcursoException {
		
		return null;
		
	}
}