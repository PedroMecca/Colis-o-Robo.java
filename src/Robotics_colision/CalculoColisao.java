package Robotics_colision;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class CalculoColisao {

    // Função para calcular o ponto de colisão (a ser implementada aos poucos)
    public static String calcularPontoColisao(int x1, int y1, int a, int f, int d) {
        // Convertendo ângulos para radianos
        double aRad = Math.toRadians(a);  // Ângulo de orientação do robô
        double fRad = Math.toRadians(f - 90);  // Ângulo do feixe

        double anguloTotal = aRad + fRad;


        double x2 = x1 + d * cos(anguloTotal);
        double y2 = y1 + d * sin(anguloTotal);


        int xFinal = (int) Math.round(x2);
        int yFinal = (int) Math.round(y2);

        return String.format("(%d, %d)", xFinal, yFinal);
    }
}
