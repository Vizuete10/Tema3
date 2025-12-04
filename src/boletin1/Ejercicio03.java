package boletin1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Declaramos el array de 5 números enteros
		int numero[] = new int[10];
		
		// Pedimos al usuario que introduzca 5 números enteros
		for (int i = 0; i < numero.length; i++) {
			
			System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
			numero[i] = sc.nextInt();
		}
		// Mostramos los números introducidos
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println("Número en la posición " + (i + 1) + ": " + numero[i]);
		}

	}

}
