import util.ClassJogadores;
import java.util.Scanner;

public class CadastroJogador {

    public static ClassJogadores cadastrarNovoJogador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Jogador ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Posição: ");
        String posicao = scanner.nextLine();

        System.out.print("Número da camisa: ");
        String camisa = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();

        System.out.print("Valor de mercado: ");
        float valor_mercado = scanner.nextFloat();

        System.out.println("\n=== Atributos de Habilidade ===");

        System.out.print("Chute (0-100): ");
        int chute = scanner.nextInt();

        System.out.print("Passe (0-100): ");
        int passe = scanner.nextInt();

        System.out.print("Marcação (0-100): ");
        int marcacao = scanner.nextInt();

        System.out.print("Drible (0-100): ");
        int drible = scanner.nextInt();

        System.out.print("Reflexo (0-100): ");
        int reflexo = scanner.nextInt();

        ClassJogadores.Habilidade habilidade = new ClassJogadores.Habilidade(
            chute, passe, marcacao, drible, reflexo
        );

        // Aqui está o retorno correto
        return new ClassJogadores(nome, posicao, camisa, idade, cpf, nacionalidade, valor_mercado, habilidade);
    }
}
