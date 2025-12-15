package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las tablas
		
		int tabla1[] = new int[10];
		
		int tabla2[] = new int[10];
		
		System.out.println("Introduce 20 numeros enteros: ");
		
		
		// Hacemos un bucle que se repita 20 veces (del 0 al 19)
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Si la i es menor que 10 (0 a 9), guardamos en la primera tabla
            if (i < 10) {
                tabla1[i] = numero;
            } 
            // Si la i es 10 o más (10 a 19), guardamos en la segunda tabla
            else {
                // Restamos 10 al índice para guardar en la posición 0, 1, 2... de la segunda tabla
                tabla2[i - 10] = numero;
            }
        }
		
        System.out.println("Tabla 1: " + Arrays.toString(tabla1));
        System.out.println("Tabla 2: " + Arrays.toString(tabla2));
		
        if (Arrays.equals(tabla1, tabla2)) {
        	
            System.out.println("RESULTADO: Los arrays son IGUALES.");
            
        } else {
        	
            System.out.println("RESULTADO: Los arrays NO son iguales.");
       
        }
        
        // Cerramos el Scanner
        sc.close();
        
	}

}
