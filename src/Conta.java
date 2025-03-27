
abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Conta Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}