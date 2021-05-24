package modelo;

public class PorcionCarne implements Porcion {

	private String nombrePorcion;
	private double precioExtra;
	private Porcion porcionExtra;

	public PorcionCarne(Porcion porcion) {
		this.nombrePorcion = "Porcion Carne";
		this.precioExtra = 75;
		this.porcionExtra = porcion;
	}

	@Override
	public String descripcion() {
		if (porcionExtra == null) {
			return this.nombrePorcion;
		} else
			return (this.porcionExtra.descripcion() + "\n" + this.nombrePorcion);
	}

	@Override
	public double precio() {
		if (porcionExtra == null) {
			return precioExtra;
		} else
			return precioExtra + this.porcionExtra.precio();
	}

}
