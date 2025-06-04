package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListarJogadores {

    public static void listarJogadores() {
        try (BufferedReader leitor = new BufferedReader(new FileReader("data/jogadores.txt"))) {
            String linha;
            boolean temJogadores = false;

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos.length >= 8) {  
                    temJogadores = true;

                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    String posicao = campos[2];
                    String camisa = campos[3];
                    int idade = Integer.parseInt(campos[4]);
                    String cpf = campos[5];
                    String nacionalidade = campos[6];
                    float valorMercado = Float.parseFloat(campos[7]);

                    System.out.println("---------------------------");
                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Posição: " + posicao);
                    System.out.println("Camisa: " + camisa);
                    System.out.println("Idade: " + idade);
                    System.out.println("CPF: " + cpf);
                    System.out.println("Nacionalidade: " + nacionalidade);
                    System.out.println("Valor de Mercado: R$ " + valorMercado);
                }
            }

            if (!temJogadores) {
                System.out.println("Nenhum jogador cadastrado.");
            } else {
                System.out.println("---------------------------");
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
