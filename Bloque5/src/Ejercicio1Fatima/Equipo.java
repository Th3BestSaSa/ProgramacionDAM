package Ejercicio1Fatima;


import java.util.*;

public class Equipo {
	private String nombreEquipo;
	private HashSet<Alumno> conjuntoAlumnos;

	public Equipo(String nombre) {

		setNombreEquipo(nombre);
		conjuntoAlumnos = new HashSet<Alumno>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void insertarAlumno(Alumno nuevoAlumno) throws EquipoException {

		boolean insertado;

		insertado=conjuntoAlumnos.add(nuevoAlumno);
		if ( ! insertado)
			throw new EquipoException("No se puede insertar el alumno");
	}

	public void borrarAlumno(Alumno alumnoABorrar) throws EquipoException {

		if (!conjuntoAlumnos.contains(alumnoABorrar))
			throw new EquipoException("No se puede borrar. Ese alumno no está en el equipo");
		conjuntoAlumnos.remove(alumnoABorrar);
	}

	/**
	 * Devuelve una cadena con el listado de los Alumnos
	 * 
	 * @return Cadena con el listado de Alumnos
	 */
	public String listadoDeAlumnos() {
		StringBuilder sb = new StringBuilder();

		for (Alumno a : conjuntoAlumnos) {

			sb.append(a + "\n");
		}
		return sb.toString();
	}
	

	
	public Alumno buscarAlumno(Alumno patronAlumnoBuscado){
		
		Alumno alumnoEncontrado=null;
		boolean encontrado =false;
		Alumno alumnoDeLaColeccion = null;
		
		Iterator<Alumno> iterator= conjuntoAlumnos.iterator();
		while(iterator.hasNext() && !encontrado){
			
			alumnoDeLaColeccion=iterator.next();
			
			if(alumnoDeLaColeccion.equals(patronAlumnoBuscado)){
				alumnoEncontrado=alumnoDeLaColeccion;
				encontrado=true;
			}	
			
			
		}
		return alumnoEncontrado;
	}

	/**
	 * Une mi equipo con otro, devolviendo el nuevo equipo creado
	 * 
	 * @param otro
	 *            Otro equipo que se va a unir
	 * @param nombre
	 *            Nombre del nuevo equipo
	 * @return nuevo equipo resultado de unir los dos anteriores
	 */
	public Equipo fusionDeEquipos(Equipo otro, String nombre) {
		Equipo nuevoEquipo;

		nuevoEquipo = new Equipo(nombre);

		for (Alumno a : this.conjuntoAlumnos) {
			
			nuevoEquipo.conjuntoAlumnos.add(a);

		}
		for (Alumno a : otro.conjuntoAlumnos) {
			
			nuevoEquipo.conjuntoAlumnos.add(a);
			
		}

		return nuevoEquipo;

	}

	/**
	 * Crea un nuevo equipo con los elementos que están en los dos equipos (this
	 * y otro)
	 * 
	 * @param otro
	 *            Otro equipo
	 * @param nombre
	 *            Nombre del nuevo equipo intersección
	 * @return Equipo resultado de la intersección
	 */
	public Equipo intersecionDeEquipos(Equipo otro, String nombre) {
		Equipo nuevoEquipo;

		nuevoEquipo = new Equipo(nombre);

		for (Alumno a : this.conjuntoAlumnos) {

			if (otro.conjuntoAlumnos.contains(a)) {

				nuevoEquipo.conjuntoAlumnos.add(a);
				
			}
		}

		return nuevoEquipo;

	}

	@Override
	public String toString() {
		return "Nombre Equipo: " + nombreEquipo + 
				"\nAlumnos:\n" + listadoDeAlumnos();
	}

}
