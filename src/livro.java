public abstract class livro {
    private int numRegistro;
    String titulo;
    String autor;

    public int numRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String autor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
