package Fracciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion f= new Fraccion(4, 8);
		Fraccion a= new Fraccion(8, 4);
		System.out.println(f);
//		f.simplificar(2);
//		System.out.println(f);
		System.out.println(a);
		int q=f.obtenerMCD(a);
		System.out.println(q);
		System.out.println(f);
	}

}
