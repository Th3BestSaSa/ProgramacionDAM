package Ejercicio3;

import java.time.LocalDate;
import java.util.*;


public class Historial {
	ArrayList<VisitaPaginaWeb> historial = new ArrayList<VisitaPaginaWeb>();
	

	public char[] consultarHistorialPorDia(LocalDate fecha) {
		 StringBuilder sb = new StringBuilder();

	        for (VisitaPaginaWeb visita : historial) {
	            if (visita.getFecha().equals(fecha)) {
	                sb.append(visita.toString()).append("\n");
	            }
	        }

	        return sb.toString().toCharArray();
	}

	public void borrarHistorial( ) {
		Iterator<VisitaPaginaWeb> it = this.historial.iterator();
		while (it.hasNext()) {
				it.next();
				it.remove();
			
		}
	}

	public void annadirNuevaVisitaPaginaWeb(VisitaPaginaWeb visita) {
		historial.add(visita);
		
	}

}
