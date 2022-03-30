/**
 * ForInArray
 */
public class ForInArray {

  public static void main(String[] args) {
    String[] alunos = { "Marcos", "Carol", "Lucas", "Patricia"};
    String log;

    int totalAlunos = alunos.length;

    log = "A lista de chamadas possui " + totalAlunos + " alunos\n";
    System.out.println(log);

    int matricula;
    for (int posicao = 0; posicao < totalAlunos; posicao += 1) {
      matricula = posicao + 1;
      log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
      System.out.println(log);
    }
  }
}
