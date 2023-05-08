package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	int superficie;
	String nombre;

	public Polideportivo(int superficie, String nombre) {
		super();
		if (superficie > 0) {
			this.superficie = superficie;
		}
		if (!nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	@Override
	public int getTipoDeInstalacion() {
		return superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Superficie Polideportivo: " + superficie + "\n" + "Nombre: " + nombre;
	}

}
