import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ficcao extends Livro {
    static List<Ficcao> livrosFiccao = new ArrayList<> ();
    private String clasEtaria;

    public Ficcao() {

    }

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

    @Override
    public void cadastrarLivro() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Informe o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Informe a classificação etária do livro:");
        String clasEtaria = scanner.nextLine();
        Ficcao novoLivro = new Ficcao(gerarNumRegistro (), titulo, autor, clasEtaria);
        livrosFiccao.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
        Executor.pausarImpressao ();
    }

    @Override
    public void imprimirLivro() {
        for (Ficcao livroCadastrado : livrosFiccao) {
            System.out.println("Número de Registro: " + livroCadastrado.getNumRegistro());
            System.out.println("Título: " + livroCadastrado.getTitulo());
            System.out.println("Autor: " + livroCadastrado.getAutor());
            System.out.println("Classificação Etária: " + livroCadastrado.getClasEtaria());
            System.out.println("----------------------------------");
            Executor.pausarImpressao ();
        }
    }

    public static void emprestarLivro(String nomeLivro){
        for (Ficcao livroCadastrado: livrosFiccao) {
            if(livroCadastrado.getTitulo ().equalsIgnoreCase (nomeLivro)){
                System.out.println ("Livro está no acervo!!! Empréstimo confirmado");
            } else {
                System.out.println ("O livro não está disponível no acervo!! Escolha outro título");
            }
        }
    }



}
