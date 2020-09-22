public class Cachorro extends Mamifero {
    public Cachorro(int idade, int quantidadeMembros, double peso, String corPelo) {
        super(idade, quantidadeMembros, peso, corPelo);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Latir");
    }

    @Override
    public void movimentar() {
        System.out.println("Correr");
    }
}
