/**
 * mainFile
 */
public class MainFile {

  public static void main(String[] args) { 
    Livro livro = new Livro();
    livro.setPaginas(10);
    int numeroDePaginas = livro.retornarNumeroDePaginas();
    System.out.println("numero de paginas");
    System.out.println(numeroDePaginas);
  }
}
