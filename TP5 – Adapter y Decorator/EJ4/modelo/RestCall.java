package modelo;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestCall implements Respuesta {

	private String url;

	public RestCall() {
		this.url = "https://jsonplaceholder.typicode.com/posts";
	}

	public String run() {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(this.url).build();

		try (Response response = client.newCall(request).execute()) {
			System.out.println("Retornando listado de la url..");
			return response.body().string();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
