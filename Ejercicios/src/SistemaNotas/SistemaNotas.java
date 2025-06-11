package SistemaNotas;

import java.util.*;
import java.util.stream.Collectors;

import Ejercicio1.Alumno;

public class SistemaNotas {
	private Map<String, Estudiante> mapaPorDni = new HashMap<>();
	private TreeSet<Estudiante> estudiantesPorNombre = new TreeSet<>();

	public void agregarEstudiante(Estudiante estudiante) throws SistemaNotasException {

		boolean insertado = estudiantesPorNombre.add(estudiante);
		if (!insertado) {
			throw new SistemaNotasException("El estudiante con ese DNI ya existe.");
		}
	}

	public List<Estudiante> listarPorNombreConPromedio() {
		return new ArrayList<>(estudiantesPorNombre);
	}

	public List<Estudiante> listarPorPromedioDescendente() {
		return mapaPorDni.values().stream().sorted(Comparator.comparingDouble(Estudiante::calcularPromedio).reversed())
				.collect(Collectors.toList());
	}

	// STREAM y LAMBDA:

	public List<Estudiante> estudiantesConTodoAprobadoOrdenadosPorPromedio() {
		return mapaPorDni.values().stream().filter(Estudiante::todosAprobados)
				.sorted(Comparator.comparingDouble(Estudiante::calcularPromedio).reversed())
				.collect(Collectors.toList());
	}

	public List<Estudiante> estudiantesConExamenAprobado(String nombreExamen) {
		return mapaPorDni.values().stream().filter(e -> e.haAprobadoExamen(nombreExamen))
				.sorted(Comparator.comparing(Estudiante::getNombre)).collect(Collectors.toList());
	}

	public Optional<Estudiante> estudianteConMejorPromedio() {

//		Estudiante alumnoConMayor = null;
//		double notaMayor= -1;
//		for (Estudiante alumno :estudiantesPorNombre ) {
//			notaMayor= alumno.calcularPromedio();
//			alumnoConMayor= alumno;
//			
//		}
//		return alumnoConMayor;

		return mapaPorDni.values().stream().max(Comparator.comparingDouble(Estudiante::calcularPromedio));
	}
}
