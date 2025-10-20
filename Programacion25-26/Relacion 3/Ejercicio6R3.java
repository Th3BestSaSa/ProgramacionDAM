/*
 * Realizar un programa que lea el número de alumnos que hay en una clase. A continuación debe leer la
nota de cada uno de ellos en un examen y nos debe informar del número de suspensos y aprobados,
así como los porcentajes.
 */

import java.util.Scanner;

public class Ejercicio6R3 {

	private static final int NOTA_APROBADO = 5;
	private static final int NOTA_MAXIMA = 10;
	private static final int NOTA_MINIMA = 0;
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// Variables
		int alumnos,nota,aprobado=0,suspenso=0;
		double porcentajeAprobado,porcentajeSuspenso;
		do {
			System.out.println("Introduce el número  de alumnos en una clase");
			alumnos=Integer.parseInt(teclado.nextLine());
		}while(alumnos<=0);
		for(int i=1;i<=alumnos;i++) {
			do {
				System.out.println("Introduce la nota del alumno número "+i);
				nota=Integer.parseInt(teclado.nextLine());
			}while(nota<NOTA_MINIMA && nota>NOTA_MAXIMA);
			if(nota>=NOTA_APROBADO) {
				aprobado++;
			}else {
				suspenso++;
			}
		}
		porcentajeAprobado=((double)aprobado/alumnos)*100;
		System.out.println("El porcentaje de aprobados es del "+porcentajeAprobado+"%");
		porcentajeSuspenso=((double)suspenso/alumnos)*100;
		System.out.println("El porcentaje de suspensos es del "+porcentajeSuspenso+"%");
		System.out.println(aprobado);
		System.out.println(suspenso);
	}

}
