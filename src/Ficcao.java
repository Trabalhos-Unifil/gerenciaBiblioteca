public class Ficcao extends Livro {
    String clasEtaria;

    public Ficcao(int numRegistro, String titulo, String autor, String clasEtaria) {
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
