package util;

public class ClassJogadores { 
    public String nome; 
    public String posicao; 
    public String camisa;
    public int idade; 
    public String cpf; 
    public String nacionalidade; 
    public float valor_mercado;
    public Habilidade habilidade;

    // Construtor
    public ClassJogadores(String nome, String posicao, String camisa, int idade,
                          String cpf, String nacionalidade, float valor_mercado,
                          Habilidade habilidade) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
        this.idade = idade;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.valor_mercado = valor_mercado;
        this.habilidade = habilidade;
    }

    public static class Habilidade {
        public int chute;
        public int passe;
        public int marcacao;
        public int drible;
        public int reflexo;

        public Habilidade(int chute, int passe, int marcacao, int drible, int reflexo) {
            this.chute = chute;
            this.passe = passe;
            this.marcacao = marcacao;
            this.drible = drible;
            this.reflexo = reflexo;
        }
    }
}
