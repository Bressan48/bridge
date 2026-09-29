package fabricajoias;

public class Brinco extends Acessorio{

    public Brinco(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase;
    }
}
