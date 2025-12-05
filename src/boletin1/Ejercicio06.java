package boletin1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Declaramos el array de 8 números enteros

		int numero[] = new int[8];
		
		// Pedimos al usuario que introduzca 8 números enteros
		for (int i = 0; i < numero.length; i++) {
			
			System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
			numero[i] = sc.nextInt();
		}
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println( numero[i] + " es par.");
			} else {
				System.out.println( numero[i] + " es impar.");
			}
		}
	}

}
