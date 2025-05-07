package EjercicioDiccionario;

import java.util.HashMap;

public class Diccionario {

	private HashMap<String, EntradaDiccionario> mapDic;
	
	public Diccionario() {
		this.mapDic=new HashMap<String, EntradaDiccionario>();
	}
	
	public void annadirEntrada(String palabra, String significado) {
		
	}
	
	/**
	 * @return the mapDic
	 */
	public HashMap<String, EntradaDiccionario> getMapDic() {
		return mapDic;
	}
	
}
