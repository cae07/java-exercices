public class Livro {
  private String titulo;
  private int numeroDePaginas;
  private String isbn;

  public int retornarNumeroDePaginas() {
    return numeroDePaginas;
  }

  public void setPaginas(int number) {
    this.numeroDePaginas = number;
  }
}