
class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.01;

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }
}
