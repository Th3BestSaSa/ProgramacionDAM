package Ejercicio3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;


import Ejercicio1.Alumno;


public class Historial {
	private ArrayList<Historial> historialBusquedas = new ArrayList<>();
	public Historial() {
		super();
		this.historialBusquedas = historialBusquedas;
		this.fecha = fecha;
	}

	private LocalDate fecha;
	
	public void annadirNuevaVisitaPaginaWeb(VisitaPaginaWeb visita,ArrayList<Historial> historialBusquedas) {
		if(visita!= null) {
			
		}
		
	}

	public String consultarHistorialPorDia(LocalDate fecha) {
	
		return null;
	}

	public void borrarHistorial() {
		
		
	}

}


