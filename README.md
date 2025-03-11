Banco-Java
Um sistema bancário simples desenvolvido em Java para gerenciar contas correntes e poupanças, permitindo operações como depósitos, saques e aplicação de juros.

Funcionalidades:
Criar contas correntes e poupanças.
Gerenciar saldo das contas.
Realizar depósitos e saques.
Aplicar juros a contas poupança.
Suporte a diferentes tipos de contas (abstração e herança).

Tecnologias Utilizadas:
Java: Linguagem de programação principal.
IntelliJ IDEA: Ambiente de desenvolvimento integrado (IDE).
Git e GitHub: Para controle de versão e colaboração.

Estrutura do Projeto:
Conta: Classe abstrata base para diferentes tipos de contas.
ContaCorrente: Subclasse de Conta com suporte a limite de crédito.
ContaPoupança: Subclasse de Conta com aplicação de juros.
Banco: Gerencia uma lista de contas e oferece funcionalidades como busca de contas.
Main: Classe principal onde o sistema é executado.

Como Executar
Clone o repositório:

bash
git clone https://github.com/Victorbicalhoa/Banco-Java.git
Abra o projeto no IntelliJ IDEA ou na IDE de sua preferência.

Compile e execute a classe Main.

Exemplo de Uso
Aqui está um exemplo básico de como o sistema funciona:

java
Banco banco = new Banco();
banco.addConta(new ContaCorrente(1, 3000, 1000));
banco.addConta(new ContaPoupança(2, 0.05));

// Realizar depósitos e saques
Conta conta = banco.searchContas(1);
conta.depositar(500);
conta.sacar(1000);

System.out.println("Saldo atualizado: " + conta.getSaldo());
Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais
