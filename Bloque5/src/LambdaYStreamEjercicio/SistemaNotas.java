package LambdaYStreamEjercicio;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SistemaNotas {

	private TreeSet<Estudiante> estudiantes;

	public SistemaNotas() {
		estudiantes = new TreeSet<Estudiante>();
	}

	public void agregarEstudiante(Estudiante estudiante) throws EstudianteException {
		boolean annadido;
		annadido=estudiantes.add(estudiante);
		if (!annadido) {
			throw new EstudianteException("No se puede añadir al estudiante porque ya existe otro con  ese DNI" + estudiante.getDni() );
		}
	}
	
	private Estudiante encontrarAlumno(String dniEstudiante) {
		
		boolean encontrado = false;
		
		Estudiante alumno = null;
		Iterator <Estudiante> itr = estudiantes.iterator();
		
		while (itr.hasNext() && !encontrado) {
			
			alumno = (Estudiante) itr.next();
			if(alumno.getDni().equals(dniEstudiante)) {
				encontrado = true;
			}
			
		}
		
		return alumno;
	}
	
	public void annadirNotaAEstudiante(Double nota, String dniEstudiante) throws EstudianteException {
		
		Estudiante alumno = encontrarAlumno(dniEstudiante);
		
		alumno.agregarNota(nota);
	}
	
	public String toStringOrdernadoEstudiantesPorMedia() throws EstudianteException {
		
		ArrayList<Estudiante> listaOrdenadaMedia = new ArrayList<Estudiante>(estudiantes);
		
		Collections.sort(listaOrdenadaMedia, new ComparadorPorMedia());
		
		StringBuilder sb  = new StringBuilder();
		
		for (Estudiante estudiante : listaOrdenadaMedia) {
			sb.append(estudiante).append("\n");
		}
		
		return sb.toString();
	}

	@Override
	public String toString() { // Estará ya ordenado por el orden natural del TreeSet que es el nombre
		
		StringBuilder sb  = new StringBuilder();
		
		for (Estudiante estudiante : estudiantes) {
			sb.append(estudiante).append("\n");
		}
		
		return sb.toString();
		
	}

}
