package test;

import java.io.File;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Report;
import modelo.ReporteNoNull;
import modelo.ReporteOriginal;
import modelo.ReporteSinVerificarSobrescritura;
import modelo.ReporteVerificarSobrescritura;

class TestReport {

	@Test
	void testExportArchivoExistente() {
		File file = new File("./misArchivos/miArchivo3.txt");
		Report report = new ReporteVerificarSobrescritura(new ReporteOriginal("Mi reporte dinamico 5"));
		report.export(file);
		// verificacion
		Assert.assertEquals(2, report.verificacionDeExport());
	}

	@Test
	void testExportExitoso() {
		File file = new File("./misArchivos/miArchivo3.txt");
		Report report = new ReporteSinVerificarSobrescritura(new ReporteOriginal("Mi reporte dinamico 5"));
		report.export(file);
		// verificacion
		Assert.assertEquals(3, report.verificacionDeExport());
	}

	@Test
	void testExportArchivoNull() {
		Report report = new ReporteNoNull(new ReporteOriginal("Mi reporte.."));
		File file = null;
		report.export(file);

		// verificacion
		Assert.assertEquals(1, report.verificacionDeExport());
	}
}
