import java.util.*;

public class ConcursoRelatos {
	private String nombreConcurso;
	private HashMap<String, Participante> participantes;

	// Constructor
	public ConcursoRelatos(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
		this.participantes = new HashMap<>();
	}

	public String getNombreConcurso() {
		return nombreConcurso;
	}

	public void setNombreConcurso(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
	}

	// Registra un nuevo participante si no está registrado ya
	public void registrarParticipante(Participante p) throws ConcursoException {
		if (this.participantes.containsKey(p.getDni())) {
			throw new ConcursoException("El participante ya se encuentra inscrito");
		}
		this.participantes.put(p.getDni(), p);
	}

	// Elimina un participante si existe
	public void eliminarParticipante(Participante p) throws ConcursoException {
		if (!this.participantes.containsKey(p.getDni())) {
			throw new ConcursoException("El participante no se encuentra inscrito");
		}
		this.participantes.remove(p.getDni());
	}

	// Devuelve un listado de participantes ordenados por número de relatos
	// seleccionados
	public String listadoParticipantesOrdenadoPorNumeroRelatosSeleccionados() {
		StringBuilder sb = new StringBuilder();
		LinkedList<Participante> lista = new LinkedList<>(this.participantes.values());

		Collections.sort(lista); // usa compareTo (relatos seleccionados)

		for (Participante participante : lista) {
			sb.append(participante).append("\n");
		}

		return sb.toString();
	}

	// Devuelve el participante ganador de un género específico
	public Participante obtenerGanadorPorGenero(String genero) throws ConcursoException {
		Participante participanteGanador = null;
		double sumaNotasGanador = 0;

		for (Participante participante : this.participantes.values()) {
			try {
				double sumaParticipante = participante.sumaPuntuacionesEnUnGenero(genero);

				if (sumaParticipante > sumaNotasGanador) {
					sumaNotasGanador = sumaParticipante;
					participanteGanador = participante;
				}
			} catch (ConcursoException e) {
				// Ignorar participante sin relatos seleccionados del género
			}
		}

		if (participanteGanador == null) {
			throw new ConcursoException("No se ha encontrado ningún relato de ese genero");
		}

		return participanteGanador;
	}
}
