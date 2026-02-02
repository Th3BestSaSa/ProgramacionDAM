package Fracciones;

import java.util.Objects;

public class Fraccion {
	public int numerador;
	public int denominador;
	/**
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		return this.numerador*other.denominador==this.denominador*other.numerador; 
	}
	@Override
	public String toString() {
		return "Fraccion: " + numerador + "/" + denominador;
	}
	public void simplificar(int numDivisible) {
		numerador=numerador/numDivisible;
		denominador=denominador/numDivisible;
		
	}
	public int obtenerMCD(Fraccion otra) {
		int a= this.getDenominador();
		int b= otra.getDenominador();
		while (b!=0) {
			int aux=b;
			b=a/b;
			a=aux;
		}
	return a;
	}
}
