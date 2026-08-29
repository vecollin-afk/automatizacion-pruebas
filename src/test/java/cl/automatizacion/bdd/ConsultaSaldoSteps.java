package cl.automatizacion.bdd;

import cl.automatizacion.ConsultaSaldo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultaSaldoSteps {

    private ConsultaSaldo consultaSaldo;
    private String resultado;

    @Given("que existe una cuenta activa con saldo de {int}")
    public void existeCuentaActivaConSaldo(int saldo) {
        consultaSaldo = new ConsultaSaldo("activa", saldo);
    }

    @Given("que existe una cuenta con estado {string}")
    public void existeCuentaConEstado(String estado) {
        consultaSaldo = new ConsultaSaldo(estado, 0);
    }

    @When("el usuario consulta el saldo")
    public void usuarioConsultaSaldo() {
        resultado = consultaSaldo.consultarSaldo();
    }

    @Then("el sistema debe mostrar el saldo disponible de {int}")
    public void sistemaMuestraSaldoDisponible(int saldoEsperado) {
        assertEquals("SALDO DISPONIBLE", resultado);
        assertEquals(saldoEsperado, consultaSaldo.obtenerSaldo());
    }

    @Then("el sistema debe responder {string}")
    public void sistemaDebeResponder(String resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}