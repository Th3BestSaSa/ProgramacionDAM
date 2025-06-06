package Ejercicio3;

import java.time.LocalDate;

public class VisitaPaginaWeb {

	private String direccion;
	
	public VisitaPaginaWeb(String direccion) throws VisitaPaginaWebException {
		if (direccion==null) {
			throw new VisitaPaginaWebException("Vacio");
		}
		this.direccion=direccion;
		
	}

	public String getDireccion() {
		return direccion;
	}

}
