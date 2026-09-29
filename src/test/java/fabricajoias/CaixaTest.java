package fabricajoias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaixaTest {

        @Test
        void deveRetornarValorCaixaComBijuteria() {
            Material material = new Bijuteria();
            Caixa caixa = new Caixa(25.0f);
            caixa.setMaterial(material);
            Assertions.assertEquals(25.0f, caixa.calcularValor(), 0.01f);
        }

        @Test
        void deveRetornarValorCaixaComPrata() {
            Material material = new Prata();
            Caixa caixa = new Caixa(25.0f);
            caixa.setMaterial(material);
            Assertions.assertEquals(25.0f, caixa.calcularValor(), 0.01f);
        }

        @Test
        void deveRetornarValorCaixaComOuro() {
            Material material = new Ouro();
            Caixa caixa = new Caixa(25.0f);
            caixa.setMaterial(material);
            Assertions.assertEquals(25.0f, caixa.calcularValor(), 0.01f);
        }

        @Test
        void deveRetornarValorCaixaComDiamante() {
            Material material = new Diamante();
            Caixa caixa = new Caixa(25.0f);
            caixa.setMaterial(material);
            Assertions.assertEquals(25.0f, caixa.calcularValor(), 0.01f);
        }

}
