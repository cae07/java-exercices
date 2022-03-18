/**
 * loopWhile
 */
public class loopWhile {

  public static void main(String[] args) {
    
    String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA", "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };
    
    final int numeroDeVagas = 10;
    // A palavra `final` determina que o valor dessa variável não é alterável, ele 
      // passa a ser uma constante! 
    
    String[] vagas = new String[numeroDeVagas];
    
    int vagaAtual = 0;
    
    String inscrito = "Indefinido";
    String log;
    
    while (vagaAtual < numeroDeVagas) {
      inscrito = inscritos[vagaAtual];
      log = "Adicionando a inscrição: " + inscrito + " na vaga " + (vagaAtual + 1) + "\n";
      vagas[vagaAtual] = inscrito;
      vagaAtual += 1;
      System.out.println(log);
    }
  }
}
