package Animal;

public class Lobo extends Mamifero {
    public Lobo(int idade, int quantidadeMembros, double peso, String corPelo) {
        super(idade, quantidadeMembros, peso, corPelo);
    }

    @Override
    public void movimentar() {
        System.out.println("Correr");
    }
}
