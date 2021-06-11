package main;

import modelo.Motor;
import modelo.MotorElectricoAdapter;

public class Main {

	public static void main(String[] args) {

		Motor miMotor = new Motor(new MotorElectricoAdapter());
//		Motor miMotor = new Motor(new Comun());
//		Motor miMotor = new Motor(new Economico());

		miMotor.arrancar();

		miMotor.acelerar();

		miMotor.apagar();

	}

}
