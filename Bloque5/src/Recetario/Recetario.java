package Recetario;

import java.util.HashMap;

public class Recetario {

	private HashMap<String, Receta> recetas;
	
	public Recetario() {
		recetas=new HashMap<String,Receta>();
	
	}
	
	public void annadirReceta( Receta nuevaReceta) throws RecetaException {
	    if (recetas.containsKey(nuevaReceta.getNombreReceta())) {
	        throw new RecetaException("Receta ya existente");
	    }
	    recetas.put(nuevaReceta.getNombreReceta(), nuevaReceta);
		
	}
	
	public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
		if(recetas.isEmpty()) {
			 throw new RecetaException("No  hay lista");
		}
		return null;
		
	}
	
	public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException{
		for (Receta receta: recetas.values()) {
			if (receta.necesitaIngrediente(ingrediente)) {
			//	receIngre.add(receta);
			}
		}
		return ingrediente;
		
	}
}