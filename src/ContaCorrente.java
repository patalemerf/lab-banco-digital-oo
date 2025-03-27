
class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, Cliente cliente, double chequeEspecial) {
        super(numero, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if ((saldo + chequeEspecial) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
