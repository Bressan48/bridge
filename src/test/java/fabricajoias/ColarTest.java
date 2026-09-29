package fabricajoias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColarTest {

    @Test
    void deveRetornarValorColarComBijuteria() {
        Material material = new Bijuteria();
        Colar colar = new Colar(30.0f);
        colar.setMaterial(material);
        colar.setNumPedras(2);
        Assertions.assertEquals(60.0f, colar.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorColarComPrata() {
        Material material = new Prata();
        Colar colar = new Colar(30.0f);
        colar.setMaterial(material);
        colar.setNumPedras(2);
        Assertions.assertEquals(420.0f, colar.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorColarComOuro() {
        Material material = new Ouro();
        Colar colar = new Colar(30.0f);
        colar.setMaterial(material);
        colar.setNumPedras(2);
        Assertions.assertEquals(4200.0f, colar.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorColarComDiamante() {
        Material material = new Diamante();
        Colar colar = new Colar(30.0f);
        colar.setMaterial(material);
        colar.setNumPedras(2);
        Assertions.assertEquals(18000.0f, colar.calcularValor(), 0.01f);
    }

}
