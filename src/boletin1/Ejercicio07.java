package boletin1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		double[] temperaturas = new double[meses.length];

		int posicion;

		int numAsteriscos;
		int posicionAsterisco;

		System.out.println("Introduce las temperaturas medias de cada mes:");

		for (posicion = 0; posicion < meses.length; posicion++) {
			System.out.print(meses[posicion] + ": ");
			temperaturas[posicion] = sc.nextDouble();
		}

		for (posicion = 0; posicion < meses.length; posicion++) {
			System.out.println(meses[posicion] + ": ");

			// Calculamos el numero de asteriscos a mostrar
			numAsteriscos = (int) temperaturas[posicion];

			// Dibujamos los asteriscos
			for (posicionAsterisco = 0; posicionAsterisco < numAsteriscos; posicionAsterisco++) {
				System.out.print("*");
			}

			System.out.println();

		}
		// Cerramos el Scanner
		sc.close();

	}

}
