public class ContaCorrente extends Conta{ // Define a classe ContaCorrente como uma subclasse de Conta.
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) { // Define o construtor da classe ContaCorrente.
        super(numero); // Chama o construtor da superclasse Conta para inicializar o número da conta.
        this.limite = limite; // Inicializa o limite da conta corrente com o valor passado como parâmetro.
    }

    public double getLimite() { // Método público que retorna o limite da conta corrente.
        return limite;
    }

    @Override // Indica que o método sacar está sendo sobrescrito.
    public void sacar(double valor) { // Método público que subtrai um valor do saldo da conta corrente se houver saldo suficiente ou limite disponível.
        if(valor <= getSaldo() + limite) { // Verifica se o valor a ser sacado é menor ou igual ao saldo mais o limite.
            super.sacar(valor); // Chama o método sacar da superclasse para subtrair o valor do saldo.
        }
    }
}
