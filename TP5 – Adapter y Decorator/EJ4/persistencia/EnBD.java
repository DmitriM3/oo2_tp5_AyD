package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import modelo.Item;
import modelo.Respuesta;

public class EnBD implements Respuesta {

	private Respuesta call;
	Properties props = new Properties();

	public EnBD(Respuesta call) {
		this.call = call;
		props.setProperty("driver", "com.mysql.jdbc.Driver");
		props.setProperty("dburl", "jdbc:mysql://localhost:3306/oo2_ejercicios");
		props.setProperty("user", "root");
		props.setProperty("password", "");
	}

	@Override
	public String run() {
		String lista = this.call.run();
		List<Item> listaItems = obtenerListado(lista);

		Connection conn = null;
		try {
			Class.forName(props.getProperty("driver"));
			conn = DriverManager.getConnection(props.getProperty("dburl"), props.getProperty("user"),
					props.getProperty("password"));
			PreparedStatement statement = conn
					.prepareStatement("INSERT INTO jsonitems(userId, id, title, body) VALUES (?,?,?,?)");
			for (Item item : listaItems) {
				statement.setString(1, item.getUserId());
				statement.setString(2, item.getId());
				statement.setString(3, item.getTitle());
				statement.setString(4, item.getBody());
				statement.execute();
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("NO JDBC driver", e);
		} catch (SQLException e) {
			throw new RuntimeException("No se pudo conectar a la BD. ", e);
		} catch (Exception e) {
			throw new RuntimeException("Error al insertar el item", e);
		}
		System.out.println("Listado guardado en base de datos..");
		return lista;

	}

	private List<Item> obtenerListado(String lista) {
		List<String> parts = Arrays.asList(lista.split("[{,,,}]"));
		int cada4 = 0;
		List<Item> listaItems = new ArrayList<Item>();
		String userId = null, id = null, title = null, body = null;
		String[] parts2 = null;

		for (int i = 1; i < parts.size(); i++) {
			parts2 = parts.get(i).split(":");

			if (cada4 < 4) {
				if (cada4 == 0)
					userId = parts2[1];
				if (cada4 == 1)
					id = parts2[1];
				if (cada4 == 2)
					title = parts2[1];
				if (cada4 == 3)
					body = parts2[1];
				cada4++;
				if (cada4 == 4) {
					listaItems.add(new Item(userId, id, title, body));
					i += 2;
					cada4 = 0;
				}
			}
		}
		return listaItems;
	}

}
