public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Souza", "123.456.789-00");
        Cliente cliente2 = new Cliente("João Silva", "987.654.321-00");

        Conta conta1 = new ContaCorrente(1, cliente1, 500);
        Conta conta2 = new ContaPoupanca(2, cliente2);
        
        conta1.depositar(1000);
        conta2.depositar(2000);
        conta1.transferir(300, conta2);
        
        Banco banco = new Banco("Banco Java");
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        
        banco.listarContas();
    }
}
