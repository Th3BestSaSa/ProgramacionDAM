package ExamenBloque2;

public class Ejercicio3 {

	private static String[] PALABRAS_CLAVE = { "FACTURA", "NÓMINA", "RECLAMACIÓN", "CONTRATO", "PEDIDO", "EXPONE",
			"SOLICITA" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena2 = " SEVILLA";
		boolean a;

		a = esAdministrativo(cadena2);
		if (a) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
	}

	public static boolean esAdministrativo(String cadena2) {
		boolean b = false;
		String[] s = cadena2.split(" ");
		for (int i = 0; i < PALABRAS_CLAVE.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[j].equalsIgnoreCase(PALABRAS_CLAVE[i])) {
					b = true;
				}
			}

		}
		return b;
	}

}
