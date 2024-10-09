package pkgAnimais;

import java.util.Scanner;

public class PrincipalAnimal {
    private static Scanner scanner = new Scanner(System.in);
    private static Cão cao;
    private static Gato gato;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nMenu de Interação com Animais");
            System.out.println("1. Criar Cão");
            System.out.println("2. Criar Gato");
            System.out.println("3. Fazer Aniversário (Cão)");
            System.out.println("4. Fazer Aniversário (Gato)");
            System.out.println("5. Latir (Cão)");
            System.out.println("6. Miar (Gato)");
            System.out.println("7. Vigiar (Cão)");
            System.out.println("8. Relaxar (Cão)");
            System.out.println("9. Subir Muro (Gato)");
            System.out.println("10. Descer Muro (Gato)");
            System.out.println("11. Morrer (Cão ou Gato)");
            System.out.println("12. Exibir Estado dos Animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarCao();
                    break;
                case 2:
                    criarGato();
                    break;
                case 3:
                    fazerAniversarioCao();
                    break;
                case 4:
                    fazerAniversarioGato();
                    break;
                case 5:
                    latirCao();
                    break;
                case 6:
                    miarGato();
                    break;
                case 7:
                    vigiarCao();
                    break;
                case 8:
                    relaxarCao();
                    break;
                case 9:
                    subirMuroGato();
                    break;
                case 10:
                    descerMuroGato();
                    break;
                case 11:
                    morrerAnimal();
                    break;
                case 12:
                    exibirEstado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void criarCao() {
        System.out.print("Digite o nome do cão: ");
        String nome = scanner.next();
        System.out.print("Digite o nome do tutor: ");
        String tutor = scanner.next();
        cao = new Cão(nome, tutor);
        System.out.println("Cão criado: " + cao);
    }

    private static void criarGato() {
        System.out.print("Digite o nome do gato: ");
        String nome = scanner.next();
        System.out.print("Digite o nome do tutor: ");
        String tutor = scanner.next();
        gato = new Gato(nome, tutor);
        System.out.println("Gato criado: " + gato);
    }

    private static void fazerAniversarioCao() {
        if (cao != null) {
            cao.fazerAniversário();
            System.out.println(cao + " - Aniversário feito!");
        } else {
            System.out.println("Nenhum cão disponível para fazer aniversário.");
        }
    }

    private static void fazerAniversarioGato() {
        if (gato != null) {
            gato.fazerAniversário();
            System.out.println(gato + " - Aniversário feito!");
        } else {
            System.out.println("Nenhum gato disponível para fazer aniversário.");
        }
    }

    private static void latirCao() {
        if (cao != null) {
            cao.latir();
        } else {
            System.out.println("Nenhum cão disponível para latir.");
        }
    }

    private static void miarGato() {
        if (gato != null) {
            gato.miar();
        } else {
            System.out.println("Nenhum gato disponível para miar.");
        }
    }

   private static void vigiarCao() { 
       if (cao != null) { 
           cao.vigiar(); 
       } else { 
           System.out.println("Nenhum cão disponível para vigiar."); 
       } 
   } 

   private static void relaxarCao() { 
       if (cao != null) { 
           cao.relaxar(); 
       } else { 
           System.out.println("Nenhum cão disponível para relaxar."); 
       } 
   } 

   private static void subirMuroGato() { 
       if (gato != null) { 
           gato.subirMuro(); 
       } else { 
           System.out.println("Nenhum gato disponível para subir no muro."); 
       } 
   } 

   private static void descerMuroGato() { 
       if (gato != null) { 
           gato.descerMuro(); 
       } else { 
           System.out.println("Nenhum gato disponível para descer do muro."); 
       } 
   } 

   private static void morrerAnimal() { 
       System.out.print("Digite 'c' para matar o cão ou 'g' para matar o gato: "); 
       char tipoAnimal = scanner.next().charAt(0); 

       if (tipoAnimal == 'c' && cao != null) { 
           cao.morrer(); 
           System.out.println(cao + " - O cão morreu."); 
           cao = null; // Remove a referência após a morte 
       } else if (tipoAnimal == 'g' && gato != null) { 
           gato.morrer(); 
           System.out.println(gato + " - O gato morreu."); 
           gato = null; // Remove a referência após a morte 
       } else { 
           System.out.println("Animal não encontrado ou opção inválida."); 
       } 
   }

   private static void exibirEstado() { 
       if (cao != null) { 
           System.out.println(cao); 
       } else { 
           System.out.println("Nenhum cão disponível."); 
       } 

       if (gato != null) { 
           System.out.println(gato); 
       } else { 
           System.out.println("Nenhum gato disponível."); 
       } 
   }
}
