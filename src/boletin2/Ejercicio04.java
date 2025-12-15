package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
        
        // Creamos un array para los 8 jugadores
        int[] puntuaciones = new int[8];

        System.out.println("--- REGISTRO DE PUNTUACIONES  ---");

        // Pedimos los datos
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduce la puntuación del Jugador " + (i + 1) + ": ");
            puntuaciones[i] = sc.nextInt();
        }

        // Ordenamos el array (Java lo ordena de menor a mayor: 1000, 1200, ... 2800)
        Arrays.sort(puntuaciones);

        System.out.println("\n--- RANKING FINAL  ---");

        // Mostramos el array AL REVÉS
        // Empezamos en la última posición (longitud - 1)
        // Vamos bajando hasta llegar a 0
        // Restamos 1 en cada vuelta (i--)
        
        for (int i = puntuaciones.length - 1; i >= 0; i--) {
            System.out.println("Puntuación: " + puntuaciones[i]);
        }
        
        // Cerramos Scanner
        sc.close();
	}

}
