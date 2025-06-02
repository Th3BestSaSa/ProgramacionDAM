package Ejercicio1;
import java.time.Duration;

import java.time.LocalTime;

public class Estacion {

	private String nombreEstacion;
	private String provicia;
	private LocalTime hora;


	public Estacion(String nombreEstacion, String provicia, LocalTime hora) {
		super();
		this.nombreEstacion = nombreEstacion;
		this.provicia = provicia;
		this.hora = hora;
	}

	public String getNombreEstacion() {
		return nombreEstacion;
	}


	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}


	public String getProvicia() {
		return provicia;
	}


	public void setProvicia(String provicia) {
		this.provicia = provicia;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public void incrementarMinutos(long minutos) {
		hora=hora.plus(Duration.ofMinutes(minutos));
	}

	

	public Estacion(String nombreEstacion) {
		super();
		this.nombreEstacion = nombreEstacion;
	}

	@Override
	public String toString() {
		return "Estacion " + nombreEstacion + ", provicia=" + provicia + ", hora=" + hora + "]";
	}



	

	
	
}
