package boletin4BID;

public class Ejercicio01 {

	public static void main(String[] args) {

		// matrizA [i][j] = matrizB [j][i]

		int[][] matriz = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }

		};

		int[][] transpuesta = transponer(matriz);

		
		System.out.println("Original: ");
		imprimirMatriz(matriz);
		
		System.out.println("Traspuesta: ");
		imprimirMatriz(transpuesta);
		
		
	}
	
	/** 
	 * Funcion que transpone una matriz rectangular
	 * @param matriz
	 * @return matriz transpuesta
	 * 
	 */
	
	public static int[][] transponer(int[][] matriz) {
		
		if ( matriz == null) {
			throw new IllegalArgumentException("La matriz no puede ser nula");
		}
		
		if( matriz.length == 0 || matriz[0] == null) {
			throw new IllegalArgumentException("La matriz debe tener al menos una fila");
		}
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		
		for ( int indiceFila = 1; indiceFila < filas; indiceFila++) {
			if( matriz[indiceFila] == null || matriz[indiceFila].length != columnas) {

				throw new IllegalArgumentException();
				
				
			}
		}
		
		int[][] resultado = new int[columnas][filas];

        for (int fila = 0; fila < filas; fila++) {
        	
            for (int columna = 0; columna < columnas; columna++) {
               
                resultado[columna][fila] = matriz[fila][columna];
            }
        }
        
        return resultado;
	
	}
	
	
	/**
	 * Imprime una matriz por pantalla
	 * @param matriz
	 * 
	 */
	
	public static void imprimirMatriz(int[][] matriz) {
		
        for (int fila = 0; fila < matriz.length; fila++) {
        	
            for (int columna = 0; columna < matriz[fila].length; columna++) {
            	
               
                System.out.print(matriz[fila][columna] + "\t");
                
            }
            System.out.println(); 
        }
    }
}
