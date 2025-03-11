public abstract class Conta { // Define a classe Conta como abstrata. Classes abstratas não podem ser instanciadas diretamente.
    public int numero;
    private double saldo;

    public Conta(int numero) { // Define o construtor da classe Conta. Este método é chamado quando uma nova instância da classe é criada.
        this.numero = numero; // Inicializa o número da conta com o valor passado como parâmetro.
        this.saldo = 0; // Inicializa o saldo da conta como zero.
    }

    public int getNumero() { // Método público que retorna o número da conta.
        return numero;
    }

    public double getSaldo() { // Método público que retorna o saldo da conta.
        return saldo;
    }

    public void depositar(double valor) { // Método público que adiciona um valor ao saldo da conta.
        this.saldo += valor; // Adiciona o valor passado como parâmetro ao saldo atual.
    }

    public void sacar(double valor) { //Método público que subtrai um valor do saldo da conta se houver saldo suficiente.
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }
}
