package clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//Asignando valores a las variables
		minivan.pasajeros = 9;
		minivan.pasajeros = 15;
		minivan.pasajeros = 20;
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con rango de " + rango + " kilometros");
		
		Vehiculo carro = new Vehiculo ();		
		carro.pasajeros = 4;
		System.out.println("Número de pasajeros en carro es " + carro.pasajeros);
		
		

	}

}
