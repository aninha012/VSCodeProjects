package IMC;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar dados do paciente
            System.out.print("Informe o peso do paciente (em kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Informe a altura do paciente (em metros): ");
            double altura = scanner.nextDouble();

            // Criar um objeto Paciente
            Paciente paciente = new Paciente(peso, altura);

            // Calcular IMC e fornecer diagnóstico
            double imc = paciente.calcularIMC();
            String diagnostico = paciente.diagnostico();

            // Exibir resultados
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Diagnóstico: " + diagnostico);
            System.out.println();

            // Perguntar se o usuário deseja continuar
            System.out.print("Deseja calcular o IMC de outro paciente? (s/n): ");
            char resposta = scanner.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');
        }

        System.out.println("Encerrando a aplicação...");
        scanner.close();
    }
}
