package boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		
		// Declaramos las variables para el número de filas y de columnas
		int numFilas;
		int numColumnas;
		
		System.out.println("Introduce un valor para el número de filas: ");
		numFilas = sc.nextInt();
		
		System.out.println("Introduce un valor para el número de columnas: ");
		numColumnas = sc.nextInt();
		
		int[][] tabla = new int[numFilas][numColumnas];
	
		for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                
                tabla[i][j] = 10 * i + j;
            }
        }
		
		
        System.out.println("\nResultado:");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                
                System.out.print(tabla[i][j] + "\t");
            }
           
            System.out.println();
        }
        
        sc.close();
	}

}
