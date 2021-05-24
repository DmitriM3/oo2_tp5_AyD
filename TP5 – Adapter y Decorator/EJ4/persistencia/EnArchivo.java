package persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import modelo.Respuesta;

public class EnArchivo implements Respuesta {

	private Respuesta call;
	private File file = new File("./misArchivos/miArchivo.txt");

	public EnArchivo(Respuesta call) {
		this.call = call;
	}

	@Override
	public String run() {
		String listadoJSON = this.call.run();
		try {
			Files.write(Paths.get(file.getPath()), listadoJSON.getBytes(), StandardOpenOption.WRITE);
		} catch (IOException e) {
			throw new RuntimeException("Error guardando la lista en el archivo...", e);
		}
		System.out.println("Listado guardado en disco..");
		return listadoJSON;

	}

}
