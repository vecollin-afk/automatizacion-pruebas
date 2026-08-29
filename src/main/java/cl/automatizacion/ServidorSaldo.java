package cl.automatizacion;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorSaldo {

    public static void main(String[] args) throws IOException {

        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

        servidor.createContext("/saldo", (HttpExchange exchange) -> {

            ConsultaSaldo consulta = new ConsultaSaldo("activa", 100000);

            String respuesta =
                    consulta.consultarSaldo() + ": " + consulta.obtenerSaldo();

            exchange.sendResponseHeaders(200, respuesta.getBytes().length);

            try (OutputStream salida = exchange.getResponseBody()) {
                salida.write(respuesta.getBytes());
            }
        });

        servidor.start();

        System.out.println("Servidor iniciado en http://localhost:8080/saldo");
    }
}