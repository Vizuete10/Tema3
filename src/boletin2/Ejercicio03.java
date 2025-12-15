package boletin2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el array de tamaño 30
        int[] numeros = new int[30];
        
        // Rellenamos con valores aleatorios (0 al 9)
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int)(Math.random() * 10);
        }
        
        // Mostrar el array desordenado para comprobar
        System.out.println("Sin ordenar: " + Arrays.toString(numeros));
        
        // Ordenamos el array
        Arrays.sort(numeros);
        
        // Mostramos el array ordenado por pantalla
        System.out.println("Ordenado:    " + Arrays.toString(numeros));
	}

}
