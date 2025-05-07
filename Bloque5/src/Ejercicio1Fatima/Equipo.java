package Ejercicio1Fatima;

import java.util.*;

public class Equipo<T> {
	private String nombreEquipo;
	private HashSet<T> conjuntoMiembros;

	public Equipo(String nombre) {

		setNombreEquipo(nombre);
		conjuntoMiembros = new HashSet<T>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void insertarMiembro(T nuevoMiembro) throws EquipoException {

		boolean insertado;

		insertado=conjuntoMiembros.add(nuevoMiembro);
		if ( ! insertado)
			throw new EquipoException("No se puede insertar el alumno");
	}

	public void borrarMiembro(T miembroBorrar) throws EquipoException {

		if (!conjuntoMiembros.contains(miembroBorrar))
			throw new EquipoException("No se puede borrar. Ese alumno no está en el equipo");
		conjuntoMiembros.remove(miembroBorrar);
	}

	/**
	 * Devuelve una cadena con el listado de los Alumnos
	 * 
	 * @return Cadena con el listado de Alumnos
	 */
	public String listadoDeMiembros() {
		StringBuilder sb = new StringBuilder();

		for (T a : conjuntoMiembros) {

			sb.append(a + "\n");
		}
		return sb.toString();
	}
	

	
	public T buscarMiembro(T patronMiembroBuscado){
		
		T miembroEncontrado=null;
		boolean encontrado =false;
		T miembroDeLaColeccion = null;
		
		Iterator<T> iterator= conjuntoMiembros.iterator();
		while(iterator.hasNext() && !encontrado){
			
			miembroDeLaColeccion=iterator.next();
			
			if(miembroDeLaColeccion.equals(patronMiembroBuscado)){
				miembroEncontrado=miembroDeLaColeccion;
				encontrado=true;
			}	
			
			
		}
		return miembroEncontrado;
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
	public Equipo<T> fusionDeEquipos(Equipo<T> otro, String nombre) {
		Equipo<T> nuevoEquipo;

		nuevoEquipo = new Equipo<T>(nombre);

		for (T a : this.conjuntoMiembros) {

			nuevoEquipo.conjuntoMiembros.add(a);

		}
		for (T a : otro.conjuntoMiembros) {

			nuevoEquipo.conjuntoMiembros.add(a);

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
	public Equipo<T> intersecionDeEquipos(Equipo<T> otro, String nombre) {
		Equipo<T> nuevoEquipo;

		nuevoEquipo = new Equipo<T>(nombre);

		for (T a : this.conjuntoMiembros) {

			if (otro.conjuntoMiembros.contains(a)) {

				nuevoEquipo.conjuntoMiembros.add(a);
				
			}
		}

		return nuevoEquipo;

	}

	@Override
	public String toString() {
		return "Nombre Equipo: " + nombreEquipo + 
				"\nAlumnos:\n" + listadoDeMiembros();
	}

}
