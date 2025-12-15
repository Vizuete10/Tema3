package boletin2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos el array de 1000
		int datos[] = new int[1000];
		
        for (int i = 0; i < datos.length; i++) {

            datos[i] = (int)(Math.random() * 100);

        }
        
        System.out.println("Introduce un valor :");
        int valor = sc.nextInt();
        
        // Numero de veces que aparece
        int contador = 0;
        
        // usamos un bucle for para ver cuantas veces aparece
        for (int n : datos) {
            if (n == valor) {
                contador++;
            }
        }
        
        // Mostramos resultados
        
        if (contador > 0) {
            System.out.println("El número " + valor + " EXISTE en el array.");
            System.out.println("Aparece un total de " + contador + " veces.");
        } else {
            System.out.println("El número " + valor + " NO existe en el array.");
        }
        // Cerramos el Scanner
        sc.close();
	}

}
