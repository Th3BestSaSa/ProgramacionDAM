
public class Categoria {

	private static final int IVA_MAXIMO = 25;
	private String nombre;
	private int iva;
	public Categoria(String nombre, int iva) throws VentasException {
		this.nombre = nombre;
		setIva(iva);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) throws VentasException {
		if (iva <0 || iva> IVA_MAXIMO) {
			throw new VentasException("Iva de la categoria incorrecto" + iva);
		}
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return "Categoria " + nombre + ", iva " + iva + "%";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Categoria other = (Categoria) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
}
