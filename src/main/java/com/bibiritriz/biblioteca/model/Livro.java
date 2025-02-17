package src.main.java.com.bibiritriz.biblioteca.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {
  private DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  private String titulo;
  private String autor;
  private String isbn;
  private boolean emprestado;
  private String usuarioEmprestimo;
  private String dataEmprestimo;

  public Livro(String isbn, String titulo, String autor) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.emprestado = false;
    this.usuarioEmprestimo = null;
    this.dataEmprestimo = null;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public boolean isEmprestado() {
    return emprestado;
  }

  public void setEmprestado(boolean emprestado) {
    this.emprestado = emprestado;
  }

  public String getUsuarioEmprestimo() {
    return usuarioEmprestimo;
  }

  public void setUsuarioEmprestimo(String usuarioEmprestimo) {
    this.usuarioEmprestimo = usuarioEmprestimo;
  }

  public String getDataEmprestimo() {
    return dataEmprestimo;
  }

  public void setDataEmprestimo(String dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
  }

  public void emprestar(String usuario) {
    this.emprestado = true;
    this.usuarioEmprestimo = usuario;
    LocalDate dataAmericana = LocalDate.now();
    this.dataEmprestimo = dataAmericana.format(formatoBrasileiro);
  }

  public void devolver() {
    this.emprestado = false;
    this.usuarioEmprestimo = null;
    this.dataEmprestimo = null;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(" - Nome do livro: ").append(titulo).append("\n").append(" - Autor: ").append(autor)
        .append("\n").append(" - ISBN: ").append(isbn).append("\n").append(" - Status: ")
        .append(emprestado ? "Emprestado" : "Disponível").append("\n");

    if (emprestado) {
      sb.append(" - Usuário: ").append(usuarioEmprestimo).append("\n")
          .append(" - Data do empréstimo: ").append(dataEmprestimo).append("\n");
    }
    return sb.toString();
  }
}
