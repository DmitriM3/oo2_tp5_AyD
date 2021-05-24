package main;

import modelo.Motor;
import modelo.MotorElectricoAdapter;

public class Main {

	public static void main(String[] args) {

		Motor miMotor = new Motor(new MotorElectricoAdapter());

		miMotor.arrancar();

		miMotor.acelerar();

		miMotor.apagar();

	}

}
