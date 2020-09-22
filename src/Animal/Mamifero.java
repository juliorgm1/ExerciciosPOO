package Animal;

import Animal.Animal;

public abstract class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(int idade, int quantidadeMembros, double peso, String corPelo) {
        super(idade, quantidadeMembros, peso);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
