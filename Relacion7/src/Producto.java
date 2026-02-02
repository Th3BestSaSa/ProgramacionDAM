

public class Producto {
	
	// Atributos
	private int codigo;
	private String descripcion;
	private double precioSinIva;
	private Categoria categoria;
	private static int ultimoCodigoGenerado=0;
	
	
	public Producto(String descripcion, double precio, Categoria categoria) throws VentasException {
		
		setPrecioSinIva(precio);
		setDescripcion(descripcion);
		this.categoria=categoria;
		this.codigo=ultimoCodigoGenerado + 1;
		ultimoCodigoGenerado++;

	}
	
	

	// Set y get

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public void setPrecioSinIva(double precioSinIva) throws VentasException {
		if (precioSinIva <= 0) {
			throw new VentasException(
					"Debe introducir un numero positivo y mayor que 0");
		}
		this.precioSinIva = precioSinIva;
	
	}

	public void setDescripcion(String descripcion)  {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public int getCodigo(){
		return codigo;
	}

	public double precioConIva() {
		double resultado;
		resultado = precioSinIva + (precioSinIva * categoria.getIva()/100);
		return resultado;
	}

	public String toString() {
		String cadena;
		cadena = ("Producto codigo: " + codigo + " Descripcion "+ descripcion+  " Precio sin iva: " + precioSinIva+" precio con iva: "+precioConIva() + " euros");
		return cadena;
	}
	public boolean equals(Producto  otro){
		boolean iguales=false;
		if ( this.codigo== otro.codigo ){
			iguales=true;
		}
		return iguales;
	}

}
