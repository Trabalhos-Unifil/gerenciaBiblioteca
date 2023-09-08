public class AutoAjuda extends Livro {
    String assunto;

    public AutoAjuda(int numRegistro, String titulo, String autor, String assunto) {
        super (numRegistro, titulo, autor);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
