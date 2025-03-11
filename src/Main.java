//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // criação de contas
        ContaCorrente contaCorrente = new ContaCorrente(1, 3000, 3000);
        ContaPoupança contaPoupança = new ContaPoupança(2, 0.1);

        // adicinando contas ao banco
        banco.addConta(contaCorrente);
        banco.addConta(contaPoupança);

        // Operações conta corrente
        System.out.println("Saldo inicial da conta corrente: " + contaCorrente.getSaldo());
        contaCorrente.depositar(5000); // Depósito
        System.out.println("Saldo após depósito na conta corrente: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1000); // Saque dentro do limite
        System.out.println("Saldo após saque na conta corrente: " + contaCorrente.getSaldo());
        System.out.println("\nSaldo inicial da conta poupança: " + contaPoupança.getSaldo());

        //operações conta poupança
        contaPoupança.depositar(2000); // Depósito
        System.out.println("Saldo após depósito na conta poupança: " + contaPoupança.getSaldo());
        contaPoupança.aplicarJuros(contaPoupança.Juros); // Aplicação de juros
        System.out.println("Saldo após aplicação de juros na conta poupança: " + contaPoupança.getSaldo());

        // Buscando conta no banco
        Conta contaBuscada = banco.searchContas(1);
        if (contaBuscada != null) {
            System.out.println("\nConta encontrada: Número " + contaBuscada.getNumero() + ", Saldo: " + contaBuscada.getSaldo());
        } else {
            System.out.println("\nConta não encontrada.");
        }
        Conta contaBuscada2 = banco.searchContas(2);
        if (contaBuscada != null) {
            System.out.println("\nConta encontrada: Número " + contaBuscada2.getNumero() + ", Saldo: " + contaBuscada2.getSaldo());
        } else {
            System.out.println("\nConta não encontrada.");
        }
    }
}