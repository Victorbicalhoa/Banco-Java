import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas; //Declara uma lista privada de objetos do tipo Conta. A lista armazena todas as contas do banco.


    public Banco() { // Construtor da classe Banco
        contas = new ArrayList<>(); // Inicializa a lista de contas como uma nova instância de ArrayList, que é uma implementação de List.
    }

    public void addConta(Conta conta) { // Método público que adiciona uma conta à lista de contas.
        contas.add(conta); // Adiciona a conta passada como parâmetro à lista de contas.
    }

    public Conta searchContas(int numero) { // Método público que procura uma conta pelo número.
        for (Conta conta : contas) { // Itera por cada conta na lista de contas.
            if (conta.getNumero() == numero) { // Verifica se o número da conta atual é igual ao número procurado.
                return conta; // Retorna a conta encontrada.
            }
        }
        return null; // Retorna null se nenhuma conta com o número fornecido for encontrada.
    }
}
