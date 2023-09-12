import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoAjuda extends Livro {
    private String assunto;
    static List<AutoAjuda> livrosAutoAjuda = new ArrayList<> ();

    public AutoAjuda(int numRegistro, String titulo, String autor, String assunto) {
        super (numRegistro, titulo, autor);
        this.assunto = assunto;
    }

    public AutoAjuda() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Informe o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Informe o assunto do livro:");
        String assunto = scanner.nextLine();
        AutoAjuda novoLivro = new AutoAjuda (gerarNumRegistro (), titulo, autor, assunto);
        livrosAutoAjuda.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
        Executor.pausarImpressao ();
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void cadastrarLivro() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Informe o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Informe Assunto do livro:");
        String assunto = scanner.nextLine();
        AutoAjuda novoLivro = new AutoAjuda (gerarNumRegistro (), titulo, autor, assunto);
        livrosAutoAjuda.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
        Executor.pausarImpressao ();
    }

    @Override
    public void imprimirLivro() {
        for (AutoAjuda livroCadastrado : livrosAutoAjuda) {
            System.out.println("Número de Registro: " + livroCadastrado.getNumRegistro());
            System.out.println("Título: " + livroCadastrado.getTitulo());
            System.out.println("Autor: " + livroCadastrado.getAutor());
            System.out.println("Assunto: " + livroCadastrado.getAssunto ());
            System.out.println("----------------------------------");
            Executor.pausarImpressao ();
        }
    }
    public static void emprestarLivro(String nomeLivro){
        boolean livroEncontrado = false;
        for (AutoAjuda livroCadastrado: livrosAutoAjuda) {
            if (livroCadastrado.getTitulo ().equalsIgnoreCase (nomeLivro)) {
                System.out.println ("Livro está no acervo!!! Empréstimo confirmado");
                livroEncontrado = true;
                break;
            }
        }
        if(!livroEncontrado) {
            System.out.println ("O livro não está disponível no acervo!! Escolha outro título");
        }
    }
}
