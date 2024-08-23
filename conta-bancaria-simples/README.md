Descrição

Este projeto é um aplicativo simples para criar e manter uma conta bancária. Ele permite que os usuários realizem operações de crédito e débito em uma conta, além de visualizar informações relevantes, como o número da conta, nome do cliente, saldo e limite de crédito.

Estrutura do Projeto

O projeto é dividido em duas classes principais:

- Classe Conta: Implementa os atributos e métodos necessários para gerenciar uma conta bancária.
-  Classe Principal: Contém o método main que interage com o usuário, permitindo que ele realize operações na conta.

Classe Conta

A classe Conta possui os seguintes atributos:
- numConta: Número da conta (tipo int).
- nomeCliente: Nome do cliente (tipo String).
- saldo: Saldo atual da conta (tipo double).
- limiteCredito: Limite de crédito da conta (tipo double).

Métodos da Classe Conta

- Construtor: Inicializa os atributos da conta.
- Getters e Setters: Métodos gerados automaticamente para acessar e modificar os atributos.
- creditar(double valor): Adiciona um valor ao saldo da conta.
- debitar(double valor): Subtrai um valor do saldo, verificando se há saldo suficiente, considerando o limite de crédito.
- exibirInformacoes(): Exibe os detalhes da conta.

Classe Principal

A classe Principal contém o método main, que realiza as seguintes funções:
- Instancia um objeto da classe Conta.
- Interage com o usuário em um loop, permitindo que ele escolha entre realizar um crédito, um débito ou sair do aplicativo.
- Atualiza o saldo da conta após cada operação e exibe as informações da conta.
- O loop é encerrado quando o usuário decide não realizar mais transações.
