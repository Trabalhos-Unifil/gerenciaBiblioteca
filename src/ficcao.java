public class ficcao extends livro {
    String clasEtaria;

    public ficcao(int numRegistro, String titulo, String autor, String clasEtaria) {
        super (numRegistro, titulo, autor);
        this.clasEtaria = clasEtaria;
    }


    public String getClasEtaria() {
        return clasEtaria;
    }

    public void setClasEtaria(String clasEtaria) {
        this.clasEtaria = clasEtaria;
    }
}
