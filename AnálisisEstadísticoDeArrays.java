package miercoles;

import java.util.Scanner;

public class AnálisisEstadísticoDeArrays {

	public static int[] generarArray(int longitud, int maxValor) {
		
 int[] array = new int[longitud];
 
 for (int i=0; i < maxValor; i++) {
	array[i] = i;
 }
		return array;
	}
	
	public static double calcularMedia( int[] lista) {
		double suma = 0;
		for (int num: lista ) {
		   suma += num;
		}
		return suma;
	}
	
 public static int encontrarMaximo(int[] arr) {
	 int max = Integer.MIN_VALUE;
	 for (int elemento : arr) {
	        if (elemento > max) {
	            max = elemento;
	        }
	    }
	 return max;
 }
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Escribe el tamaño del array ");
		int longitud = sc.nextInt(); 
		System.out.println(" Ingresa el max valor del array");
		int maxValor = sc.nextInt();
		int[] array = generarArray(longitud, maxValor);
		
		System.out.println(array.length);
	
		double promedio = calcularMedia(array);
		System.out.println(" La media aritmética es: " + promedio/maxValor);
		
		int máximo = encontrarMaximo(array);
		System.out.println(" El número más grande es: " + máximo);
		System.out.println(máximo/array.length);
sc.close();
	}
	}
	
