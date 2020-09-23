package Blog;

public class Comentario {
    private Usuario usuario;
    private String texto;
    private String data;

    public Comentario(Usuario usuario, String texto, String data) {
        this.usuario = usuario;
        this.texto = texto;
        this.data = data;
    }

    @Override
    public String toString() {
        String texto = this.data + " - " + this.usuario.getNome();
        texto +="\n" + this.texto;
        return texto;
    }
}
