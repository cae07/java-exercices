/**
 * LoopFor
 */
public class LoopFor {

  public static void main(String[] args) {
    int numero; 
    String log; 
     
    // Leia como: PARA numero = 1, contanto que numero <= 10, faça o loop e depois 
    // faça numero += 1! 
    for (numero = 1; numero <= 10; numero += 1) { 
        log = "O Número atual é: " + numero + "\n"; 
        System.out.println(log); 
    }
  }
}