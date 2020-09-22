public class TestaAnimais {
    public static void main(String[] args) {
        Lobo lobo = new Lobo(3,4,8,"Preto");
        Cachorro cachorro = new Cachorro(2,4,5,"Branco");

        System.out.println("Teste Lobo");
        lobo.emitirSom();
        lobo.movimentar();

        System.out.println("Teste cachorro");
        cachorro.emitirSom();
        cachorro.movimentar();
    }
}
