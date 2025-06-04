package util;

import java.io.*;
import java.util.Scanner;

public class DemitirJogador {

    public static void demitirJogador(Scanner scanner) {
        System.out.print("Digite o ID do jogador que deseja demitir: ");
        String id = scanner.nextLine().trim();

        if (id.isEmpty()) {
            System.out.println("ID inválido. Operação cancelada.");
            return;
        }

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
                    System.out.println("Jogador com ID " + id + " removido com sucesso.");
                    continue;
                }
                writer.write(linha);
                writer.newLine();
            }

            if (!encontrado) {
                System.out.println("Jogador com ID " + id + " não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao demitir jogador: " + e.getMessage());
        }

        if (arquivo.delete()) {
            temp.renameTo(arquivo);
        } else {
            System.out.println("Erro ao substituir o arquivo original.");
        }
    }
}
 