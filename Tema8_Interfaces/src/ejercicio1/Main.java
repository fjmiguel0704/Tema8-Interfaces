package ejercicio1;

import java.util.Arrays;

import ejercicio2.Futbolista;

public class Main {

	public static void main(String[] args) {

		Socio socios[] = new Socio[4];

		socios[0] = new Socio(22, "Fran", 17);
		socios[1] = new Socio(54, "Raquel", 16);
		socios[2] = new Socio(17, "Fernando", 19);
		socios[3] = new Socio(13, "Juan", 20);

		System.out.print("Comparativa socio 1 con 1: ");
		System.out.println(socios[0].compareTo(socios[0]));
		System.out.print("Comparativa socio 1 con 2: ");
		System.out.println(socios[0].compareTo(socios[1]));
		System.out.print("Comparativa socio 1 con 3: ");
		System.out.println(socios[0].compareTo(socios[2]));
		System.out.print("Comparativa socio 1 con 4: ");
		System.out.println(socios[0].compareTo(socios[3]));
		System.out.print("Comparativa socio 2 con 1: ");
		System.out.println(socios[1].compareTo(socios[0]));
		System.out.print("Comparativa socio 2 con 2: ");
		System.out.println(socios[1].compareTo(socios[1]));
		System.out.print("Comparativa socio 2 con 3: ");
		System.out.println(socios[1].compareTo(socios[2]));
		System.out.print("Comparativa socio 2 con 4: ");
		System.out.println(socios[1].compareTo(socios[3]));
		System.out.print("Comparativa socio 3 con 1: ");
		System.out.println(socios[2].compareTo(socios[0]));
		System.out.print("Comparativa socio 3 con 2: ");
		System.out.println(socios[2].compareTo(socios[1]));
		System.out.print("Comparativa socio 3 con 3: ");
		System.out.println(socios[2].compareTo(socios[2]));
		System.out.print("Comparativa socio 3 con 4: ");
		System.out.println(socios[2].compareTo(socios[3]));
		System.out.print("Comparativa socio 4 con 1: ");
		System.out.println(socios[3].compareTo(socios[0]));
		System.out.print("Comparativa socio 4 con 2: ");
		System.out.println(socios[3].compareTo(socios[1]));
		System.out.print("Comparativa socio 4 con 3: ");
		System.out.println(socios[3].compareTo(socios[2]));
		System.out.print("Comparativa socio 4 con 4: ");
		System.out.println(socios[3].compareTo(socios[3]));

		System.out.println();
		for (Socio tabla : socios) {
			System.out.println(tabla.toString());
		}
		System.out.println("------------------------------------");
		Arrays.sort(socios);
		System.out.println();
		for (Socio tabla : socios) {
			System.out.println(tabla.toString());
		}

	}

}
