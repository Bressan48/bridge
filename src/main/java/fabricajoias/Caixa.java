package fabricajoias;

public class Caixa extends Acessorio{

    public Caixa(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase;
    }
}
