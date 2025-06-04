import java.util.Scanner;

import util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nBem-vindo ao sistema de gerenciamento de jogadores!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar novo jogador");
            System.out.println("2. Listar jogadores cadastrados");
            System.out.println("3. Buscar jogador por ID");
            System.out.println("4. Atualizar jogador");
            System.out.println("5. Demitir jogador");
            System.out.println("6. Sair");

            System.out.print("Opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next();            }

            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    CreateTxt.incluiJogador();
                    break;
                case 2:
                    ListarJogadores.listarJogadores();
                    break;
                case 3:
                    BuscarJogador.buscarPorId(scanner);
                    break;
                case 4:
                    AtualizarJogador.atualizarDados(scanner);
                    break;
                case 5:
                    DemitirJogador.demitirJogador(scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema. Até logo!\n");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
                System.out.println("Carregando o sistema, aguarde...\n");

        } while (opcao != 6);

        scanner.close();
    }
}
