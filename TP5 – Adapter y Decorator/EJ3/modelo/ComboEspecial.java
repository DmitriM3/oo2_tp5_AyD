package modelo;

public class ComboEspecial implements Combo {

	private String descripcion;
	private double precio;
	private Porcion porcionExtra;

	public ComboEspecial(Porcion porcionExtra) {
		this.descripcion = "Combo Especial : Carne, Tomate, Queso.";
		this.precio = 300;
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
