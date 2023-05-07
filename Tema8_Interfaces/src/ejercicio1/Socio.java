package ejercicio1;

public class Socio implements Comparable {
	int idSocio;
	String nombre;
	int edad;

	public Socio(int idSocio, String nombre, int edad) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio: " + idSocio + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n";
	}

	@Override
	public int compareTo(Object obj) {
		int res = 0;
		Socio per = (Socio) obj;
		if (this.idSocio < per.idSocio) {
			res = -1;
		} else if (this.idSocio > per.idSocio) {
			res = 1;
		}

		return res;
	}

}
