
package poo;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
       ContaBanco C1 = new ContaBanco();
       C1.setDono("Jubileu");
       C1.setNumConta(8412);
       C1.abrirConta("CC");
       C1.depositar(100);
       C1.estadoAtual();
       
        
        
   
      
     
        
        
    }
    
}
