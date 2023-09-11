public class Cliente extends Pessoa {
    private boolean inscrito;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.inscrito = false;

        // O cliente não está incrito
    }

    public void realizarInscricao() {
        if (inscrito) {
            inscrito = true;
            System.out.println("Cliente " + getNome() + " Inscrição realizada com sucesso.");
        } else {
            System.out.println("Cliente " + getNome() + " Já está inscrito.");
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Giovana", "117.929.789-01");

        cliente1.realizarInscricao(); // Cliente realiza sua inscrição pela primeira vez
        cliente1.realizarInscricao(); // Mostrará que Giovana já está inscrita
    }
}
