public class ContaPoupança extends Conta { // Define a classe ContaPoupanca como uma subclasse de Conta.
    public double Juros; // Declara um campo privado para armazenar a taxa de juros da conta poupança.

    public ContaPoupança(int numero, double Juros) { // Define o construtor da classe ContaPoupanca.
        super(numero); // Chama o construtor da superclasse Conta para inicializar o número da conta.
        this.Juros = Juros; // Inicializa a taxa de juros da conta poupança com o valor passado como parâmetro.
    }

    public void aplicarJuros(double Juros) { // Método público que aplica os juros ao saldo da conta poupança.
        depositar(getSaldo() * Juros); // Calcula os juros sobre o saldo atual e adiciona ao saldo da conta.
    }
}
