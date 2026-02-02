import java.util.Scanner;

public class Ejercicio7 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int dia, mes, anno, diaMaximo;
		do {
			System.out.println("Introduce el año");
			anno = Integer.parseInt(teclado.nextLine());
		} while (anno < 0);

		do {
			System.out.println("Introduce el mes");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);

		diaMaximo = Ejercicio4.diasDeUnMes(mes, anno);
		do {
			System.out.println("Introduce el dia del mes");
			dia = Integer.parseInt(teclado.nextLine());
		} while (dia < 1 || dia > diaMaximo);
		System.out.println(diaDeLaSemana(dia, mes, anno));
	}

	private static String diaDeLaSemana(int dia, int mes, int anno) {
		// TODO Auto-generated method stub
		int a,y,m,d;
		String semana;
		 a = (14 - mes) / 12;
		y = anno - a;
		m = mes + 12 * a - 2;
		d = (dia + y + y/4 - y/100 + y/400 + (31*m)/12)%7;
		switch (d) {
		case 1:
			semana = "Lunes";
			break;
		case 2:
			semana = "Martes";
			break;
		case 3:
			semana = "Miercoles";
			break;
		case 4:
			semana = "Jueves";
			break;
		case 5:
			semana = "Viernes";
			break;
		case 6:
			semana = "Sabado";
			break;
		default:
			semana = "Domingo";
			break;
		}
		
		return semana;
	}
}
