public class biblioteca {
    String nomeBiblioteca;
    String endereco;
    livro[] acervo;

    public biblioteca(String nomeBiblioteca, String endereco, livro[] acervo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.acervo = acervo;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public livro[] getAcervo() {
        return acervo;
    }

    public void setAcervo(livro[] acervo) {
        this.acervo = acervo;
    }


}
