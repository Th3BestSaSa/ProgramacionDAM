package Ejercicio1;
import java.util.*;

public class Equipo {
	private String nombreEquipo;
	private HashSet<Alumno> conjuntoAlumnos;

	public Equipo(String nombre) {

	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void insertarAlumno(Alumno nuevoAlumno) throws EquipoException {
		/**
		 * Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el
		 * alumno ya existe en el equipo debe saltar una excepción.
		 */

		if (conjuntoAlumnos.contains(nuevoAlumno)) {
			throw new EquipoException("El alumno ya existe");
		}
		conjuntoAlumnos.add(nuevoAlumno);
	}

	public void borrarAlumno(Alumno alumnoABorrar) throws EquipoException {
		/**
		 * Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
		 * alumno no existe en el equipo debe saltar una excepción.
		 */
		Iterator<Alumno> it= this.conjuntoAlumnos.iterator();
		boolean encontrado= false;
		while (it.hasNext()) {
			Alumno alumno = (Alumno) it.next();
			if (alumno.equals(alumnoABorrar)) {
				it.remove();
				encontrado=true;
			}
			if (!encontrado) {
			    throw new EquipoException("No se ha encontrado el elemento buscado.");
			}

		}
	}

	public Alumno buscarAlumno(Alumno patronAlumnoBuscado) throws EquipoException {
		Alumno alumno = null ;
		/**
		 * Saber si un alumno pertenece al equipo.
		 * Recibe como parámetro el objeto alumno a buscar y 
		 * devuelve null si no lo encuentra y el  objeto alumno si existe.
		 */
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
		if (!encontrado) {
		    throw new EquipoException("No se ha encontrado el elemento buscado.");
		}
		 return alumno;

	}

	/**
	 * Une mi equipo con otro, devolviendo el nuevo equipo creado
	 * 
	 * @param otro   Otro equipo que se va a unir
	 * @param nombre Nombre del nuevo equipo
	 * @return nuevo equipo resultado de unir los dos anteriores
	 */
	public Equipo fusionDeEquipos(Equipo otro, String nombre) {
		//con un iterator complicado, alomejor con un foreach
		return otro;

	}

	/**
	 * Crea un nuevo equipo con los elementos que están en los dos equipos (this y
	 * otro)
	 * 
	 * @param otro   Otro equipo
	 * @param nombre Nombre del nuevo equipo intersección
	 * @return Equipo resultado de la intersección
	 */
	public Equipo intersecionDeEquipos(Equipo otro, String nombre) {
		return otro;

	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Equipo: ").append(nombreEquipo).append("\n");
	    sb.append("Alumnos:\n");
	    for (Alumno alumno : conjuntoAlumnos) {
	        sb.append(" - ").append(alumno.toString()).append("\n");
	    }
	    return sb.toString();
	}


}
