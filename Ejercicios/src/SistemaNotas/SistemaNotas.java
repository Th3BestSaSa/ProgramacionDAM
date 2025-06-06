package SistemaNotas;

import java.util.*;
import java.util.stream.Collectors;

public class SistemaNotas {
    private Map<String, Estudiante> mapaPorDni = new HashMap<>();
    private TreeSet<Estudiante> estudiantesPorNombre = new TreeSet<>();

    public void agregarEstudiante(Estudiante estudiante) throws SistemaNotasException {
        if (mapaPorDni.containsKey(estudiante.getDni())) {
            throw new SistemaNotasException("El estudiante con ese DNI ya existe.");
        }
        mapaPorDni.put(estudiante.getDni(), estudiante);
        estudiantesPorNombre.add(estudiante);
    }

    public void agregarNota(String dni, Nota nota) throws SistemaNotasException {
        Estudiante est = mapaPorDni.get(dni);
        if (est == null) {
            throw new SistemaNotasException("Estudiante no encontrado");
        }
        est.agregarNota(nota);
    }

    public double calcularPromedio(String dni) {
        Estudiante est = mapaPorDni.get(dni);
        return est != null ? est.calcularPromedio() : 0;
    }

    public boolean estaTodoAprobado(String dni) {
        Estudiante est = mapaPorDni.get(dni);
        return est != null && est.todosAprobados();
    }

    public List<Estudiante> listarPorNombreConPromedio() {
        return new ArrayList<>(estudiantesPorNombre);
    }

    public List<Estudiante> listarPorPromedioDescendente() {
        return mapaPorDni.values().stream()
                .sorted(Comparator.comparingDouble(Estudiante::calcularPromedio).reversed())
                .collect(Collectors.toList());
    }

    // STREAM y LAMBDA:

    public List<Estudiante> estudiantesConTodoAprobadoOrdenadosPorPromedio() {
        return mapaPorDni.values().stream()
                .filter(Estudiante::todosAprobados)
                .sorted(Comparator.comparingDouble(Estudiante::calcularPromedio).reversed())
                .collect(Collectors.toList());
    }

    public List<Estudiante> estudiantesConExamenAprobado(String nombreExamen) {
        return mapaPorDni.values().stream()
                .filter(e -> e.tieneExamenAprobado(nombreExamen))
                .sorted(Comparator.comparing(Estudiante::getNombre))
                .collect(Collectors.toList());
    }

    public Optional<Estudiante> estudianteConMejorPromedio() {
        return mapaPorDni.values().stream()
                .max(Comparator.comparingDouble(Estudiante::calcularPromedio));
    }
}
