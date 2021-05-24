package modelo;

public class Comun implements TipoMotor {

	@Override
	public void arrancar() {
		System.out.println("Arrancando el motor comun..");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando el motor comun..");

	}

	@Override
	public void apagar() {
		System.out.println("Apagando el motor comun..");

	}

}
