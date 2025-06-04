package util;

public class ClassJogadores {
    public int id;
    public String nome;
    public String posicao;
    public String camisa;
    public int idade;
    public String cpf;
    public String nacionalidade;
    public float valor_mercado;
    public Habilidade habilidade;

    public ClassJogadores(int id, String nome, String posicao, String camisa, int idade,
                          String cpf, String nacionalidade, float valor_mercado,
                          Habilidade habilidade) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
        this.idade = idade;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.valor_mercado = valor_mercado;
        this.habilidade = habilidade;
    }

    public ClassJogadores(String nome, String posicao, String camisa, int idade,
                          String cpf, String nacionalidade, float valor_mercado,
                          Habilidade habilidade) {
        this(-1, nome, posicao, camisa, idade, cpf, nacionalidade, valor_mercado, habilidade); // ID temporário
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String toCSV() {
        return id + ";" + nome + ";" + posicao + ";" + camisa + ";" +
               idade + ";" + cpf + ";" + nacionalidade + ";" +
               valor_mercado + ";" + habilidade.chute + ";" + habilidade.passe + ";" +
               habilidade.marcacao + ";" + habilidade.drible + ";" + habilidade.reflexo;
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
