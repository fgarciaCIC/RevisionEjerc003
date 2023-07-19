package ejerc003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalculadora {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        calculadora.insertarCalculadora(5);
        calculadora.sumar(3);
        assertEquals(8, calculadora.getResultado(), 0);
    }

    @Test
    public void testRestar() {
        calculadora.insertarCalculadora(10);
        calculadora.restar(4);
        assertEquals(6, calculadora.getResultado(), 0);
    }

    @Test
    public void testMultiplicar() {
        calculadora.insertarCalculadora(2);
        calculadora.multiplicar(3);
        assertEquals(6, calculadora.getResultado(), 0);
    }

    @Test
    public void testDividir() {
        calculadora.insertarCalculadora(10);
        calculadora.dividir(2);
        assertEquals(5, calculadora.getResultado(), 0);
    }

    @Test
    public void testReiniciarCalculadora() {
        calculadora.insertarCalculadora(7);
        calculadora.reiniciarCalculadora();
        assertEquals(0, calculadora.getResultado(), 0);
        assertEquals(0, calculadora.getEstadoCalculadora());
    }

    @Test
    public void testInsertarCalculadora() {
        calculadora.insertarCalculadora(5);
        assertEquals(5, calculadora.getResultado(), 0);
        assertEquals(1, calculadora.getEstadoCalculadora());
    }
}