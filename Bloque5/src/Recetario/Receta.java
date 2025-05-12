package Recetario;

import java.util.*;

public class Receta {
	private String nombreReceta;
	private int minutosDePreparacion;
	private HashSet<Ingrediente> ingredientes;
	private LinkedList<String> pasos;
	
	public Receta(String nombreReceta, int minutosPreparacion) throws RecetaException {
		this.nombreReceta = nombreReceta.toUpperCase();
		setMinutosDePreparacion(minutosPreparacion);
		ingredientes=new HashSet<Ingrediente>();
		pasos=new LinkedList<String>();
	}

	public int getMinutosDePreparacion() {
		return minutosDePreparacion;
	}

	public void setMinutosDePreparacion(int minutosDePreparacion) throws RecetaException {
		if (minutosDePreparacion <=0) {
			throw new RecetaException("Minutos incorrectos");
		}
		this.minutosDePreparacion = minutosDePreparacion;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}
	
	public void annadirPasoAlFinal(String paso) {
		pasos.add(paso.toUpperCase());
	}

	public void annadirIngrediente(Ingrediente ingredienteNuevo) {
		Iterator<Ingrediente> itIngrediente=ingredientes.iterator();
		boolean necesitaIngrediente= false;
		while(itIngrediente.hasNext()&&necesitaIngrediente==false) {
			Ingrediente i =itIngrediente.next();
			if(i.equals(ingredienteNuevo)){
				i.setCantidad(i.getCantidad()+ ingredienteNuevo.getCantidad());
				necesitaIngrediente=true;
			}
		}
		if(necesitaIngrediente==false) {
			ingredientes.add(ingredienteNuevo);
		}
		
	}
	
	public boolean necesitaIngrediente(String nombreIngrediente) {
//		boolean necesitaIngrediente =false;
//		for (Ingrediente i : ingredientes) {
//		        if (i.getNombreIngrediente().equalsIgnoreCase(nombreIngrediente)) {
//		             necesitaIngrediente=true;
//		        }
//		    }
//		    return necesitaIngrediente;
		 return ingredientes.contains(new Ingrediente(nombreIngrediente));
	
	}
	
	public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException{
//		Iterator<Ingrediente> itIngrediente=ingredientes.iterator();
		boolean borrarIngrediente= false;
//		while(itIngrediente.hasNext()&&necesitaIngrediente==false) {
//			Ingrediente i =itIngrediente.next();
//			if(i.equals(ingredienteABorrar)){
//				necesitaIngrediente=true;
		borrarIngrediente=ingredientes.remove(ingredienteABorrar); 
//			}
//		}
//	
		if(borrarIngrediente==false) {
			throw new RecetaException("No se puede borrar");
		}
	
		Iterator<String> itPasos = pasos.iterator();
		while(itPasos.hasNext()) {
			String paso= itPasos.next();
			if(paso.contains(ingredienteABorrar.getNombreIngrediente())) {
				itPasos.remove();
			}
		}
	}
	

	public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException{
		 int num = pasos.indexOf(pasoExistente.toUpperCase());
		    if (num == -1) {
		        throw new RecetaException("Paso existente no encontrado.");
		    }
		    pasos.add(num + 1, pasoNuevo.toUpperCase());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		if (nombreReceta == null) {
			if (other.nombreReceta != null)
				return false;
		} else if (!nombreReceta.equals(other.nombreReceta))
			return false;
		return true;
	}
	
	
	
}
