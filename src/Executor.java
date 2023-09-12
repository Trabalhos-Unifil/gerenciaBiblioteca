import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executor {


    public static  Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {


        boolean validaLogIn = false;
        Funcionario funcionarios = new Funcionario();

        Biblioteca biblioteca = new Biblioteca ();
        System.out.println ("Bem vindo ao Programa de Gerenciamento de Bibliotecas" +
                            "\nCriando uma nova Biblioteca......" +
                            "\nDigite o nome da sua Biblioteca:");
        biblioteca.setNomeBiblio (scanner.nextLine ());
        System.out.println ("Agora digite o Endereço da Biblioteca:");
        biblioteca.setEndereco (scanner.nextLine ());
        System.out.printf ("Biblioteca criada com Sucesso!!!" +
                           "\nNome: %s" +
                           "\nEndereço: %s\n",biblioteca.getNomeBiblio (), biblioteca.getEndereco ());
        pausarImpressao();
        while(true) {
            System.out.println ("SISTEMA DE GERENCIAMENTO DA BIBLIOTECA " + biblioteca.getNomeBiblio ());
            System.out.println ("************* ESCOLHA UMA OPÇÃO ABAIXO ****************" +
                                "\n 1. Cadastrar novo Funcionário" +
                                "\n 2. Fazer Log-In" +
                                "\n 3. Esqueci minha senha" +
                                "\n 4. Sair do Sistema" +
                                "\n OPÇÃO: ");
            int escolhaMenu1 = scanner.nextInt ();
            scanner.nextLine ();
            switch(escolhaMenu1) {
                case 1:
                    funcionarios.cadastrarFuncionario(funcionarios, scanner);
                    break;
                case 2:
                    validaLogIn = funcionarios.verificarFuncionario(funcionarios, scanner);
                    while(!validaLogIn) {
                        System.out.println ("Senha e/ou login incorretos:");
                        System.out.println ("Tente novamente.");
                        validaLogIn = funcionarios.verificarFuncionario (funcionarios, scanner);
                    }
                    System.out.println ("Validação Correta!! Entrando no sistema...");
                    mostrarMenu(biblioteca, scanner);
                    break;
                case 3:
                    System.out.println ("Recuperando seu login e senha...");
                    System.out.println ("Digite o CPF de cadastro");
                    funcionarios.recuperarSenha(scanner.nextLine (), scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa....");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println ("Opção inválida. Por favor escolha novamente!");
            }
        }
    }
    private static void mostrarMenu(Biblioteca biblioteca, Scanner scanner){
        while(true) {
            System.out.println ("SISTEMA DE GERENCIAMENTO DA BIBLIOTECA " + biblioteca.getNomeBiblio ());
            System.out.println ("*************** ESCOLHA UMA OPÇÃO ABAIXO ******************" +
                                "\n 1. Cadastrar novo Cliente" +
                                "\n 2. Gerenciar Acervo" +
                                "\n 3. Emprestar Livro" +
                                "\n 4. Sair do Sistema" +
                                "\n OPÇÃO: ");
            int escolhaMenu = scanner.nextInt ();
            switch(escolhaMenu) {
                case 1:
                    scanner.nextLine ();
                    Cliente cliente = new Cliente ();
                    System.out.println ("Digite o nome do novo cliente");
                    cliente.setNome (scanner.nextLine ());
                    System.out.println ("Digite o CPF do novo cliente");
                    cliente.setCpf (scanner.nextLine ());
                    cliente.setInscricao ();
                    cliente.imprimirCliente ();
                    pausarImpressao ();
                    break;
                case 2:
                    subMenuAcervo();
                    break;
                case 3:
                    emprestarLivro();
                    break;
                case 4:
                    System.out.println("Saindo do programa....");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println ("Opção inválida. Por favor escolha novamente!");

            }
        }
    }

    public static void subMenuAcervo() {
        while (true) {
            System.out.println ("********************* ESCOLHA UMA OPÇÃO ABAIXO ************************" +
                    "\n 1. Cadastrar novo Livro" +
                    "\n 2. Imprimir Acervo" +
                    "\n 3. Voltar ao Menu anterior" +
                    "\n 4. Sair do Sistema" +
                    "\n OPÇÃO: ");

            int escolhaSubMenuAcervo = scanner.nextInt ();

            switch (escolhaSubMenuAcervo) {
                case 1:
                    System.out.println ("Cadastrar Livro de Ficção (1) ou Auto Ajuda (2)");
                    int tipoLivro = scanner.nextInt ();
                    if (tipoLivro == 1) {
                        Ficcao livro = new Ficcao ();
                        livro.cadastrarLivro ();
                    } else {
                        AutoAjuda livro = new AutoAjuda ();
                        livro.cadastrarLivro ();
                    }
                    break;
                case 2:
                    System.out.println ("Cadastrar Livro de Ficção (1) ou Auto Ajuda (2)");
                    int imprimir = scanner.nextInt ();
                    if (imprimir == 1) {
                        Ficcao livro = new Ficcao ();
                        livro.imprimirLivro ();
                    } else {
                        AutoAjuda livro = new AutoAjuda ();
                        livro.imprimirLivro ();
                    }
                    break;
                case 3:
                    System.out.println ("Emprestar Livro de Ficção (1) ou Auto Ajuda (2)");
                    int emprestimo = scanner.nextInt ();
                    System.out.println ("Digite o título do Livro");
                    String nomeEmprestimo = scanner.nextLine ();
                    scanner.nextLine ();
                    if(emprestimo==1){
                        Ficcao.emprestarLivro (nomeEmprestimo);
                    } else{
                        AutoAjuda.emprestarLivro(nomeEmprestimo);
                    }
                    break;
                case 4:
                    return;
                case 5:
                    System.out.println ("Saindo do programa....");
                    scanner.close ();
                    System.exit (0);
                default:
                    System.out.println ("Opção inválida. Por favor escolha novamente!");

            }

        }
    }

    public static void emprestarLivro() {

    }

    public static void pausarImpressao() {
        System.out.println("-------------------------------------------------");
        System.out.println ("Pressione Qualquer Tecla para continuar.");
        scanner.nextLine ();
    }
}