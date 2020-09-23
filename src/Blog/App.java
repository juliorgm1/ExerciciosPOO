package Blog;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Usuario> usuarioList = new ArrayList<>();
        List<Postagem> postagemList = new ArrayList<>();

        outerloop:
        while (true){
            System.out.println("Informe a sua opção");
            System.out.println("1 - Usuários");
            System.out.println("2 - Postagens");
            System.out.println("3 - Sair");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("1 - Criar usuário");
                    System.out.println("2 - Excluir usuário");

                    opcao = scan.nextInt();
                    if (opcao == 1) {
                        System.out.println("Informe o nome do usuário");
                        String nome = scan.next();

                        System.out.println("Informe a idade do usuário");
                        int idade = scan.nextInt();

                        usuarioList.add(new Usuario(nome, idade));
                    }
                    break;
                case 2:
                    System.out.println("Escolhi postagem");
                    break;
                case 3: break outerloop;
            }
        }

        scan.close();

    }

    public static void testaClasses(){
        Usuario usuario = new Usuario("Jerson",31);
        Postagem postagem = new Postagem(usuario,"Ultimas noticias do android",
                "Fique sabendo sobre todas as novidades da proxima versão..",
                "01/09/2020");
        Comentario comentario = new Comentario(usuario,
                "Obrigado pelas dicas",
                "02/09/2020");
        Comentario comentario2 = new Comentario(usuario,
                "Seu texto está muito bom, parabéns!",
                "10/09/2020");

        postagem.addComentario(comentario);
        postagem.addComentario(comentario2);

        System.out.println(postagem);
    }
}
