package ciclos;

public class Ejemplo_While {

	public static void main(String[] args) {

		int a = 1;
		
		//Salir cuando a es mayor que 4
		
		while (a <= 4) {
			System.out.println("el valor de a:" + a);
			// incrementa el valor de a en 1 para la siguiente iteración
			// para que una vez que sea mayor a 4 corte (condición de salida)
			a++;
		}

	}

}
