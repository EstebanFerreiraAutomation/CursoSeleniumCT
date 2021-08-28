package ciclos;

public class Ejemplo_DoWhile {

	public static void main(String[] args) {

		int b = 21;
		
		do {
			//código dentro del do se imprime incluso si la condición es falsa
			System.out.println("el valor de 8 es: " + b);
			b++;
		}while (b<=20);

	}

}
