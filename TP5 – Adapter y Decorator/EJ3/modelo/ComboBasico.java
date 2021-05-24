package modelo;

public class ComboBasico implements Combo {

	private String descripcion;
	private double precio;
	private Porcion porcionExtra;

	public ComboBasico(Porcion porcionExtra) {
		this.descripcion = "Combo Basico : Carne, Queso.";
		this.precio = 100;
		this.porcionExtra = porcionExtra;
	}

	@Override
	public void detallarDescripcion() {
		if (porcionExtra == null) {
			System.out.println(this.descripcion);
		} else
			System.out.println(this.porcionExtra.descripcion() + "\n" + this.descripcion);
	}

	@Override
	public double conocerMontoTotal() {
		if (porcionExtra == null) {
			return precio;
		} else
			return precio + this.porcionExtra.precio();

	}

}
