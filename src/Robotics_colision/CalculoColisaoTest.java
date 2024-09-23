package Robotics_colision;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculoColisaoTest {

    @Test
    public void testeExemplo1() {
        assertEquals("(0, 5)", CalculoColisao.calcularPontoColisao(0, 0, 45, 45, 5));
    }
}
