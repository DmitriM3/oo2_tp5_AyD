package modelo;

import java.io.File;

public class ReporteNoNull implements Report {

	private Report reporte;
	private int exito;

	public ReporteNoNull(Report reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		if (file != null) {
			this.reporte.export(file);
		} else {
			this.exito = 1;
//			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
			System.out.println("File es NULL; no puedo exportar...");
		}

	}

	@Override
	public int verificacionDeExport() {
		return exito;
	}

}
