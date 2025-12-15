package boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double suma = 0;
        double max = 0;
        double min = 10;
        double media = 0;
        
		double[][] notas = new double[4][5];

		for (int i = 0; i < 4; i++) {

			System.out.println("Datos del Alumno " + (i + 1));
			for (int j = 0; j < 5; j++) {

				System.out.print("Nota asignatura " + (j + 1) + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}
        for (int fila = 0; fila < 4; fila++) {
            

            for (int columna = 0; columna < 5; columna++) {
                

                System.out.print(notas[fila][columna] + "\t");
                
                suma = suma + notas[fila][columna];
                media = suma / 5;
                
                if (notas[fila][columna] > max) {
                    max = notas[fila][columna];
                }
                
                if (notas[fila][columna] < min) {
                    min = notas[fila][columna];
                }
            }
            System.out.print(" -> Media: " + media + " | Max: " + max + " | Min: " + min);
            
            System.out.println();
        }
        
        

	}
}