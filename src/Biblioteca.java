public class Biblioteca {
    private String nomeBiblio;
    private String endereco;
    private Livro[] acervo;

    public Biblioteca() {
    }

    public Biblioteca(String nomeBiblio, String endereco, Livro[] acervo) {
        this.nomeBiblio = nomeBiblio;
        this.endereco = endereco;
        this.acervo = acervo;
    }

    public String getNomeBiblio() {
        return nomeBiblio;
    }

    public void setNomeBiblio(String nomeBiblio) {
        this.nomeBiblio = nomeBiblio;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getAcervo() {
        return acervo;
    }

    public void setAcervo(Livro[] acervo) {
        this.acervo = acervo;
    }




}
