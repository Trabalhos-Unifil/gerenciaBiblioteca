import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Livro> acervo;
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
                           "\nEndereço: %s",biblioteca.getNomeBiblio (), biblioteca.getEndereco ());

        pausarImpressao (scanner);
        while(true) {
            System.out.println ("SISTEMA DE GERENCIAMENTO DA BIBLIOTECA " + biblioteca.getNomeBiblio ());
            System.out.println ("********************* ESCOLHA UMA OPÇÃO ABAIXO ************************" +
                                "\n 1. Cadastrar novo Funcionário" +
                                "\n 2. Fazer Log-In" +
                                "\n 3. Esqueci minha senha" +
                                "\n 4. Sair do Sistema" +
                                "\n OPÇÃO: ");
            int escolhaMenu1 = scanner.nextInt ();
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
                    mostrarMenu();
                    break;
                case 3:
                    System.out.println ("Recuperando seu login e senha...");
                    System.out.println ("Digite o CPF de cadastro");
                    funcionarios.recuperarSenha(scanner.nextLine ());
                    System.out.println ("Login: " + funcionarios.getLogin ());
                    System.out.println ("Senha: " + funcionarios.getSenha ());
            }
            
        }

    }

    private static void mostrarMenu(){
        while(true) {
            System.out.println ();
        }
    }

    public static void pausarImpressao(Scanner scanner) {
        System.out.println("-------------------------------------------------");
        System.out.println ("Pressione Qualquer Tecla para continuar.");
        scanner.nextLine ();
    }
}