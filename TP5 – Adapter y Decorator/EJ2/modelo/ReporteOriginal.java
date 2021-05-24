package modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReporteOriginal implements Report {

	private String reporte;

	public ReporteOriginal(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		try {
			file.createNewFile();
			Files.write(Paths.get(file.getPath()), reporte.getBytes(), StandardOpenOption.WRITE);
			System.out.println("Se escribio el archivo..");
		} catch (IOException e) {
			throw new IllegalArgumentException("Error de entrada/salida...");
		}
	}

	@Override
	public int verificacionDeExport() {
		// TODO Auto-generated method stub
		return 0;
	}

}
