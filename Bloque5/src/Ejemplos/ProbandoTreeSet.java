package Ejemplos;

import java.util.TreeSet;

public class ProbandoTreeSet {

	public static void main(String[] args) {
	
		TreeSet<Vuelo> vuelosOrdenados=new TreeSet<Vuelo>();
		
		vuelosOrdenados.add(new Vuelo("V1122", 100));
		vuelosOrdenados.add(new Vuelo("A2233", 150));
		vuelosOrdenados.add(new Vuelo("A5599", 110));
		vuelosOrdenados.add(new Vuelo("V0099", 110));
		
		for(Vuelo vuelo: vuelosOrdenados) {
			System.out.println(vuelo);
		}

	}

}
