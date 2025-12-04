package boletin1;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		int[] tabla = new int[10];
		
		Random generador = new Random();
		
		for (int i = 0; i < tabla.length; i++) {
            tabla[i] = generador.nextInt(100) + 1;
        }
		
		for (int i = 0; i < tabla.length; i++) {
			
			System.out.println("Elemento en la posición " + i + ": " + tabla[i]);
		
		}
	
	}

}
