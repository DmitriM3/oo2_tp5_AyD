package modelo;

public class Motor {

	private TipoMotor tipo;

	public Motor(TipoMotor tipo) {
		this.tipo = tipo;
	}

	public void arrancar() {
		this.tipo.arrancar();
	}

	public void acelerar() {
		this.tipo.acelerar();
	}

	public void apagar() {
		this.tipo.apagar();
	}
}
