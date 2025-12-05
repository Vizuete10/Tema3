package boletin1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Declaramos el array de 10 números enteros
		int numero[] = new int[10];

		// Pedimos al usuario que introduzca 10 números enteros
		for (int i = 0; i < numero.length; i++) {

			System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
			numero[i] = sc.nextInt();
		}

		// Sumamos los números introducidos
		int suma = 0;
		for (int i = 0; i < numero.length; i++) {
			suma += numero[i];
		}
		// Averiguar el mayor número introducido
		int mayor = numero[0];
		for (int i = 1; i < numero.length; i++) {
			if (numero[i] > mayor) {
				mayor = numero[i];
			}
		}
		// Averiguamnos el menor número introducido
		int menor = numero[0];
		for (int i = 1; i < numero.length; i++) {
			if (numero[i] < menor) {
				menor = numero[i];
			}

		}
		// Mostramos los resultados
		System.out.println("La suma de los números introducidos es: " + suma);
		System.out.println("El mayor número introducido es: " + mayor);
		System.out.println("El menor número introducido es: " + menor);

		// Cerramos el Scanner
		sc.close();
		
	}
}
