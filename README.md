# Sistema de Gerenciamento de Biblioteca

Este projeto implementa um sistema simples de gerenciamento de biblioteca em Java, utilizando uma estrutura de classes para representar livros e uma biblioteca com funcionalidades para empréstimo e devolução de livros.

## 📂 Estrutura do Projeto

### 📘 Classe `Livro`

Representa um livro com os seguintes atributos e métodos:

#### **Atributos:**
- `String titulo`: Título do livro.
- `String autor`: Autor do livro.
- `String isbn`: Código ISBN do livro.
- `boolean emprestado`: Indica se o livro está emprestado.
- `String usuarioEmprestimo`: Nome do usuário que realizou o empréstimo.
- `LocalDate dataEmprestimo`: Data do empréstimo.

#### **Métodos:**
- Getters e Setters para todos os atributos.
- `emprestar(String usuario)`: Marca o livro como emprestado e armazena o usuário e a data do empréstimo.
- `devolver()`: Marca o livro como disponível para empréstimo.

---

### 📚 Classe `Biblioteca`

Gerencia uma coleção de livros e suas operações.

#### **Atributos:**
- `List<Livro> livros`: Lista de livros na biblioteca.

#### **Métodos:**
- `adicionarLivro(Livro livro)`: Adiciona um livro à coleção.
- `removerLivro(String isbn)`: Remove um livro da coleção pelo ISBN.
- `buscarLivro(String termo)`: Busca livros pelo título ou autor.
- `emprestarLivro(String isbn, String usuario)`: Empresta um livro pelo ISBN a um usuário.
- `devolverLivro(String isbn)`: Devolve um livro pelo ISBN.
- `listarLivros()`: Lista todos os livros da biblioteca.
- `listarLivrosEmprestados()`: Lista todos os livros atualmente emprestados.

---

### 🖥️ Classe `Main`

Fornece uma interface de linha de comando para interagir com o sistema de biblioteca. Os usuários podem adicionar, remover, buscar, emprestar e devolver livros, além de listar os livros disponíveis e os emprestados.

---

## 🛠️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
2. Compile o projeto usando o terminal ou seu ambiente de desenvolvimento.

3. Execute a classe `Main` para interagir com o sistema por meio da linha de comando.

## 🚀 Funcionalidades

- Adicionar e remover livros da biblioteca.
- Buscar livros pelo título ou autor.
- Emprestar e devolver livros.
- Listar todos os livros ou apenas os livros emprestados.
