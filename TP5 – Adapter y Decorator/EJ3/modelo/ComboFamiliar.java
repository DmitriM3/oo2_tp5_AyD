package modelo;

public class ComboFamiliar implements Combo {

	private String descripcion;
	private double precio;
	private Porcion porcionExtra;

	public ComboFamiliar(Porcion porcion) {
		this.descripcion = "Combo Familiar : Carne, Tomate, Queso, Huevo, Papas.";
		this.precio = 200;
		this.porcionExtra = porcion;
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
