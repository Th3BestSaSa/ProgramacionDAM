/**
 * 
 */
package Ejercicio3Otro;

import java.util.HashSet;

/**
 * TODO Descripción de la clase Usuario.
*
* @author DAM1
* @date 7 may 2025
 */
public class Usuario {
public String nombre;
public HashSet<Prestamo> librosPrestados;
public Usuario(String nombre, HashSet<Prestamo> librosPrestados) {
	super();
	this.nombre = nombre;
	this.librosPrestados =  new  HashSet<Prestamo>();;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @return the librosPrestados
 */
public HashSet<Prestamo> getLibrosPrestados() {
	return librosPrestados;
}
public void prestarLibro(Libro libro) {
	
}
public void devolverLibro(Libro libro) {
	
}

}
