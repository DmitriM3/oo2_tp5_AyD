package modelo;

import java.io.File;

public class ReporteVerificarSobrescritura implements Report {

	private Report reporte;
	private int exito;

	public ReporteVerificarSobrescritura(Report reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		if (file.exists()) {
			this.exito = 2;
//			throw new IllegalArgumentException("El archivo ya existe...");
			System.out.println("El archivo ya existe...");
		} else
			this.reporte.export(file);
	}

	@Override
	public int verificacionDeExport() {
		return exito;
	}

}
