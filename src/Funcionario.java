import java.util.Scanner;

public class Funcionario extends Pessoa {
    String login;
    int senha;

    public Funcionario(String nome, String cpf, String login, int senha) {
        super (nome, cpf);
        this.login = login;
        this.senha = senha;
    }

    public Funcionario() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void cadastrarFuncionario(Funcionario funcionarios, Scanner scanner) {

        System.out.println ("********Cadastro de Novo Funcionário**********");
        System.out.println ("Digite o nome do funcionário: ");
        funcionarios.setNome(scanner.nextLine ());
        System.out.println ("Digite o CPF do funcionário" + funcionarios.getNome () +" : ");
        funcionarios.setCpf (scanner.nextLine ());
        while(funcionarios.getCpf ().length()!=11){
            System.out.println ("Erro!!! Digite um CPF válido com 11 dígitos:");
            funcionarios.setCpf (scanner.nextLine ());
        }
        System.out.println ("Digite o login: ");
        funcionarios.setLogin(scanner.nextLine ());
        System.out.println ("Agora digite uma senha para o login " + funcionarios.getLogin () + ": (apenas números)");
        funcionarios.setSenha (scanner.nextInt ());
        System.out.printf ("Funcionário cadastrado com sucesso:" +
                "\nNome: %s" +
                "\nCPF: %s" +
                "\nlogin: %s" +
                "\nsenha: %d\n", funcionarios.getNome (), funcionarios.getCpf (), funcionarios.getLogin (), funcionarios.getSenha ());
        Executor.pausarImpressao();
    }
    public boolean verificarFuncionario(Funcionario funcionario,Scanner scanner) {
        System.out.println ("Digite seu login: ");
        String tempLogin = scanner.nextLine ();
        System.out.println ("Digite sua senha: ");
        int tempSenha = scanner.nextInt ();
        if(tempLogin.equalsIgnoreCase (funcionario.getLogin())&&(tempSenha==funcionario.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public void recuperarSenha(String cpf, Scanner scanner) {
        cpf = cpf.substring (0,3) + "." + cpf.substring (3,3) +
                "." + cpf.substring (6, 3) + "-" + cpf.substring (9,2) ;
        if(cpf.equalsIgnoreCase (getCpf ())) {
            System.out.println ("CPF cadastrado!!");
            System.out.println ("Login: " + getLogin ());
            System.out.println ("Senha: " + getSenha ());
        } else{
            System.out.println ("CPF não cadastrado!!");

        }
}


