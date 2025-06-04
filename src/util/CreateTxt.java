package util;
import java.util.ArrayList;
import java.io.*;

    public class CreateTxt {
            public static void incluiJogador() {
            ArrayList<ClassJogadores> jogadores = new ArrayList<>();
            int novoId = lerUltimoId() + 1;

            ClassJogadores jogador = CadastroJogador.cadastrarNovoJogador();

            if (jogador != null) {
                jogadores.add(new ClassJogadores(
                    novoId, jogador.nome, jogador.posicao, jogador.camisa, jogador.idade,
                    jogador.cpf, jogador.nacionalidade, jogador.valor_mercado, jogador.habilidade
                ));
                System.out.println("Jogador cadastrado com sucesso!\n");
                salvarUltimoId(novoId); 
            } else {
                System.out.println("Jogador não foi cadastrado corretamente.");
            }

            try {
                FileWriter escritor = new FileWriter("data/jogadores.txt", true);
                for (ClassJogadores j : jogadores) {
                    String linha = j.id + ";" +
                                j.nome + ";" +
                                j.posicao + ";" +
                                j.camisa + ";" +
                                j.idade + ";" +
                                j.cpf + ";" +
                                j.nacionalidade + ";" +
                                j.valor_mercado + ";";
                    if (j.habilidade != null) {
                        linha += j.habilidade.chute + ";" +
                                j.habilidade.passe + ";" +
                                j.habilidade.marcacao + ";" +
                                j.habilidade.drible + ";" +
                                j.habilidade.reflexo;
                    } else {
                        linha += "0;0;0;0;0";
                    }

                    escritor.write(linha + "\n");
                }
                escritor.close();
                System.out.println("Dados do jogador salvos com sucesso.");
            } catch (Exception e) {
                System.out.println("Erro ao salvar os dados do jogador: " + e.getMessage());
            }
        }

        public static int lerUltimoId() {
            try {
                BufferedReader leitor = new BufferedReader(new FileReader("data/ultimo_id.txt"));
                String linha = leitor.readLine();
                leitor.close();
                return Integer.parseInt(linha.trim());
            } catch (Exception e) {
                System.out.println("Arquivo de ID não encontrado ou inválido. Começando do 0.");
                return 0;
            }
        }

        public static void salvarUltimoId(int id) {
            try {
                FileWriter escritor = new FileWriter("data/ultimo_id.txt", false);
                escritor.write(String.valueOf(id));
                escritor.close();
            } catch (Exception e) {
                System.out.println("Erro ao salvar o novo ID: " + e.getMessage());
            }
        }
    }
