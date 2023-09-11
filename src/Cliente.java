public class Cliente extends Pessoa {
    private boolean inscrito;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.inscrito = false;

        // O cliente não está incrito
    }

    public void fazerInscricao() {
        if (inscrito) {
            inscrito = true;
            System.out.println("Cliente " + getNome() + " Inscrição realizada com sucesso.");
        } else {
            System.out.println("Cliente " + getNome() + " Já está inscrito.");
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Giovana", "117.929.789-01");

        cliente1.fazerInscricao(); // Cliente faz a inscrição pela primeira vez
        cliente1.fazerInscricao(); // Tentativa de fazer a inscrição novamente
    }
}
