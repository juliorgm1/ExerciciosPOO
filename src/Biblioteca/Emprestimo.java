package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livroList = new ArrayList<>();
    private String data;

    public Emprestimo(Usuario usuario, List<Livro> livroList, String data) {
        this.usuario = usuario;
        this.livroList = livroList;
        this.data = data;
    }

    public Emprestimo(Usuario usuario, List<Livro> livroList) {
        this.usuario = usuario;
        this.livroList = livroList;
    }
}
