package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista jugadores[] = new Futbolista[5];

		jugadores[0] = new Futbolista(5, "Ocampos", 25, 4);
		jugadores[1] = new Futbolista(20, "Fernando", 29, 2);
		jugadores[2] = new Futbolista(15, "En-Nesyri", 26, 15);
		jugadores[3] = new Futbolista(22, "Badé", 23, 2);
		jugadores[4] = new Futbolista(12, "Rafa", 25, 3);

		Arrays.sort(jugadores);

		for (Futbolista tabla : jugadores) {
			System.out.println(tabla.toString());
		}
	}

}
