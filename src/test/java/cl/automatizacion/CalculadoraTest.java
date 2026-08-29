package cl.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

@Test
void debeSumarDosNumeros() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.sumar(5, 3);
    assertEquals(8, resultado);
}

@Test
void debeRestarDosNumeros() {
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.restar(10, 4);
    assertEquals(6, resultado);
}

}