import java.util.Scanner;

public class Ejercicio9 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora1, minutos1, segundos1, hora2, minutos2, segundos2;
		
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
		if(hora1<=24 && minutos1 <=60 && segundos1 <=60 && hora2<=24 && minutos2 <=60 && segundos2 <=60) {
			System.out.println("Error");
		}else {
			segundos1=(hora1*3600)+(minutos1*60)+ segundos1;
			segundos2=(hora2*3600)+(minutos2*60)+ segundos2;
			 if (segundos1==segundos2) {
				 System.out.println("La horas son iguales");
			}else if(segundos1>segundos2) {
				System.out.println("La hora 1 es mayor");
			}else {
				System.out.println("La hora 2 es mayor");
			}
			
		}

	}

}
