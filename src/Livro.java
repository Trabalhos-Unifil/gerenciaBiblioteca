public abstract class Livro {
    private int numRegistro;
    private String titulo;
    private String autor;

    public Livro(int numRegistro, String titulo, String autor) {
        this.numRegistro = numRegistro;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
