package main;

import java.io.File;

import modelo.Report;
import modelo.ReporteOriginal;
import modelo.ReporteVerificarSobrescritura;

public class Main2 {

	public static void main(String[] args) {
		File file = new File("./misArchivos/miArchivo3.txt");
//		Report report = new ReporteOriginal("Este es mi primer reporte");
//		report.export(new File(ruta));
//		System.out.println(report.verificacionDeExport());

		Report rp = new ReporteOriginal("Mi reporte dinamico 5");
		rp.export(file);

		Report rpV = new ReporteVerificarSobrescritura(new ReporteOriginal("Mi reporte dinamico 5"));
		rpV.export(file);

	}

}
