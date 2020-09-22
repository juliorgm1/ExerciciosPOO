package Biblioteca;

public class Livro {
    private String titulo;
    private String isbn;
    private String autor;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }
}