import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente extends Pessoa {

    private int inscricao;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, int inscricao) {
        super (nome, cpf);
        this.inscricao = inscricao;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao() {
        this.inscricao = new Random().ints(10000, 99999)
                .findFirst ().getAsInt ();
    }

    public void imprimirCliente() {
        System.out.println ("Nome: " + getNome ());
        System.out.println ("CPF: " + getCpf ());
        System.out.println ("Incrição: " + getInscricao ());

    }






}


