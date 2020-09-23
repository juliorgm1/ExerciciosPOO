package Blog;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class Postagem {
    private Usuario usuario;
    private String titulo;
    private String texto;
    private String data;
    private List<Comentario> comentarios = new ArrayList<>();

    public Postagem(Usuario usuario, String titulo,
                    String texto, String data){
        this.usuario = usuario;
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    private String getTextoComentarios(){
        if (comentarios.size()==0) return "\nNenhum comentário";
        String textoComentario = "";
        for (Comentario comentario: comentarios){
            textoComentario+="\n" + comentario;
        }

        return textoComentario;
    }

    @Override
    public String toString() {
        String textoPostagem = "---------------------------------- \n";
        textoPostagem += "\nUsuario: " + usuario.getNome();
        textoPostagem += "\nTítulo: " + titulo;
        textoPostagem += "\nTexto: " + texto;
        textoPostagem += getTextoComentarios();
        return textoPostagem;
    }
}
