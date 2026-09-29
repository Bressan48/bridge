package fabricajoias;

public abstract class Acessorio {

    protected Material material;

    protected float valorBase;

    public Acessorio(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();

}
