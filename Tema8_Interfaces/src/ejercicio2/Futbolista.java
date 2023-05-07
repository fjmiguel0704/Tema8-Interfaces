package ejercicio2;

public class Futbolista implements Comparable {
	int numCamiseta;
	String nombre;
	int edad;
	int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "Número de Camiseta: " + numCamiseta + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n"
				+ "Número de Goles: " + numGoles + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Futbolista jugador = (Futbolista) obj;
		if (this.numCamiseta == jugador.numCamiseta && this.nombre.equals(jugador.nombre)) {
			iguales = true;
		}

		return iguales;
	}

	@Override
	public int compareTo(Object obj) {
		int res = 0;
		Futbolista jugador = (Futbolista) obj;
		if (this.numCamiseta < jugador.numCamiseta) {
			res = -1;
		} else if (this.numCamiseta > jugador.numCamiseta) {
			res = 1;
		} else {
			res = this.nombre.compareTo(nombre);
		}

		return res;
	}

}
