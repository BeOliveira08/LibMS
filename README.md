# LibMS

Um simples sistema de biblioteca em Java para cadastro, busca, empréstimo e devolução de livros, com persistência em arquivo CSV.

## Funcionalidades

- Adicionar livro
- Listar todos os livros
- Buscar livro por título ou autor
- Emprestar livro
- Devolver livro
- Persistência dos dados em `data/books.csv`

## Estrutura do Projeto

```
BiblioMS/
│
├── src/
│   ├── Main.java
│   ├── Library.java
│   ├── Book.java
│   └── FileManager.java
│
└── data/
    └── books.csv
```

## Como Usar

1. **Compile os arquivos Java:**
   ```sh
   javac -d bin src/*.java
   ```

2. **Execute o programa:**
   ```sh
   java -cp bin Main
   ```

3. **Siga o menu interativo para gerenciar os livros.**

## Detalhes Técnicos

- Os livros são salvos no arquivo `data/books.csv` automaticamente após cada alteração (adição, empréstimo ou devolução).
- O arquivo CSV armazena: `id`, `título`, `autor`, `disponibilidade`.

## Exemplo de Uso

```
=== Sistema de Biblioteca ===
1. Adicionar Livro
2. Listar Todos os Livros
3. Buscar Livro
4. Emprestar Livro
5. Devolver Livro
0. Sair
Opção: 1
ID: 001
Título: O Senhor dos Anéis
Autor: J.R.R. Tolkien
Livro adicionado!
```

## Requisitos

- Java 8 ou superior

## Observações

- Certifique-se de que a pasta `data/` existe na raiz do projeto para evitar erros ao salvar os livros.
- O arquivo `books.csv` pode ser editado manualmente, mas siga o formato:  
  `id,título,autor,disponibilidade`

---

Desenvolvido por Bernardo Oliveira
