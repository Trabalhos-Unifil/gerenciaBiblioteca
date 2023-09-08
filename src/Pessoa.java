public abstract class Pessoa {
    private String nome;
    private String cpf;

    //Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.substring (0,3) + "." + cpf.substring (3,3) +
                "." + cpf.substring (6, 3) + "-" + cpf.substring (9,2) ;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
  }

