package boletin1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creamos el Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		int list[] = new int[100];
		
		// Recorre todos los números del 1 al 9
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * (10 - 1) + 1);
			
		}

		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		String correspondencia = "";
		for (int i = 0; i < list.length; i++) {
			if (list[i] == numero) {
				if (correspondencia.isEmpty()) {
					correspondencia = Integer.toString(i);
				} else {
					correspondencia += " - " + (Integer.toString(i));
				}
			}
		}
		if (correspondencia.isEmpty()) {
			System.out.println("No se ha encontrado el número " + numero + " en el array.");
		} else {
			System.out.println("El número " + numero + " se encuentra en las posiciones: ");
			System.out.println(correspondencia);
		}
		
		// Cerramos el Scanner
		sc.close();
		
		
	}

}
