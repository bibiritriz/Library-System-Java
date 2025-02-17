package src.main.java.com.bibiritriz.biblioteca;

import java.util.Scanner;
import src.main.java.com.bibiritriz.biblioteca.model.Livro;
import src.main.java.com.bibiritriz.biblioteca.service.Biblioteca;

public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Scanner ler = new Scanner(System.in);
    int opcao = 0;

    while (opcao != 8) {
      System.out.println("====================================");
      System.out.println("          Biblioteca Virtual         ");
      System.out.println("====================================");
      System.out.println("1 - Adicionar livro");
      System.out.println("2 - Remover livro");
      System.out.println("3 - Buscar livros");
      System.out.println("4 - Listar livros");
      System.out.println("5 - Emprestar livro");
      System.out.println("6 - Devolver livro");
      System.out.println("7 - Listar livros emprestados");
      System.out.println("8 - Encerrar");
      System.out.println("====================================");
      System.out.print("Escolha uma opção: ");

      opcao = ler.nextInt();

      String isbn = "";
      String titulo = "";
      String autor = "";
      String termo = "";
      String usuario = "";

      switch (opcao) {
        case 1:
          ler.nextLine();

          System.out.println("\n-- Adicionar Livro --");
          System.out.println("Qual o ISBN do livro?");
          isbn = ler.nextLine();

          System.out.println("Qual o título do livro?");
          titulo = ler.nextLine();

          System.out.println("Qual o autor do livro?");
          autor = ler.nextLine();

          Livro livro = new Livro(isbn, titulo, autor);

          biblioteca.adicionarLivros(livro);

          System.out.println("Livro adicionado com sucesso!");
          break;
        case 2:
          ler.nextLine();

          System.out.println("\n-- Remover Livro --");
          System.out.println("Qual o ISBN do livro que deseja remover?");
          isbn = ler.nextLine();

          biblioteca.removerLivro(isbn);
          System.out.println("Livro removido com sucesso!");
          break;
        case 3:
          ler.nextLine();

          System.out.println("\n-- Buscar Livro --");
          System.out.println("Qual termo?");
          termo = ler.nextLine();

          biblioteca.buscarLivro(termo);
          break;
        case 4:
          System.out.println("\n-- Listar Livros --");
          biblioteca.listarLivros();
          break;
        case 5:
          ler.nextLine();

          System.out.println("\n-- Emprestar Livro --");
          System.out.println("Qual o ISBN do livro emprestado?");
          isbn = ler.nextLine();

          System.out.println("Qual o usuário?");
          usuario = ler.nextLine();

          biblioteca.emprestarLivro(isbn, usuario);

          System.out.println("Livro emprestado com sucesso!");
          break;
        case 6:
          ler.nextLine();

          System.out.println("\n-- Devolver Livro --");
          System.out.println("Qual o ISBN do livro devolvido?");
          isbn = ler.nextLine();

          biblioteca.devolverLivro(isbn);

          System.out.println("Livro devolvido com sucesso!");
          break;
        case 7:
          System.out.println("\n-- Livros Emprestados --");
          biblioteca.listarLivrosEmprestados();
          break;
        default:
          System.out.println("\nOpção inválida! Tente novamente.");
          break;
      }
    }
    ler.close();
  }
}
