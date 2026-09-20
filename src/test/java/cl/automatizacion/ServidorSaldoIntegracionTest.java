package cl.automatizacion;

import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServidorSaldoIntegracionTest {

    private static HttpServer servidor;
    private static int puerto;

    @BeforeAll
    static void iniciarServidor() throws Exception {
        servidor = ServidorSaldo.crearServidor(0);
        servidor.start();

        puerto = servidor.getAddress().getPort();
    }

    @AfterAll
    static void detenerServidor() {
        servidor.stop(0);
    }

    @Test
    void debeResponderConsultaDeSaldoPorHttp() throws Exception {

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:" + puerto + "/saldo"))
                .GET()
                .build();

        HttpResponse<String> respuesta =
                cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        assertEquals(200, respuesta.statusCode());
        assertEquals("SALDO DISPONIBLE: 100000", respuesta.body());
    }
}