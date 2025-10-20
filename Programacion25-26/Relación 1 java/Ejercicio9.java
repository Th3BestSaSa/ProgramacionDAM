import java.util.Scanner;

public class Ejercicio9 {
	private static final int TOTALSEGUNDOSENHORA = 3600;
	private static final int MAXIMO_SEGUNDOS = 60;
	private static final int MAXIMO_MINUTOS = 60;
	private static final int MAXIMO_HORA = 24;
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora1, minutos1, segundos1, hora2, minutos2, segundos2;
		
		do {
			System.out.println("Introdice la hora 1");
		hora1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introdice los minutos 1");
		minutos1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introdice la segundos 1");
		segundos1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introdice la hora 2");
		hora2=Integer.parseInt(teclado.nextLine());
		System.out.println("Introdice la minutos 2");
		minutos2=Integer.parseInt(teclado.nextLine());
		System.out.println("Introdice la segundos 2");
		segundos2=Integer.parseInt(teclado.nextLine());
		} while (hora1<=MAXIMO_HORA && minutos1 <=MAXIMO_MINUTOS && segundos1 <=MAXIMO_SEGUNDOS && hora2<=MAXIMO_HORA && minutos2 <=MAXIMO_MINUTOS && segundos2 <=MAXIMO_SEGUNDOS);
		
			segundos1=(hora1*TOTALSEGUNDOSENHORA)+(minutos1*MAXIMO_SEGUNDOS)+ segundos1;
			segundos2=(hora2*TOTALSEGUNDOSENHORA)+(minutos2*MAXIMO_SEGUNDOS)+ segundos2;
			 if (segundos1==segundos2) {
				 System.out.println("La horas son iguales");
			}else if(segundos1>segundos2) {
				System.out.println("La hora 1 es mayor");
			}else {
				System.out.println("La hora 2 es mayor");
			}
			
		}

}
