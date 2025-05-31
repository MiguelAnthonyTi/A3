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

