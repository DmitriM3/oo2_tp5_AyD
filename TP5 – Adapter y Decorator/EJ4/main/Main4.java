package main;

import modelo.Respuesta;
import modelo.RestCall;
import persistencia.EnArchivo;
import persistencia.EnBD;

public class Main4 {

	public static void main(String[] args) {

//		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
//		System.out.println(rest.run());

		Respuesta resp = new EnBD(new EnArchivo(new RestCall()));
		resp.run();

	}

}
