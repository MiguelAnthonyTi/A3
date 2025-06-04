# Gerenciador de Jogadores - Sistema em Java

## Descrição

Este projeto é um sistema simples em Java que permite gerenciar jogadores de futebol, simulando um banco de dados em arquivos `.txt`. Ele utiliza uma estrutura orientada a objetos e funcionalidades de persistência de dados para realizar operações como:

- Cadastrar jogadores
- Listar jogadores
- Buscar jogador por ID
- Atualizar dados de um jogador
- Demitir (deletar) um jogador

O sistema é dividido em classes que organizam a lógica do CRUD e o armazenamento em arquivos, permitindo operações simples sem banco de dados.

---

## Armazenamento de Dados

Todos os dados dos jogadores são armazenados em um arquivo chamado `jogadores.txt`, localizado dentro da pasta `data` no diretório do projeto.

Além disso, o último ID gerado é armazenado em `ultimo_id.txt`, garantindo que os jogadores não tenham IDs duplicados.

---

## Funcionalidades

- **Cadastrar Jogador**: Insere um novo jogador no arquivo `jogadores.txt`, atribuindo um ID único.
- **Listar Jogadores**: Lê o arquivo `jogadores.txt` e exibe todos os jogadores registrados.
- **Buscar Jogador por ID**: Pesquisa por um jogador específico através do seu ID.
- **Atualizar Jogador**: Permite editar os dados de um jogador com base no ID.
- **Demitir Jogador**: Remove o jogador do arquivo com base no ID.

---

## CRUD no Sistema

| Operação CRUD | Ação no sistema       | Descrição                                                             |
|---------------|------------------------|------------------------------------------------------------------------|
| **Create**    | Cadastrar jogador     | Cria e adiciona um novo jogador ao arquivo.                           |
| **Read**      | Listar / Buscar       | Consulta e exibe informações dos jogadores cadastrados.               |
| **Update**    | Atualizar jogador     | Atualiza os dados de um jogador existente com base no ID.             |
| **Delete**    | Demitir jogador       | Remove um jogador do arquivo de registros permanentes.                |

---

## Estrutura do Projeto

```
projeto_a3_montanha/
│
├── src/
│   ├── Main.java                   # Classe principal com o menu de opções
│   ├── CreateTxt.java             # Responsável por cadastrar novos jogadores
│   ├── ListarJogadores.java       # Lê e lista todos os jogadores
│   ├── BuscarJogador.java         # Busca jogador pelo ID
│   ├── AtualizarJogador.java      # Permite atualizar dados de um jogador
│   ├── DemitirJogador.java        # Remove jogador com base no ID
│   └── util/
│       └── ClassJogadores.java    # Classe que define o objeto Jogador e habilidades
│
├── data/
│   ├── jogadores.txt              # Base de dados principal
│   └── ultimo_id.txt              # Controle do último ID utilizado
```

---

## Como Usar

1. Clone este repositório para sua máquina local.
2. Compile os arquivos `.java`:

```bash
javac src/*.java src/util/*.java
```

3. Execute o programa principal:

```bash
java -cp src Main
```

---

## Observações

- O projeto é orientado para aprendizado de Java básico, com foco em manipulação de arquivos.
- Todos os dados são persistidos localmente, sem necessidade de banco de dados.
- O programa trata entradas inválidas e evita erros comuns como parse de strings vazias.

