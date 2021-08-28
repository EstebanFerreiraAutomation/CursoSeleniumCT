package condicionales;

public class Ejemplo_Switch {

	public static void main(String[] args) {

		int i = 9;
		
		switch (i) {
		case 0:
			System.out.println("i es igual a 0");
			break;
		case 1:
			System.out.println("i es igual a 1");
			break;
		case 2:
			System.out.println("i es igual a 2");
			break;
		default:
			System.out.println("i es mayor a 2");
		}

	}

}
