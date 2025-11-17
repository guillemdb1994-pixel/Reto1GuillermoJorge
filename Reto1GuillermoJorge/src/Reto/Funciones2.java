package Reto;
//Guillermo
public class Funciones2 {
	public static double multiplicar(double x, int y) {
			return x*y;
	}
	public static double dividir(double x,double y) {
		return x/y;
	}
	public static boolean esPositivo(double x) {
		if (x>=0) {
			return true;
		}
		return false;
	}
	public boolean esNegativo(double x) {
		if (x<0) {
			return true;
		}
		return false;
	}
}
