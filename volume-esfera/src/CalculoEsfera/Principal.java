package CalculoEsfera;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Esfera esfera = new Esfera();

        while (true) {
            System.out.print("Informe o raio da esfera (ou 0 para sair): ");
            double raio = scanner.nextDouble();

            // Verifica se o usuário deseja encerrar a execução
            if (raio == 0) {
                System.out.println("Encerrando a aplicação...");
                break;
            }

            // Atualiza o raio da esfera
            esfera.setRaio(raio);

            // Mostra o raio e o volume da esfera
            System.out.println("Raio da esfera: " + esfera.getRaio());
            System.out.printf("Volume da esfera: %.2f\n", esfera.volumeDaEsfera());
            System.out.println();
        }

        scanner.close();
    }
}
