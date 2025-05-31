# Transferências de Jogadores - Sistema em Java

## Descrição

Este projeto é um sistema simples em Java que simula uma janela de transferências para um time de futebol. Ele permite gerenciar jogadores através de uma estrutura orientada a objetos, com as principais operações:

- Comprar jogadores
- Vender jogadores
- Emprestar jogadores
- Aposentar jogadores

O sistema é composto por duas classes principais:
- **Jogador**: Representa um jogador com seus atributos e status.
- **Time**: Representa o time que gerencia os jogadores, contendo métodos para realizar as operações da janela de transferências.

---

## Armazenamento de Dados

Todos os registros dos jogadores são salvos em um arquivo CSV chamado `data_jogadores.csv`, que fica dentro da pasta `data` no diretório do projeto.  

Este arquivo armazena todas as informações dos jogadores, garantindo persistência dos dados entre execuções do programa.

---

## Funcionalidades

- **Adicionar Jogador** (Compra): Adiciona um novo jogador ao elenco.
- **Vender Jogador**: Remove um jogador do elenco e o marca como vendido.
- **Emprestar Jogador**: Marca um jogador como emprestado, podendo ser gerenciado separadamente.
- **Aposentar Jogador**: Marca um jogador como aposentado, removendo-o do elenco ativo.

---

## CRUD no Sistema

Este sistema segue o padrão CRUD para gerenciar os jogadores:

| Operação CRUD | Ação no sistema             | Descrição                                         |
|---------------|----------------------------|--------------------------------------------------|
| **Create**    | Comprar jogador            | Cria e adiciona um novo jogador ao elenco.       |
| **Read**      | Listar jogadores           | Consulta e exibe informações dos jogadores ativos, emprestados ou aposentados. |
| **Update**    | Emprestar / Aposentar      | Atualiza o status do jogador (ex: para emprestado ou aposentado). |
| **Delete**    | Vender jogador             | Remove o jogador do elenco ativo, simulando a venda. |

---

## Estrutura do Projeto

src/

Main.java # Classe principal para execução do sistema

util/       

Jogador.java # Classe que representa um jogador
Time.java # Classe que representa o time e gerencia os jogadores    

data/

data_jogadores.csv # Arquivo onde os dados dos jogadores são armazenados

---

## Como usar

1. Clone este repositório
2. Compile os arquivos `.java`:

```bash
javac src/*.java
