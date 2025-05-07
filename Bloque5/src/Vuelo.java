import java.util.Objects;

public class Vuelo implements Comparable<Vuelo> 
{

	private String codigo;
	private int numeroDePasajeros;
	
	
	public Vuelo(String codigo, int numeroDePasajeros) {
		super();
		this.codigo = codigo;
		this.numeroDePasajeros = numeroDePasajeros;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getNumeroDePasajeros() {
		return numeroDePasajeros;
	}


	public void setNumeroDePasajeros(int numeroDePasajeros) {
		this.numeroDePasajeros = numeroDePasajeros;
	}


	@Override
	public String toString() {
		return "Vuelo [codigo=" + codigo + ", numeroDePasajeros=" + numeroDePasajeros + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return Objects.equals(codigo, other.codigo);
	}


	@Override
	public int compareTo(Vuelo o) {
		
		return this.codigo.compareTo(o.codigo);
	}
	
	
}
