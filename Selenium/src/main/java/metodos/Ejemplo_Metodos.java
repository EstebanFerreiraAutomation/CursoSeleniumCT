package metodos;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma (9, 5);		
		System.out.println(resultado);
		
		int resultado2 = suma (14, 15);		
		System.out.println(resultado2);
		
		int resultado3 = suma (20, 30);		
		System.out.println(resultado3);
		
		String autos = auto(3);
		System.out.println(autos);
		
		int resultadoSuma = suma (5,9,9);
		System.out.println(resultadoSuma);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma (int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String auto (int a) {
		String [] cars = {"Volvo", "BWM", "Ford", "Mazda"};
		return cars[a];
		
	}

}
