package fabricajoias;

public class Colar extends Acessorio{

    private int numPedras;

    public Colar(float valorBase) {
        super(valorBase);
    }

    public void setNumPedras(int numPedras) {
        this.numPedras = numPedras;
    }

    public float calcularValor() {
        return this.valorBase * numPedras * (this.material.percentualAumento()) ;
    }

}
