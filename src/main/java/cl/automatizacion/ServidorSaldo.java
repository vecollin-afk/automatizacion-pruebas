package cl.automatizacion;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class ServidorSaldo {

    public static HttpServer crearServidor(int puerto) throws IOException {

        HttpServer servidor = HttpServer.create(new InetSocketAddress(puerto), 0);

        servidor.createContext("/saldo", (HttpExchange exchange) -> {

            ConsultaSaldo consulta = new ConsultaSaldo("activa", 100000);

            String respuesta =
                    consulta.consultarSaldo() + ": " + consulta.obtenerSaldo();

            byte[] contenido = respuesta.getBytes(StandardCharsets.UTF_8);

            exchange.sendResponseHeaders(200, contenido.length);

            try (OutputStream salida = exchange.getResponseBody()) {
                salida.write(contenido);
            }
        });

        return servidor;
    }

    public static void main(String[] args) throws IOException {

        HttpServer servidor = crearServidor(8080);
        servidor.start();

        System.out.println("Servidor iniciado en http://localhost:8080/saldo");
    }
}