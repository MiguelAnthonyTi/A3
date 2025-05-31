import util.ClassJogadores;

public class Main {
    public static void main(String[] args) {
        ClassJogadores jogador = CadastroJogador.cadastrarNovoJogador();

        if (jogador == null) {
            System.out.println("Jogador não foi cadastrado corretamente.");
            return;
        }

        System.out.println("\n=== Jogador Cadastrado ===");
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Posição: " + jogador.posicao);
        System.out.println("Camisa: " + jogador.camisa);
        System.out.println("Idade: " + jogador.idade);
        System.out.println("CPF: " + jogador.cpf);
        System.out.println("Nacionalidade: " + jogador.nacionalidade);
        System.out.println("Valor de Mercado: R$" + jogador.valor_mercado);

        if (jogador.habilidade != null) {
            System.out.println("\n--- Habilidades ---");
            System.out.println("Chute: " + jogador.habilidade.chute);
            System.out.println("Passe: " + jogador.habilidade.passe);
            System.out.println("Marcação: " + jogador.habilidade.marcacao);
            System.out.println("Drible: " + jogador.habilidade.drible);
            System.out.println("Reflexo: " + jogador.habilidade.reflexo);
        } else {
            System.out.println("Habilidades não definidas.");
        }
    }
}
