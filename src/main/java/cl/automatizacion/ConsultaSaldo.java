package cl.automatizacion;

public class ConsultaSaldo {

    private String estado;
    private int saldo;

    public ConsultaSaldo(String estado, int saldo) {
        this.estado = estado;
        this.saldo = saldo;
    }

    public String consultarSaldo() {

        if (estado.equalsIgnoreCase("activa")) {
            return "SALDO DISPONIBLE";
        }

        if (estado.equalsIgnoreCase("bloqueada")) {
            return "CONSULTA NO DISPONIBLE";
        }

        return "CUENTA NO EXISTE";
    }

    public int obtenerSaldo() {
        return saldo;
    }
}