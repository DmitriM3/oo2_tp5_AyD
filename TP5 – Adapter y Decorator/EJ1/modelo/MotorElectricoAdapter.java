package modelo;

public class MotorElectricoAdapter implements TipoMotor {

	private Electrico motorE;

	public MotorElectricoAdapter() {
		this.motorE = new Electrico();
	}

	@Override
	public void arrancar() {
		this.motorE.activar();
		this.motorE.conectar();

	}

	@Override
	public void acelerar() {
		this.motorE.moverMasRapido();

	}

	@Override
	public void apagar() {
		this.motorE.detener();
		this.motorE.desconectar();

	}

}
