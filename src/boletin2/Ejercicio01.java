package boletin2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable para tamaño y los valores
		int tamaño;
		int valor;
		
		// Pedimos al usuario que introduzca el valor de tamaño
		System.out.println("Introduce el tamaño de la tabla: ");
		tamaño = sc.nextInt();
		
		// Pedimos el usuario que introduzca el valor
		System.out.println("Introduce un valor: ");
		valor = sc.nextInt();
		
		int tabla[] = new int [tamaño];	
		
		for (int i = 0; i<tamaño; i++) {
			
			tabla[i] = valor;
		
		}
		
		// Imprimimos los valores
		System.out.println("Los valores son : ");
		
		System.out.println(Arrays.toString(tabla));
		
			
		// Cerramos el Scanner
		sc.close();
	}

}
