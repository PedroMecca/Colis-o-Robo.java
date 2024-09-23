package Robotics_colision;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculoColisaoTest {

    @Test
    public void testeExemplo1() {
        assertEquals("(0, 5)", CalculoColisao.calcularPontoColisao(0, 0, 45, 45, 5));
    }

    @Test
    public void testeExemplo2() {
        assertEquals("(10, 20)", CalculoColisao.calcularPontoColisao(10, 10, 45, 45, 10));
    }

    @Test
    public void testeExemplo3() {
        assertEquals("(0, 4)", CalculoColisao.calcularPontoColisao(-4, 4, 45, 135, 4));
    }

    @Test
    public void testeExemplo4() {
        assertEquals("(3, -3)", CalculoColisao.calcularPontoColisao(0, 0, 0, 135, 4));
    }

}
