/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Jogo {
    /**
     * cria um objeto dado
     */
    
    
    int general = 0;
    int numJogadas = 0;
    
    Jogador jg1 = new Jogador("Pedro",20);
    Jogador jg2 = new Jogador("Juliana", 25);
    Jogador jg3 = new Jogador("Maria",45);
    Jogador jg4 = new Jogador("Karol", 23);
    Jogador jg5 = new Jogador("Barbara", 14);
 
    public void iniciaJogo(){
        int aux = 0;
        int numRep = 5; 
       while(aux < 3 && numRep != 0){
           
            jg1.setDados(numRep);
            if(aux < 2){
                System.out.println("Digite quantos dados quer jogar novamente");
                Scanner numRepe = new Scanner(System.in);
                numRep = numRepe.nextInt();
            }
            jg1.setPontuacao(numJogadas);
            aux++;
       }
        
       
        //jg2.setDados(5);
       
        //jg3.setDados(5);
       
        //jg4.setDados(5);
       
        //jg5.setDados(5);
       

    }
}
