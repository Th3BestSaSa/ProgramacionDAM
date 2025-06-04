package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;


public class Historial {
	ArrayList<VisitaPaginaWeb> historial = new ArrayList<VisitaPaginaWeb>();
	public char[] consultarHistorialPorDia(LocalDate fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	public void borrarHistorial( ) {
//		Iterator<VisitaPaginaWeb> it = this.historial.iterator();
//		while (it.hasNext()) {
//				it.next();
//				it.remove();
//			
//		}
		this.historial.clear();
		// TODO Auto-generated method stub
		
	}

	public void annadirNuevaVisitaPaginaWeb(VisitaPaginaWeb visita) {
		
		historial.add(visita);
	
		
	}

}
