package arreglos;

public class Ejemplo_ArregloDosDimensiones {

	public static void main(String[] args) {
		
		//Ejemplo arreglo de una dimensión
		int [] intArray = new int [] {1,2,3,4,5};
		
		//declarando e inicializando arreglo en 2 dimensiones
		int arr [] [] = {{2,7,7},{3,6,1},{7,4,2,5}};
			System.out.println(arr[2][1]);
			System.out.println(arr[1][2]);
			
		for (int i = 0; i < arr.length; i++) {
			//con arr[i] indico el length de los arreglos de la 2da dimensión
			//sirve cuando tengo arreglos de 2da dimensión con distintos tamaños
			for (int j = 0; j < arr[i].length; j++) {
				// solo print para que imprima ambos valores en la misma línea
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //para saltar una línea
		}

	}

}
