package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BuscarJogador {

    public static void buscarPorId(Scanner scanner) {
        System.out.print("\nDigite o ID do jogador que deseja buscar: ");
        int idBuscado = scanner.nextInt();
        scanner.nextLine();
        
        boolean encontrado = false;

        try (BufferedReader leitor = new BufferedReader(new FileReader("data/jogadores.txt"))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos.length >= 13) {
                    int id = Integer.parseInt(campos[0]);

                    if (id == idBuscado) {
                        encontrado = true;

                        String nome = campos[1];
                        String posicao = campos[2];
                        String camisa = campos[3];
                        int idade = Integer.parseInt(campos[4]);
                        String cpf = campos[5];
                        String nacionalidade = campos[6];
                        float valorMercado = Float.parseFloat(campos[7]);

                        int chute = Integer.parseInt(campos[8]);
                        int passe = Integer.parseInt(campos[9]);
                        int marcacao = Integer.parseInt(campos[10]);
                        int drible = Integer.parseInt(campos[11]);
                        int reflexo = Integer.parseInt(campos[12]);

                        ClassJogadores.Habilidade habilidade = new ClassJogadores.Habilidade(
                            chute, passe, marcacao, drible, reflexo
                        );

                        ClassJogadores jogador = new ClassJogadores(
                            id, nome, posicao, camisa, idade, cpf, nacionalidade, valorMercado, habilidade
                        );

                        imprimirJogador(jogador);
                        break;
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Jogador com ID " + idBuscado + " não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static void imprimirJogador(ClassJogadores j) {
        System.out.println("\n--- Dados do Jogador ---");
        System.out.println("ID: " + j.id);
        System.out.println("Nome: " + j.nome);
        System.out.println("Posição: " + j.posicao);
        System.out.println("Camisa: " + j.camisa);
        System.out.println("Idade: " + j.idade);
        System.out.println("CPF: " + j.cpf);
        System.out.println("Nacionalidade: " + j.nacionalidade);
        System.out.println("Valor de Mercado: R$ " + j.valor_mercado);
        System.out.println("Habilidades:");
        System.out.println("  Chute: " + j.habilidade.chute);
        System.out.println("  Passe: " + j.habilidade.passe);
        System.out.println("  Marcação: " + j.habilidade.marcacao);
        System.out.println("  Drible: " + j.habilidade.drible);
        System.out.println("  Reflexo: " + j.habilidade.reflexo);
        System.out.println("------------------------\n");
    }
}
