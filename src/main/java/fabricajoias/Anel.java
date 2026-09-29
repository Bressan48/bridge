package fabricajoias;

public class Anel extends Acessorio {

    public Anel(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (this.material.percentualAumento());
    }

}
