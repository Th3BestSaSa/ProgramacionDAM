
public class Aeropuerto {

	private static final int RECARGO_MAXIMO = 8;
	private String nombre;
	private String ciudad;
	
	//Tanto por ciento de recargo
	private int recargo=0;
	
	
	
	public Aeropuerto(String nombre, String ciudad, int recargo) throws MonroyFlightException {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		setRecargo(recargo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getRecargo() {
		return recargo;
	}

	public void setRecargo(int recargo) throws MonroyFlightException {
		if ( recargo < 0 || recargo > RECARGO_MAXIMO)
			throw new MonroyFlightException("Valor incorrecto del recargo");
		this.recargo = recargo;
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", recargo=" + recargo + "]";
	}
	
	public boolean equals(Aeropuerto otro) {
		
		boolean resul=false;
		
		if (this.nombre.equals(otro.nombre) && this.ciudad.equals(otro.ciudad)) {
			resul=true;
		}
		
		return resul;
	}
	
	
}
