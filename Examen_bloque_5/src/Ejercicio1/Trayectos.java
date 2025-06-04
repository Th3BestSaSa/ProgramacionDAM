package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Trayectos {

	private HashMap<String, Trayecto> mapTrayectos;

	public Trayectos() {
		mapTrayectos = new HashMap<String, Trayecto>();
	}

	public void addTrayecto(Trayecto nuevoTrayecto) throws TrenException {
		if (mapTrayectos.containsKey(nuevoTrayecto.getCodigoTrayecto())) {
			throw new TrenException("Ya existe un trayecto con el codigo " + nuevoTrayecto.getCodigoTrayecto());
		}

		mapTrayectos.put(nuevoTrayecto.getCodigoTrayecto(), nuevoTrayecto);

	}

	public void cambiarTipoTrenTrayecto(String codigoTrayecto, String nuevoTipoTren) throws TrenException {
		Trayecto t = this.mapTrayectos.get(codigoTrayecto);
		if (t == null) {
			throw new TrenException("No se ha encontrado el código de trayecto");
		}
		t.setTipoTren(nuevoTipoTren);
	}

	// TODO
	public List<Trayecto> listTrayectosOrdenadosPorPrecio() {
		ArrayList<Trayecto> trayectosList = new ArrayList<Trayecto>();

		TrayectosComparatorPrecio comparator = new TrayectosComparatorPrecio(); 
		Collections.sort(trayectosList, comparator);

		return trayectosList;
	}

	// TODO
	public String listadoTrayectosConEstacionOrigenOrdenadosPorTipoDeTren(String nombreEstacionOrigen)
			throws TrenException {
//hacer sin stream y lamda
		List<String> resultados = new ArrayList<String>();

		if (!this.mapTrayectos.values().isEmpty()) {

			resultados = this.mapTrayectos.values().stream()
					.filter(trayecto -> trayecto.getPrimeraEstacionDelRecorrido().getNombreEstacion()
							.equals(nombreEstacionOrigen))
					.sorted(Comparator.comparing(Trayecto::getTipoTren)).map(Trayecto::toString)
					.collect(Collectors.toList());

			if (resultados.isEmpty()) {
				throw new TrenException("No se ha encontrado la estación de origen.");
			}

		}
		return String.join("/n", resultados);
	}

	// TODO
	public Trayecto trayectoConMenosEstaciones() {
		return null;
	}
}

class TrayectosComparatorPrecio implements Comparator<Trayecto> {
	// No se ponen los parentesis

	@Override
	public int compare(Trayecto t1, Trayecto t2) {

		return (t1.getPrecio() > t2.getPrecio()) ? 1 : (t1.getPrecio() < t2.getPrecio()) ? -1 : 0;
	}
}