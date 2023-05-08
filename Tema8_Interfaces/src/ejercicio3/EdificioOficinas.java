package ejercicio3;

public class EdificioOficinas implements Edificio {
	double superficie;
	int numOficinas;

	public EdificioOficinas(double superficie, int numOficinas) {
		super();
		if (superficie > 0) {
			this.superficie = superficie;
		}
		if (numOficinas > 0) {
			this.numOficinas = numOficinas;
		}
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Superficie del edificio: " + superficie + "\n" + "Número de Oficinas: " + numOficinas;
	}

}
