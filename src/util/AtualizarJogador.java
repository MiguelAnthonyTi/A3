package util;

import java.io.*;
import java.util.Scanner;

public class AtualizarJogador {

    public static void atualizarDados(Scanner scanner) {
        System.out.print("Digite o ID do jogador que deseja atualizar: ");
        String id = scanner.nextLine();

        File arquivo = new File("data/jogadores.txt");
        File temp = new File("data/temp.txt");

        boolean encontrado = false;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp))
        ) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(";");
                if (campos[0].equals(id)) {
                    encontrado = true;

                    System.out.println("\nAtualizando jogador: " + campos[1] + " (ID " + campos[0] + ")");
                    System.out.println("Pressione Enter para manter o valor atual.");

                    System.out.print("Nome (" + campos[1] + "): ");
                    String novoNome = scanner.nextLine();
                    if (novoNome.isEmpty()) novoNome = campos[1];

                    System.out.print("Posição (" + campos[2] + "): ");
                    String novaPosicao = scanner.nextLine();
                    if (novaPosicao.isEmpty()) novaPosicao = campos[2];

                    System.out.print("Camisa (" + campos[3] + "): ");
                    String novaCamisa = scanner.nextLine();
                    if (novaCamisa.isEmpty()) novaCamisa = campos[3];

                    System.out.print("Idade (" + campos[4] + "): ");
                    String novaIdade = scanner.nextLine();
                    if (novaIdade.isEmpty()) novaIdade = campos[4];

                    System.out.print("CPF (" + campos[5] + "): ");
                    String novoCpf = scanner.nextLine();
                    if (novoCpf.isEmpty()) novoCpf = campos[5];

                    System.out.print("Nacionalidade (" + campos[6] + "): ");
                    String novaNacionalidade = scanner.nextLine();
                    if (novaNacionalidade.isEmpty()) novaNacionalidade = campos[6];

                    System.out.print("Valor de mercado (" + campos[7] + "): ");
                    String novoValorMercado = scanner.nextLine();
                    if (novoValorMercado.isEmpty()) novoValorMercado = campos[7];

                    String chute = campos.length > 8 ? campos[8] : "0";
                    String passe = campos.length > 9 ? campos[9] : "0";
                    String marcacao = campos.length > 10 ? campos[10] : "0";
                    String drible = campos.length > 11 ? campos[11] : "0";
                    String reflexo = campos.length > 12 ? campos[12] : "0";

                    System.out.print("Chute (" + chute + "): ");
                    String novoChute = scanner.nextLine();
                    if (novoChute.isEmpty()) novoChute = chute;

                    System.out.print("Passe (" + passe + "): ");
                    String novoPasse = scanner.nextLine();
                    if (novoPasse.isEmpty()) novoPasse = passe;

                    System.out.print("Marcação (" + marcacao + "): ");
                    String novaMarcacao = scanner.nextLine();
                    if (novaMarcacao.isEmpty()) novaMarcacao = marcacao;

                    System.out.print("Drible (" + drible + "): ");
                    String novoDrible = scanner.nextLine();
                    if (novoDrible.isEmpty()) novoDrible = drible;

                    System.out.print("Reflexo (" + reflexo + "): ");
                    String novoReflexo = scanner.nextLine();
                    if (novoReflexo.isEmpty()) novoReflexo = reflexo;

                    String novaLinha = id + ";" + novoNome + ";" + novaPosicao + ";" + novaCamisa + ";" + novaIdade + ";" +
                            novoCpf + ";" + novaNacionalidade + ";" + novoValorMercado + ";" +
                            novoChute + ";" + novoPasse + ";" + novaMarcacao + ";" + novoDrible + ";" + novoReflexo;

                    writer.write(novaLinha);
                    writer.newLine();
                    System.out.println("Jogador atualizado com sucesso!\n");
                } else {
                    writer.write(linha);
                    writer.newLine();
                }
            }

            if (!encontrado) {
                System.out.println("Jogador com ID " + id + " não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o jogador: " + e.getMessage());
        }

        if (arquivo.delete()) {
            temp.renameTo(arquivo);
        } else {
            System.out.println("Erro ao substituir o arquivo original.");
        }
    }
}
