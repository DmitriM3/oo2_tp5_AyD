package modelo;

public class PorcionTomate implements Porcion {

	private String nombrePorcion;
	private double precioExtra;
	private Porcion porcionExtra;

	public PorcionTomate(Porcion porcion) {
		this.nombrePorcion = "Porcion Tomate";
		this.precioExtra = 5;
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
