public abstract class Animal {
    protected int idade;
    protected int quantidadeMembros;
    protected double peso;

    public Animal(int idade, int quantidadeMembros, double peso) {
        this.idade = idade;
        this.quantidadeMembros = quantidadeMembros;
        this.peso = peso;
    }

    public abstract void movimentar();
    public abstract void emitirSom();
}
