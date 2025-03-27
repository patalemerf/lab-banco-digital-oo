import java.util.List;
import java.util.ArrayList;

class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
            System.out.println("---------------------");
        }
    }
}
