package modelo;

import java.io.File;

public class ReporteSinVerificarSobrescritura implements Report {

	private Report reporte;
	private int exito;

	public ReporteSinVerificarSobrescritura(Report reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		this.exito = 3;
		System.out.println("Sin verificar el archivo..");
		this.reporte.export(file);

	}

	@Override
	public int verificacionDeExport() {
		return exito;

	}

}
