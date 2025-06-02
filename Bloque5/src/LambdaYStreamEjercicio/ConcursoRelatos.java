package LambdaYStreamEjercicio;
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
		if(this.participantes.containsKey(p.getDni())) {
			throw new ConcursoException("El participante ya se encuentra inscrito");
		}
		this.participantes.put(p.getDni(), p);		
		
	}
	
	public void eliminarParticipante( Participante p) throws ConcursoException{
		if(!this.participantes.containsKey(p.getDni())) {
			throw new ConcursoException("El participante no se encuentra inscrito");
		}
		this.participantes.remove(p.getDni());
		
	}

	public String listadoParticipantesOrdenadoPorNumeroRelatosSeleccionados() {
		StringBuilder sb = new StringBuilder();
		LinkedList<Participante> lista = new LinkedList<Participante>(this.participantes.values());
		
		Collections.sort(lista);
		
		for (Participante participante : lista) {
			sb.append(participante).append("\n");
		}
	
		return sb.toString();
	}

	public Participante obtenerGanadorPorGenero(String genero) throws ConcursoException {
		Participante participanteGanador=null;
		double sumaNotasGanador=0;
	
		
		for ( Participante participante: this.participantes.values()) {
			try {
				double sumaParticipante=participante.sumaPuntuacionesEnUnGenero(genero);
			
				if ( sumaParticipante> sumaNotasGanador) {
					sumaNotasGanador=sumaParticipante;
					participanteGanador=participante;
				}
			}catch ( ConcursoException e) {
				//No hace falta nada, pasar al siguiente
			}
			
		}
		if (participanteGanador==null) {
			throw new ConcursoException("No se ha encontrado ningún relato de ese genero");
		}
		
		
		return participanteGanador;
		
	}
}