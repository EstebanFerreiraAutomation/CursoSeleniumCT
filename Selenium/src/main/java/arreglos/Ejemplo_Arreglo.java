package arreglos;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		
		//Declaraciones válidas
		int intArray [];		
		int [] intArray2;
		
		//Declarar un array de strings
		
		String [] arr;
		
		//asignar memoria para 5 enteros
		
		arr = new String[5];
		
		//inicializa el primer elemento del array y sucesivamente
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		System.out.println("Elemento en el índice 3 del arreglo: " + arr[3]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el índice " + i + ": " + arr[i]);
		}
		

	}

}
