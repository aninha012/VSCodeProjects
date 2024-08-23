package ContaBancaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando um objeto Conta
        Conta conta = new Conta(12345, "João da Silva", 1000.0);

        boolean continuar = true;
        while (continuar) {
            // Exibindo informações da conta
            conta.exibirInformacoes();

            // Interagindo com o usuário
            System.out.println("Escolha uma operação:");
            System.out.println("1. Crédito");
            System.out.println("2. Débito");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Valor do crédito: R$ ");
                    double valorCredito = scanner.nextDouble();
                    conta.creditar(valorCredito);
                    break;
                case 2:
                    System.out.print("Valor do débito: R$ ");
                    double valorDebito = scanner.nextDouble();
                    conta.debitar(valorDebito);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Encerrando a aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
