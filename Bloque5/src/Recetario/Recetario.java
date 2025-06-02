package Recetario;

import java.util.*;

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
		//isEmpty = size() ==0
		if(recetas.isEmpty()) {
			 throw new RecetaException("No  hay lista");
		}
		TreeSet <Receta> recetasOrdenadas =new TreeSet <Receta>(recetas.values());
		StringBuilder sb= new StringBuilder();
		
		for (Receta receta : recetasOrdenadas) {
			sb.append(receta);
		}
		return sb.toString();
	}
	
	public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException{
		if(recetas.isEmpty()) {
			 throw new RecetaException("No  hay lista");
		}
		
		ArrayList<Receta> recetasOrdenadas =new ArrayList<Receta>();
		StringBuilder sb= new StringBuilder();
		for (Receta receta : recetasOrdenadas) {
			if (receta.necesitaIngrediente(ingrediente)) {
				recetasOrdenadas.add(receta);
			}
			
		}
		Collections.sort(recetasOrdenadas, new Comparator<Receta>() {
	
			@Override
			public int compare(Receta o1, Receta o2) {
				return Integer.compare(o1.getMinutosDePreparacion(), o2.getMinutosDePreparacion());
			}
		});
		for (Receta receta : recetasOrdenadas) {
			sb.append(receta);
		}
		return sb.toString();
	}

	public Receta recetaMasRapida() {
		Receta recetaMasRapida= null;
		recetaMasRapida= recetas.values().stream()
				.min((r1,r2) -> Integer.compare(r1.getMinutosDePreparacion(), r2.getMinutosDePreparacion())).get();
		return recetaMasRapida;
		
	}
}
