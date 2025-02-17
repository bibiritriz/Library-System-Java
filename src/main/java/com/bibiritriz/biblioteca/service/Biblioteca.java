package src.main.java.com.bibiritriz.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
import src.main.java.com.bibiritriz.biblioteca.model.Livro;

public class Biblioteca {
  private List<Livro> livros;

  public Biblioteca() {
    livros = new ArrayList<>();
  }

  private Livro buscarLivroPorIsbn(String isbn) {
    for (Livro livro : livros) {
      if (livro.getIsbn().equals(isbn)) {
        return livro;
      }
    }
    return null;
  }

  public void adicionarLivros(Livro livro) {
    livros.add(livro);
  }

  public void removerLivro(String isbn) {
    Livro livro = buscarLivroPorIsbn(isbn);
    if (livro == null) {
      return;
    }
    livros.remove(livro);
  }

  public void listarLivros() {
    for (Livro livro : livros) {
      System.out.println(livro.toString());
    }
  }

  public void buscarLivro(String termo) {
    for (Livro livro : livros) {
      if (livro.getTitulo().toLowerCase().contains(termo.toLowerCase())
          || livro.getAutor().toLowerCase().contains(termo.toLowerCase())) {
        System.out.println(livro.toString());
      }
    }
  }

  public void emprestarLivro(String isbn, String usuario) {
    Livro livro = buscarLivroPorIsbn(isbn);
    if (livro == null) {
      return;
    }

    if (!livro.isEmprestado()) {
      livro.emprestar(usuario);
    }
  }

  public void devolverLivro(String isbn) {
    Livro livro = buscarLivroPorIsbn(isbn);
    if (livro == null) {
      return;
    }
    livro.devolver();
  }

  public void listarLivrosEmprestados() {
    for (Livro livro : livros) {
      if (livro.isEmprestado()) {
        System.out.println(livro.toString());
      }
    }
  }
}

