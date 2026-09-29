package fabricajoias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnelTest {

    @Test
    void deveRetornarValorAnelComBijuteria() {
        Material material = new Bijuteria();
        Anel anel = new Anel(30.0f);
        anel.setMaterial(material);
        Assertions.assertEquals(30.0f, anel.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAnelComPrata() {
        Material material = new Prata();
        Anel anel = new Anel(30.0f);
        anel.setMaterial(material);
        Assertions.assertEquals(210.0f, anel.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAnelComOuro() {
        Material material = new Ouro();
        Anel anel = new Anel(30.0f);
        anel.setMaterial(material);
        Assertions.assertEquals(2100.0f, anel.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAnelComDiamante() {
        Material material = new Diamante();
        Anel anel = new Anel(30.0f);
        anel.setMaterial(material);
        Assertions.assertEquals(9000.0f, anel.calcularValor(), 0.01f);
    }

}
