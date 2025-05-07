package ejercicio1;

public enum TipoCategoria {
	BAJA(Hotel.BAJA),MEDIA(Hotel.MEDIA),ALTA(Hotel.ALTA),LUJO(Hotel.LUJO);
	
	public int precio;

	TipoCategoria(int precio) {
		this.precio=precio;
	}
}
