package modelo;

import java.io.File;

public interface Report {

	void export(File file);

	int verificacionDeExport();

}