package Ejercicio1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Trayecto {

	private String codigoTrayecto;
	private String tipoTren;
	private double precio;
	
	private LinkedList<Estacion>  recorrido;
	
	
	public Trayecto (String codigoTrayecto, Estacion origen, Estacion destino, String tipoTren, double precio) {
		
		this.codigoTrayecto=codigoTrayecto;
		this.tipoTren=tipoTren;
		this.precio=precio;
		recorrido=new LinkedList<Estacion>();
		recorrido.add(origen);
		recorrido.add(destino);
	}
	
	
	public String getCodigoTrayecto() {
		return codigoTrayecto;
	}


	public void setCodigoTrayecto(String codigoTrayecto) {
		this.codigoTrayecto = codigoTrayecto;
	}



	public String getTipoTren() {
		return tipoTren;
	}


	public void setTipoTren(String tipoTren) {
		this.tipoTren = tipoTren;
	}
	

	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public Estacion getPrimeraEstacionDelRecorrido() {
		
		return recorrido.get(0);
	}
	
	public Estacion getUltimaEstacionDelRecorrido() {
		
		return recorrido.get(recorrido.size() -1);
	}


	//TODO
	public void retrasoEnEstacion (String nombreEstacion, int minutos) throws TrenException {
			Iterator<Estacion> it = this.recorrido.iterator();
			Boolean encontrado = false;
			
			while (it.hasNext()) {
				Estacion actual = it.next();
				if(actual.getNombreEstacion().equals(nombreEstacion)|| encontrado) {
					encontrado = true;
					actual.incrementarMinutos(minutos);
				}
				
			}
			if (!encontrado){
				throw new TrenException("Error, estacion no encontrada");
			}			
			
	}
		
	
	//TODO
	public void eliminarDesdeEstacionAlFinal (String nombreEstacionDesde) throws TrenException {
		Iterator<Estacion> it = this.recorrido.iterator();
		Boolean encontrado = false;
		
		while (it.hasNext()) {
			Estacion actual = it.next();
			if(actual.getNombreEstacion().equals(nombreEstacionDesde)|| encontrado) {
				encontrado = true;
				it.remove();
			}
			
		}
		if (!encontrado){
			throw new TrenException("Error, estacion no encontrada");
		}
	}

	//TODO
	public HashSet<String> conjuntoNombreEstacionesProvincia (String provincia){
		Iterator<Estacion> it = this.recorrido.iterator();
		var resultado= new HashSet<String>();
		while (it.hasNext()) {
			Estacion actual = it.next();
			if(actual.getProvicia().equals(provincia)) {
				resultado.add(actual.getProvicia());
				
			}
			
		}
		
		return resultado;
	}

	//TODO
	public void annadirNuevaEstacionDetrasDeOtra(String nombreEstacionBase, Estacion nuevaEstacion ) throws TrenException{
		Estacion estacionBase=null;
		Iterator<Estacion> it = this.recorrido.iterator();
		while (it.hasNext()) {
			Estacion actual = it.next();
			if(actual.getNombreEstacion().equals(nuevaEstacion.getNombreEstacion())) {
				throw new TrenException("Estacion ya existente, en el recocriido");
			}
			if(actual.getHora().compareTo(nuevaEstacion.getHora()) > 0){
        		throw new TrenException("La hora de la estación base no debe ser mayor que la de la nueva.");
			}
        	estacionBase = actual;
        }
	
  
    if(estacionBase == null){
        throw new TrenException("No se ha encontrado la estación base.");
    }
    
    this.recorrido.add(this.recorrido.indexOf(estacionBase) + 1, nuevaEstacion);
		
}
	
	public Integer numeroDeEstaciones() {
		return recorrido.size();
	}
		
		
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoTrayecto);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trayecto other = (Trayecto) obj;
		return Objects.equals(codigoTrayecto, other.codigoTrayecto);
	}



	@Override
	public String toString() {
		return "Trayecto [codigoTrayecto=" + codigoTrayecto + ", tipoTren=" + tipoTren ;
	}

	
}
