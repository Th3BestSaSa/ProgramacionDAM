import java.util.Objects;

public class Vuelo {
	private static final int PRECIO_MINIMO = 50;
	private static final int LONGITUD_CODIGO = 5;
	private String codigo;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private int numPlazas;
	private double precio;
	private int numeroPlaza=0;
	/**
	 * @param codigo
	 * @param origen
	 * @param destino
	 * @param numPlazas
	 * @param precio
	 * @throws MonroyFlightException 
	 */
	public Vuelo(String codigo, Aeropuerto origen, Aeropuerto destino, int numPlazas, double precio) throws MonroyFlightException {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.setNumPlazas(numPlazas);
		this.precio = PRECIO_MINIMO;
		this.numeroPlaza=0;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws MonroyFlightException {
		if(codigo.length()!=LONGITUD_CODIGO) {
			throw new MonroyFlightException("La longitud del código debe ser "+ LONGITUD_CODIGO);
		}
		this.codigo = codigo;
	}
	
	
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) throws MonroyFlightException {
		if (numPlazas<100 || numPlazas>200) {
			throw new MonroyFlightException("No existe un avion con ese numero de plazas");
		}
		this.numPlazas = numPlazas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) throws MonroyFlightException {
		if (precio<=0) {
			throw new MonroyFlightException("El precio es negativo");
		}
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vuelo con codigo" + codigo + "salida del aeropuerto" + origen.getNombre() +"de "+origen.getCiudad() + ". Llegada aeropuerto" + destino.getNombre()+"de"+ destino.getCiudad() +
				". Plazas ocupadas " + numeroPlaza + "con un total de"+  this.numPlazas +".";
	}
	
	public double comprarBillete() {
		
		precio=destino.getRecargo()+origen.getRecargo()+precio;
		
		if (numeroPlaza==10) {
			precio=precio+1.04;
			numeroPlaza=0;
		}
		numeroPlaza++;
		return precio;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, destino, numPlazas, origen);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return codigo == other.codigo && Objects.equals(destino, other.destino) && numPlazas == other.numPlazas
				&& Objects.equals(origen, other.origen);
	}
	
}
