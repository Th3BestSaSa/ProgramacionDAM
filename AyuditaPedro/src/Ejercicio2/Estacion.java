package Ejercicio2;
import java.time.LocalTime;

public class Estacion {

	private String nombre;
	private LocalTime horallegada;
	
	
	public Estacion(String nombre, LocalTime horallegada) {
		super();
		this.nombre = nombre;
		this.horallegada = horallegada;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalTime getHorallegada() {
		return horallegada;
	}


	public void setHorallegada(LocalTime horallegada) {
		this.horallegada = horallegada;
	}


	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", horallegada=" + horallegada + "]";
	}
	
	
	
}
