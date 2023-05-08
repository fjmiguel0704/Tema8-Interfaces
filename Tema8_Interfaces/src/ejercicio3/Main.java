package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Polideportivo deporte[] = new Polideportivo[2];
		deporte[0] = new Polideportivo(20, "Rafa Paz");
		deporte[1] = new Polideportivo(45, "Altos");
		EdificioOficinas edificio[] = new EdificioOficinas[2];
		edificio[0] = new EdificioOficinas(50, 5);
		edificio[1] = new EdificioOficinas(70, 20);

		for (int i = 0; i < deporte.length; i++) {
			System.out.println(deporte[i].toString());
		}
		System.out.println();
		for (int i = 0; i < edificio.length; i++) {
			System.out.println(edificio[i].toString());
		}
	}

}
