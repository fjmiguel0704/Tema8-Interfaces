package ejercicio1;

public class Socio {
	int idSocio;
	String nombre;
	int edad;

	public Socio(int idSocio, String nombre, int edad) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.edad = edad;
	}

	interface Comparable{
		public void compareTo();
	}
	
	@Override
	public String toString() {
		return "Socio: " + idSocio + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad;
	}

}
