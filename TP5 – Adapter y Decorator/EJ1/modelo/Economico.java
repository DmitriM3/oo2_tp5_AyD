package modelo;

public class Economico implements TipoMotor {

	@Override
	public void arrancar() {
		System.out.println("Arrancando el motor economico..");

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando el motor economico..");

	}

	@Override
	public void apagar() {
		System.out.println("Apagando el motor economico..");

	}

}
