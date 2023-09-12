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

    public void adicionarLivro(Livro livro) {
        // Verifica se o acervo já foi inicializado
        if (acervo == null) {
            acervo = new Livro[1]; // Inicializa o acervo com tamanho 1
            acervo[0] = livro; // Adiciona o primeiro livro
        } else {
            // Cria um novo vetor com tamanho maior
            Livro[] novoAcervo = new Livro[acervo.length + 1];

            // Copia os livros existentes para o novo vetor
            for (int i = 0; i < acervo.length; i++) {
                novoAcervo[i] = acervo[i];
            }

            // Adiciona o novo livro ao final do novo vetor
            novoAcervo[acervo.length] = livro;

            // Atualiza a referência para o novo vetor
            acervo = novoAcervo;
        }
    }




}
