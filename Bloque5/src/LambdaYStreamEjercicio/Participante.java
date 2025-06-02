package LambdaYStreamEjercicio;
import java.util.*;

public class Participante implements Comparable<Participante>{
	private String dni;
	private String nombre;
	private LinkedList<Relato> relatos;

	public Participante(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.relatos = new LinkedList<Relato>();
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void annadirRelato(Relato relato) throws ConcursoException {
		if(this.relatos.contains(relato))
			throw new ConcursoException("El relato ya se encuentra añadido.");
		
		this.relatos.add(relato);
	}

	public void eliminarRelatosPuntuacionMenorA5( ) {
		
//		Iterator<Relato> it = this.relatos.iterator();
//		
//		while (it.hasNext()) {
//			Relato relato = (Relato) it.next();
//			if(relato.getPuntuacion()<5)
//				it.remove();	
//			
//		}
		this.relatos.removeIf((relato)->{return relato.getPuntuacion()<5;});
		
	}

	public String listadoRelatosConPuntuacionMayorA8DeGenero(String genero) {
		StringBuilder sb = new StringBuilder();
//		LinkedList<Relato> listaOrdenada = new LinkedList<Relato>();
//		
//		for (Relato relato : this.relatos) {
//			if(relato.getGenero().equals(genero) && relato.getPuntuacion()>8) {
//				listaOrdenada.add(relato);
//			}
//		}
//		
//		Collections.sort(listaOrdenada);
//	
//		for (Relato relato : listaOrdenada) {
//			sb.append(relato).append("\n");
//		}
//		
//		
		relatos.stream()
		.filter(relato->relato.getPuntuacion()>8 && relato.getGenero().equals(genero))
		.sorted((r1,r2)->r1.compareTo(r2)).forEach(relato->sb.append(relato).append("\n"));
		return sb.toString();
	}

	public List<Relato> relatosSeleccionadosParaLaFinalOrdenadosPorPuntuacion () {
//		LinkedList<Relato> listaOrdenada = new LinkedList<Relato>();
//		
//		for (Relato relato : this.relatos) {
//			if(relato.isSeleccionado())
//				listaOrdenada.add(relato);
//		}
//		
//		Collections.sort (listaOrdenada, new Comparator<Relato>() {
//
//			@Override
//			public int compare(Relato relato1, Relato relato2) {
//				return Double.compare(relato1.getPuntuacion(), relato2.getPuntuacion());
//			}
//			
//		});
//		
//		Collections.sort(listaOrdenada, 
//	
//		(relato1,relato2) -> {return Double.compare(relato1.getPuntuacion(), relato2.getPuntuacion());}   );
//		
		return relatos.stream().filter(relato->relato.isSeleccionado())
				.sorted((r1,r2)->Double.compare(r1.getPuntuacion(), r2.getPuntuacion())).toList();
	}

	
	public double sumaPuntuacionesEnUnGenero(String genero) throws ConcursoException {
//		double suma = 0;
//		boolean contieneGenero=false;
//		
//		for (Relato relato : relatos) {
//			if(relato.isSeleccionado() && relato.getGenero().equals(genero)) {
//				suma+=relato.getPuntuacion();
//				contieneGenero=true;
//			}
//		}
//		if(!contieneGenero) {
//			throw new ConcursoException("El participante no contiene relatos con dicho género.");
//		}
		relatos.stream().filter(relato -> relato.isSeleccionado() && relato.getGenero().equals(genero))
		.map(relato->relato.getPuntuacion());
		return 0;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Participante o) {	
		return Integer.compare(this.numeroRelatosSeleccionados(), o.numeroRelatosSeleccionados());
	}

	private int numeroRelatosSeleccionados() {
		return 0;
		
		 //relatos.filter((relato)->{return relatos.isSeleccionado().count;});
	}

	@Override
	public String toString() {
		return dni + " - " + nombre + " - "+ this.numeroRelatosSeleccionados();
	}
	
}